package com.mini.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.mini.dao.ResidentDao;
import com.mini.model.ResidentDetails;

/**
 * Servlet implementation class ResidentLogin
 */
@WebServlet("/residentLogin")
public class ResidentLogin extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		ResidentDetails residentLogin = new ResidentDetails(email,password);
		ResidentDao dao = new ResidentDao();
		ResidentDetails resident = dao.loginResident(residentLogin);
		if(resident != null) {
			HttpSession session = request.getSession();
			session.setAttribute("resident", resident);
			
			response.sendRedirect("ResidentDashboard.jsp");
		}
		else {
			   request.setAttribute("error", "Invalid email or password");
		        RequestDispatcher rd = request.getRequestDispatcher("residentLogin.jsp");
		        rd.forward(request, response);
		}
	}

}
