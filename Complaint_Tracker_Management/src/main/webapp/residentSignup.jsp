<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resident Signup</title>
</head>
<body>
<h2 style="text-align: center;">Resident Signup</h2>
	<div style="text-align: center;">
		
		<form action="residentSignup" method="post">
			<br>
			<br>
			<label for="name">Name :</label>
			<input type ="text" name="name">
			<br>
			<br>
			<label for="flatNo">Flat No  :</label>
			<input type ="text" name="flatNo">
			<br>
			<br>
			<label for="mobile">Mobile  :</label>
			<input type ="text" name="mobile">
			<br>
			<br>
			<label for="email">Email  :</label>
			<input type ="email" name="email">
			<br>
			<br>
			<label for="password">Password  :</label>
			<input type ="password" name="password">
			<br>
			<br>
			<input type ="submit" value = "Submit">
		</form>
	
	
	</div>
</body>
</html>