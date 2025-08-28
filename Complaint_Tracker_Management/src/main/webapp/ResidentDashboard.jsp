<%@page import="com.mini.model.ResidentDetails"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page session="true" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resident Dashboard</title>
</head>
<body>

<%
    ResidentDetails resident = (ResidentDetails) session.getAttribute("resident");
%>
	<h2 style="text-align: center;">Palm Meadows</h2>
	<marquee>welcome <%=  resident.getName()  %> !</marquee>
	
	<div style="text-align: center;">
	<br>
	<br>
	<br>
	<br>
		
		<a href = "AddComplaint.jsp"><input type="button" value = "Add Complaint"></a>
		<br>
		<br>
		<a href = "complaints"><input type="button" value = "Complaints"></a>
		<br>
		<br>
		<a href = "updateAndDelete"><input type="button" value = "Update/Delete"></a>
		<br>
		<br>
		<a href="pastComplaints"><input type="button" value ="Past Complaints"></a>
		<br>
		<br>
	</div>
</body>
</html>