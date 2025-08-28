package com.mini.servlet;

import jakarta.servlet.RequestDispatcher;
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
import com.mini.model.ResidentDetails;


@WebServlet("/complaints")
public class Complaints extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		ResidentDetails resident =(ResidentDetails)session.getAttribute("resident");
		String flatNo = resident.getFlatNo();
		
		ResidentDetails flat = new ResidentDetails(flatNo);
		ComplaintDao dao = new ComplaintDao();
		List<Complaint> complaints = dao.allComplaints(flat);
		session.setAttribute("complaints", complaints);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Complaints.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
