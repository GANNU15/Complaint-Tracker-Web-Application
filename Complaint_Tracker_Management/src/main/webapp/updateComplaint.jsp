<%@page import="com.mini.model.Complaint"%>
<%@page import="com.mini.dao.ComplaintDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Form</title>
</head>
<body>
	<% int id = Integer.parseInt(request.getParameter("id")); 
		ComplaintDao dao = new ComplaintDao();
		Complaint complaint =  dao.getComplaint(id);
	
	%>
	<h2 style="text-align: center;">Update Complaint</h2>
	<br>
	<br>
	<div style="text-align: center;">
		<form action="updateComplaint">
		<br>
		<br>
		<label for= "id">Id :</label>
		<input type = "text" name = "id" value="<%= id %>" readonly> 
		<br>
		<br>
		<label for= "name">Name :</label>
		<input type = "text" name = "name" value="<%= complaint.getName() %>">
		<br>
		<br>
		<label for= "flatNo">FlatNo :</label>
		<input type = "text" name = "flatNo" value="<%= complaint.getFlatNo() %>">
		<br>
		<br>
		<label for= "issue">Issue :</label>
		<input type = "text" name = "issue" value="<%= complaint.getIssueSummary() %>">
		<br>
		<br>
		
		<input type = "submit" value="Update">
		</form>
	
	</div>
	
</body>
</html>