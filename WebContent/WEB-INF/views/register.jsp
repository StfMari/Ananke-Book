<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Registration to Ananke-Book</title>
		<style>
			.title{
				text-align:center;
			}
			.formdiv {
				margin: auto;
				text-align:center;
				position:absolute;
			}
			.inputdiv {
				text-align:center;
			}
		</style>
	</head>
<body>
	<%@ include file="util/topnav.jsp"%>
	<div>
		<h1 id="t" class="title">Welcome</h1>
	</div>
	<div class="formdiv">
		<form action="./register" method = "post">
			<div class="inputdiv">
				<label for="name">First name:</label><br>
		  		<input type="text" id="name" name="name" >
			</div>
			<div class="inputdiv">
	 		<label for="surname">Last name:</label><br>
	  		<input type="text" id="surname" name="surname">
	  		</div>
	  		<div class="inputdiv">
	  		<label for="username">Username:</label><br>
	  		<input type="text" id="username" name="username">
	  		</div>
	  		<div class="inputdiv">
	  		<label for="email">Email:</label><br>
	  		<input type="text" id="email" name="email" required>
	  		</div>
	  		<div class="inputdiv">
	  		<label for="password">Password:</label><br>
	  		<input type="password" placeholder="Enter Password" id="password" name="password" required>
	  		</div>
	  		<input type="submit" value="REGISTRATI">
		</form>
		
		<p>${message}</p>
	</div>
	</body>
</html>