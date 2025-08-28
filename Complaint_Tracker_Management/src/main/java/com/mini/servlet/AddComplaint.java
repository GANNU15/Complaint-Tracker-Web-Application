package com.mini.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.mini.dao.ComplaintDao;
import com.mini.model.Complaint;


@WebServlet("/addComplaint")
public class AddComplaint extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String flatNo = request.getParameter("flatNo");
		String issue = request.getParameter("issue");
		Complaint complaint = new Complaint(name,flatNo,issue);
		ComplaintDao dao = new ComplaintDao();
		dao.insertComplaint(complaint);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("ResidentDashboard.jsp");
		requestDispatcher.forward(request, response);
	}

}
