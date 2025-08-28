<%@page import="com.mini.model.Complaint"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Status Update Form</title>
</head>
<body>
	<h2 style="text-align: center;">Palm Meadows</h2>
	<br>
	<br>
	<%  Complaint complaint = (Complaint)session.getAttribute("complaint"); %>
	
	<div style="text-align: center;">
	
		<form action="updatedComplaint" >
		<br>
		<br>
		Id : <input type="text" name ="id" value =<%= complaint.getId() %> readonly="readonly">
		<br>
		<br>
		Name : <input type ="text" name = "name" value =<%= complaint.getName() %> readonly="readonly">
		<br>
		<br>
		FlatNo : <input type="text" name ="flatNo" value =<%= complaint.getFlatNo() %> readonly="readonly">
		<br>
		<br>
		Issue : <input type="text" name="issue" value =<%= complaint.getIssueSummary() %> readonly="readonly">
		<br>
		<br>
		Status : 
		
		<select name="status">
        <option value="Pending" ${complaint.status=="Pending" ? "selected" : ""}>Pending</option>
        <option value="In Progress" ${complaint.status=="In Progress" ? "selected" : ""}>In Progress</option>
        <option value="Resolved" ${complaint.status=="Resolved" ? "selected" : ""}>Resolved</option>
       </select>
		
		<br>
		<br>
		<input type="submit" value="Update">
		<br>
		<br>
		</form>
	
	</div>
</body>
</html>