<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration to Ananke-Book</title>
</head>
<body>
	<div>
		<h3>Benvenuto nel form di registrazione</h3>
		<p>Inserisci i tuoi dati per poterti <br> registrare al nostro sito di e-commerce</p>
	</div>
	
	<form action="./register" method = "post">
		<label for="name">First name:</label><br>
  		<input type="text" id="name" name="name" ><br>
 		<label for="surname">Last name:</label><br>
  		<input type="text" id="surname" name="surname"><br><br>
  		<label for="username">Username:</label><br>
  		<input type="text" id="username" name="username"><br><br>
  		<label for="email">Email:</label><br>
  		<input type="text" id="email" name="email" required><br><br>
  		<label for="password">Password:</label><br>
  		<input type="password" placeholder="Enter Password" id="password" name="password" required><br><br>
  		<input type="submit" value="REGISTRATI">
	</form>
	
	<p>${message}</p>
	
</body>
</html>