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
import com.mini.dao.ResidentDao;
import com.mini.model.Complaint;
import com.mini.model.ResidentDetails;


@WebServlet("/pastComplaints")
public class PastComplaints extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		ResidentDetails resident = (ResidentDetails) request.getSession().getAttribute("resident");
		String flatNo = resident.getFlatNo();
		
		
		
		ComplaintDao dao = new ComplaintDao();
		
		List<Complaint> complaints = dao.allComplaintByFlatNo(flatNo);
		
		session.setAttribute("complaints", complaints);
		
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("PastComplaints.jsp");
		requestDispatcher.forward(request, response);
	}

}
