<%@page import="com.mini.model.Complaint"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Past Complaints</title>
</head>
<body>
	<h2 style="text-align: center;">Palm Meadows</h2>
	<br>
	<br>
	<div style="text-align: center;">
		<table border="1" style="margin: 0 auto; width: 750px;">
		
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>FlatNo</th>
				<th>Issue</th>
				<th>Status</th>
				
			</tr>
			<%   List<Complaint> complaints = (List<Complaint>) session.getAttribute("complaints");
			
					for(Complaint c : complaints){
			%>
			
			<tr>
					<td><%= c.getId() %></td>
					<td><%= c.getName() %></td>
					<td><%= c.getFlatNo() %></td>
					<td><%= c.getIssueSummary() %></td>
					<td><%= c.getStatus() %></td>
					
			</tr>		
		<%} %>
		</table>
	
	
	</div>
	
</body>
</html>