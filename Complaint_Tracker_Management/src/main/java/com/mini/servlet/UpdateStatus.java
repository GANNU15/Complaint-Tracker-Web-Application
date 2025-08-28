package com.mini.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.mini.dao.ComplaintDao;
import com.mini.model.Complaint;


@WebServlet("/updateStatus")
public class UpdateStatus extends HttpServlet {
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		ComplaintDao dao = new ComplaintDao();
		Complaint complaint = dao.getComplaint(id);
		
		HttpSession session = request.getSession();
		session.setAttribute("complaint", complaint);
		response.sendRedirect("UpdateStatus.jsp");
	}

}
