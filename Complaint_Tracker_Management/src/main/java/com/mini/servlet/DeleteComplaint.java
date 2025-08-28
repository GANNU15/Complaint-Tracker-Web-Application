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


@WebServlet("/deleteComplaint")
public class DeleteComplaint extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String flatNo = request.getParameter("flatNo");
		
		Complaint delCom = new Complaint(id);
		ComplaintDao dao = new ComplaintDao();
		
		dao.deleteComplaint(delCom);
		
		
		ResidentDetails resident = new ResidentDetails(flatNo);
		List<Complaint> complaints = dao.allComplaints(resident);
		HttpSession session = request.getSession();
		session.setAttribute("complaints", complaints);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("UpdateAndDelete.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
