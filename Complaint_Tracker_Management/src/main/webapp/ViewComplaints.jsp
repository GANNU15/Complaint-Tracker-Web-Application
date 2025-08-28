<%@page import="com.mini.model.Complaint"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Complaints</title>
</head>
<body>
	<br>
	<br>
	<h2 style="text-align: center;">Complaints</h2>
	
	<div style="text-align: center; solid red; text-align:center;">
		<table border="1" style="margin: 0 auto; width: 500px;">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>FlatNo</th>
				<th>Issue</th>
				<th>Status</th>
				<th>Update Status</th>
			</tr>
	
	<%  List<Complaint> complaints =(List<Complaint>)session.getAttribute("complaints"); 
	
			for(Complaint c : complaints){
	
	%>
	
			<tr>
				<td><%= c.getId()  %></td>
				<td><%= c.getName()%></td>
				<td><%= c.getFlatNo()%></td>
				<td><%= c.getIssueSummary() %></td>
				<td><%= c.getStatus() %></td>
				<td><a href="updateStatus?id=<%= c.getId() %>" style="text-decoration: none">Update Status</a></td>
			
			</tr>
			
			<% } %>
	</table>
	
	</div>
</body>
</html>