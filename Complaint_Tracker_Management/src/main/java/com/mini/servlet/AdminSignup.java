package com.mini.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.mini.dao.AdminDao;
import com.mini.model.AdminDetails;


@WebServlet("/adminSignup")
public class AdminSignup extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		AdminDetails admin = new AdminDetails(name,mobile,email,password);
		AdminDao dao = new AdminDao();
		
		dao.signupAdmin(admin);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
		requestDispatcher.forward(request, response);
	}

}
