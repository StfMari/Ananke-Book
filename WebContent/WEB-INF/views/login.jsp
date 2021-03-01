<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<style>
			.title{
				text-align:center;
			}
			.formdiv {
				background-color: rgb(252, 255, 95);
				margin: auto;
				border-radius:8px;
				text-align:center;
				position: relative;
				width: fit-content;
				height: fit-content;
				border: 1px solid purple;
			}
			.inputdiv {
				text-align:center;
				margin: 10px;
				width: fit-content;
			}
			.submitdiv {
				text-align:center;
				border-radius: 5px;
				margin: 10px;
			}
			.inputType{
				font-size:12px;
				text-align:left;
				background-color: white;
			    border: 1px solid purple;
			    border-radius: 6px;
			    line-height: 48px;
			    padding: 0 16px;
			    width: 350px;
			}
			.loginbutton {
				align:center;
				background-color: #ffee00;
			    border: none;
			    border-radius: 6px;
			    font-size: 16px;
			    line-height: 48px;
			    padding: 0 16px;
			    width: 250px;
			}
			.registerbutton {
				align:center;
				background-color: #ffee00;
			    border: none;
			    border-radius: 6px;
			    font-size: 16px;
			    line-height: 48px;
			    padding: 0 16px;
			    width: 150px;
			}
			/* The Modal (background) */
			.popup {
				display: none; /* Hidden by default */
				position: fixed; /* Stay in place */
				z-index: 1; /* Sit on top */
				left: 0;
				top: 0;
				width: 100%; /* Full width */
				height: 100%; /* Full height */
				overflow: auto; /* Enable scroll if needed */
				background-color: rgb(0,0,0); /* Fallback color */
				background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
			}
			
			/* Modal Content/Box */
			.popup-content {
				background-color: #fefefe;
				margin: 5% auto; /* 15% from the top and centered */
				padding: 20px;
				border: 1px solid #888;
				width: 50%;
    			border-radius: 15px;
			}
			
			/* The Close Button */
			.close {
				color: #aaa;
				float: right;
				font-size: 28px;
				font-weight: bold;
			}
			
			.close:hover, .close:focus {
				color: black;
				text-decoration: none;
				cursor: pointer;
			}
		</style>
		<title>Login to Ananke-Book</title>
	</head>
	<body>
		<div>
			<h1 id="t" class="title">Login</h1>
		</div>
		<div class="formdiv">
			<form action="./login" method = "post">
		  		<div class="inputdiv">
	  				<input class="inputType" type="text" id="email" name="email" placeholder="email" required>
		  		</div>
		  		<div class="inputdiv">
		  			<input class="inputType" type="password" id="password" name="password" placeholder="password" required>
		  		</div>
		  		<div class="submitdiv">
		  			<button class="loginbutton" type="submit">LOGIN</button>
	  			</div>
			</form>
			<div>Or</div>
			<div class="submitdiv">
		  		<button class="registerbutton" id="register">REGISTER</button>
		  		<div id="registrationpopup" class="popup">
				  <div class="popup-content">
				    <span class="close">&times;</span>
				    <div class="formdiv">
						<form action="./register" method = "post">
							<div>
								<div class="inputdiv" style="float:left">
						  			<input class="inputType" type="text" id="name" name="name" placeholder="First name" style="width:80%">
								</div>
								<div class="inputdiv" style="float:right">
						  			<input class="inputType" type="text" id="surname" name="surname" placeholder="Last name" style="width:80%">
						  		</div>
					  		</div>
					  		<div class="inputdiv">
				  				<input class="inputType" type="text" id="username" name="username" placeholder="Username">
					  		</div>
					  		<div class="inputdiv">
					  			<input class="inputType" type="text" id="email" name="email" placeholder="email" required>
					  		</div>
					  		<div class="inputdiv">
					  			<input class="inputType" type="password" placeholder="password" id="password" name="password" required>	
					  		</div>
					  		<div class="inputdiv">
					  			<input class="inputType" type="date" placeholder="birthday" id="birthday" name="birthday" required>	
					  		</div>
					  		<div class="inputdiv">
						  		<select class="inputType" name="nationality" id="nationality" style="width:150px" required>
								  <option value="europe">Europe</option>
								  <option value="america">America</option>
								  <option value="asia">Asia</option>
								  <option value="africa">Africa</option>
								  <option value="oceania">Oceania</option>
								</select>
								<input type="radio" name="gender" value="male"> Male
								<input type="radio" name="gender" value="female"> Female
								<input type="radio" name="gender" value="other"> Other
							</div>
					  		<div class="submitdiv">
					  			<button class="registerbutton" type="submit">REGISTER</button>
				  			</div>
						</form>
				  </div>
				
				</div>
	  		</div>
		</div>
		</div>
		<p>${message}</p>
		
		<script type="text/javascript">
			// Get the modal
			var popup = document.getElementById("registrationpopup");
	
			// Get the button that opens the modal
			var button = document.getElementById("register");
	
			// Get the <span> element that closes the modal
			var span = document.getElementsByClassName("close")[0];
	
			// When the user clicks on the button, open the modal
			button.onclick = function() {
			  popup.style.display = "block";
			}
	
			// When the user clicks on <span> (x), close the modal
			span.onclick = function() {
			  popup.style.display = "none";
			}
	
			// When the user clicks anywhere outside of the modal, close it
			window.onclick = function(event) {
			  if (event.target == modal) {
			    popup.style.display = "none";
			  }
			}
		</script>
	</body>
</html>