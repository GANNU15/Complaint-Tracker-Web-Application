package com.mini.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.mini.dao.ComplaintDao;
import com.mini.model.Complaint;


@WebServlet("/viewComplaints")
public class ViewComplaints extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ComplaintDao dao = new ComplaintDao();
		List<Complaint> complaints = dao.viewComplaints();
		HttpSession session = request.getSession();
		session.setAttribute("complaints", complaints);
		
		response.sendRedirect("ViewComplaints.jsp");
	}

}
