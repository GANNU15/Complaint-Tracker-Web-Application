<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
</head>
<body>
	<br>
	<br>
	<h2 style="text-align: center;">Login</h2>
	<br>
	<br>
	<div style="text-align: center;">
		<form action="adminLogin" method="post">
			<label for = "email">Email :</label>
			<input type = "email" name = "email">
			<br>
			<br>
			<label for = "password">Password :</label>
			<input type = "password" name = "password">
			<br>
			<br>
			<input type ="submit" value = "Login">
			<br>
			<p>New Here <a href="adminSignup.jsp">Signup</a></p>
		</form>
	
	</div>
</body>
</html>