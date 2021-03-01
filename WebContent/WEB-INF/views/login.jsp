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
				margin: auto;
				border-radius:8px;
				text-align:center;
				position: relative;
				width: fit-content;
				height: fit-content;
				border: 1px solid #dddfe2;
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
			    border: 1px solid #dddfe2;
			    border-radius: 6px;
			    line-height: 48px;
			    padding: 0 16px;
			    width: 332px;
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
			.modal-content {
				  background-color: #fefefe;
				  margin: 15% auto; /* 15% from the top and centered */
				  padding: 20px;
				  border: 1px solid #888;
				  width: 80%; /* Could be more or less, depending on screen size */
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
			<form action="./homepage" method = "post">
		  		<div class="inputdiv">
		  			<div class="inputdiv">
		  				<input class="inputType" type="text" id="username" name="username" placeholder="username/email">
		  			</div>
		  		</div>
		  		<div class="inputdiv">
			  		<div class="inputdiv">
			  			<input class="inputType" type="password" id="password" name="password" placeholder="password" required>
			  		</div>
		  		</div>
		  		<div class="submitdiv">
		  			<button type="submit">LOGIN</button>
	  			</div>
			</form>
			<div>Or</div>
			<div class="submitdiv">
		  		<button id="register">REGISTER</button>
		  		<div id="registrationpopup" class="popup">
				  <div class="modal-content">
				    <span class="close">&times;</span>
				    <div class="formdiv">
						<form action="./register" method = "post">
							<div class="inputdiv">
								<div class="inputdiv">
						  			<input class="inputType" type="text" id="name" name="name" placeholder="First name">
						  		</div>
							</div>
							<div class="inputdiv">
						 		<div class="inputdiv">
						  			<input class="inputType" type="text" id="surname" name="surname" placeholder="Last name">
						  		</div>
					  		</div>
					  		<div class="inputdiv">
					  			<div class="inputdiv">
					  				<input class="inputType" type="text" id="username" name="username" placeholder="Username">
					  			</div>
					  		</div>
					  		<div class="inputdiv">
						  		<div class="inputdiv">
						  			<input class="inputType" type="text" id="email" name="email" placeholder="email" required>
						  		</div>
					  		</div>
					  		<div class="inputdiv">
						  		<div class="inputdiv">
						  			<input class="inputType" type="password" placeholder="password" id="password" name="password" required>
						  		</div>
					  		</div>
					  		<div class="submitdiv">
					  			<button type="submit">REGISTER</button>
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