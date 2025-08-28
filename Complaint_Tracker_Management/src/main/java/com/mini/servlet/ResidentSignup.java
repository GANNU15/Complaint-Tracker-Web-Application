package com.mini.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.mini.dao.ResidentDao;
import com.mini.model.ResidentDetails;


@WebServlet("/residentSignup")
public class ResidentSignup extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String flatNo = request.getParameter("flatNo");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		ResidentDetails resident = new ResidentDetails(name,flatNo,mobile,email,password);
		
		ResidentDao dao = new ResidentDao();
		
		dao.signupResident(resident);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
		requestDispatcher.forward(request, response);
	}

}
