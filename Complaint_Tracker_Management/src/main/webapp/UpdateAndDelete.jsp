<%@page import="com.mini.model.Complaint"%>
<%@page import="com.mini.model.ResidentDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update/Delete</title>
</head>
<body>
	<div style="text-align: center; solid red; text-align:center;">
		<table border="1" style="margin: 0 auto; width: 750px;">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>FlatNo</th>
			<th>Issue</th>
			<th>Status</th>
			<th>Update</th>
			<th>Delete</th>
		
		</tr>
		
			<% List<Complaint> complaints = (List<Complaint>)session.getAttribute("complaints");	
				for(Complaint c : complaints){
			%>
		
		
		<tr>
			<td> <%= c.getId() %> </td>
			<td> <%= c.getName() %></td>
			<td><%= c.getFlatNo() %></td>
			<td><%= c.getIssueSummary()%></td>
			<td><%= c.getStatus() %></td>
			<td><a href="updateComplaint.jsp?id=<%= c.getId() %>" style="text-decoration: none">Update Complaint</a> </td>
			<td><a href="deleteComplaint?id=<%= c.getId() %>&flatNo=<%= c.getFlatNo() %>" style="text-decoration: none">Delete Complaint</a> </td>
		
		</tr>
		<% } %>
	</table>
	</div>
</body>
</html>