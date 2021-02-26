<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ananke-Book</title>
</head>
<body>
	<h2>BENVENUTO!</h2>
	<form action="./anankeBook/logIn" method = "get">
		<label>Accedi o registrati al nostro portale</label><br><br>
		<input type= "submit" value = "ACCEDI"></input>
	</form>
	<br><br>
	<form action="./anankeBook/registration"  method = "get">
		<input type= "submit" value = "REGISTRATI"></input>
	</form>
</body>
</html>