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
				position: relative;
				width: fit-content;
				height: fit-content;
				border: 0.5px solid black;
			}
			.labeldiv {
				text-align:center;
				margin: 10px;
			}
			.inputdiv {
				text-align:center;
				margin: 10px;
			}
			.submitdiv {
				text-align:center;
				border-radius: 5px;
				margin:10px;
			}
			button {
				align:center;
				background-color: #1877f2;
			    border: none;
			    border-radius: 6px;
			    font-size: 20px;
			    line-height: 48px;
			    padding: 0 16px;
			    width: 332px;
			}
		</style>
	</head>
<body>
	<%@ include file="util/topnav.jsp"%>
	<div>
		<h1 id="t" class="title">Register</h1>
	</div>
	<div class="formdiv">
		<form action="./register" method = "post">
			<div class="inputdiv">
				<div class="labeldiv">
					<label for="name">First name</label>
				</div>
				<div class="inputdiv">
		  			<input type="text" id="name" name="name" >
		  		</div>
			</div>
			<div class="inputdiv">
				<div class="labeldiv">
		 			<label for="surname">Last name</label>
		 		</div>
		 		<div class="inputdiv">
		  			<input type="text" id="surname" name="surname">
		  		</div>
	  		</div>
	  		<div class="inputdiv">
	  			<div class="labeldiv">
	  				<label for="username">Username</label>
	  			</div>
	  			<div class="inputdiv">
	  				<input type="text" id="username" name="username">
	  			</div>
	  		</div>
	  		<div class="inputdiv">
	  			<div class="labeldiv">
		  			<label for="email">Email</label>
		  		</div>
		  		<div class="inputdiv">
		  			<input type="text" id="email" name="email" required>
		  		</div>
	  		</div>
	  		<div class="inputdiv">
	  			<div class="labeldiv">
		  			<label for="password">Password</label>
		  		</div>
		  		<div class="inputdiv">
		  			<input type="password" placeholder="Enter Password" id="password" name="password" required>
		  		</div>
	  		</div>
	  		<div class="submitdiv">
	  			<button type="submit">REGISTER</button>
  			</div>
		</form>
		
		<p>${message}</p>
	</div>
	</body>
</html>