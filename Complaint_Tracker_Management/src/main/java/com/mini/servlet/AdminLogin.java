package com.mini.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.mini.dao.AdminDao;
import com.mini.model.AdminDetails;


@WebServlet("/adminLogin")
public class AdminLogin extends HttpServlet {
	
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		AdminDetails loginInfo = new AdminDetails(email,password);
		AdminDao dao = new AdminDao();
		AdminDetails admin = dao.loginAdmin(loginInfo);
		if(admin != null) {
			HttpSession session = request.getSession();
			session.setAttribute("admin", admin);
			
			response.sendRedirect("AdminDashboard.jsp");
		}
		else {
			request.setAttribute("error", "Invalid email or password");
	        RequestDispatcher rd = request.getRequestDispatcher("adminLogin.jsp");
	        rd.forward(request, response);
		}
	}

}
