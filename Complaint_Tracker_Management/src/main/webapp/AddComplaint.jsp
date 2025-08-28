<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Complaint Form</title>
</head>
<body>
<br>
<br>
	<h2 style="text-align: center;">Complaint Form</h2>

	<div style="text-align: center;">
		<form action="addComplaint" method="post">
		
			<br>
			<label for="name" >Name : </label>
			<input type ="text" name="name">
			<br>
			<br>
			<label for="flatNo" >flatNo : </label>
			<input type ="text" name="flatNo">
			<br>
			<br>
			<label for="issue" >Issue : </label>
			<input type ="text" name="issue">
			<br>
			<br>
			<input type="submit" value="Submit">
			<br>
			<br>
		</form>
	</div>
</body>
</html>