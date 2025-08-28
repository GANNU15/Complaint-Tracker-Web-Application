<%@page import="com.mini.model.AdminDetails"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <% AdminDetails admin = (AdminDetails) session.getAttribute("admin");
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dasboard</title>
</head>
<body>
	<h2 style="text-align: center;">Palm Meadows</h2>
	<br>
	<marquee>Welcome <%=  admin.getName()  %> !</marquee>
	
	<div style="text-align: center; solid red; text-align:center;">
		<br>
		<br>
		<a href="viewComplaints"><input type ="button" value = "View Complaints"></a>
		
	</div>
</body>
</html>