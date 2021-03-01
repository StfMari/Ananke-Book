<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<style>
			.inputType{
				readonly:readonly;
				font-size:12px;
				text-align:left;
				background-color: white;
			    border: 1px solid purple;
			    border-radius: 6px;
			    line-height: 48px;
			    padding: 0 16px;
			    width: 350px;
			}
			.submitdiv {
				text-align:center;
				border-radius: 5px;
				margin: 10px;
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
			.container {
				background-color: rgb(252, 255, 95);
				margin: auto;
				border-radius:8px;
				text-align:center;
				position: relative;
				width: fit-content;
				height: fit-content;
				border: 1px solid purple;
			}
		</style>
	</head>
	<body>
		<%@ include file="util/topnav.jsp"%>
		<!-- getUserDetails -->
		<c:when test = "${user.id == selectedUser}">
			<div class="container">
				<form action="./getUserDetails" method = "post">
			 		<div class="inputdiv">
			  			<input class="inputType" type="text" id="name" name="name" value="${selectedUser.name}">
					</div>
					<div class="inputdiv">
			  			<input class="inputType" type="text" id="surname" name="surname" value="${selectedUser.surname}">
			  		</div>
			  		<div class="inputdiv">
		  				<input class="inputType" type="text" id="username" name="username" value="${selectedUser.username}">
			  		</div>
			  		<div class="inputdiv">
			  			<input class="inputType" type="text" id="email" name="email" value="${selectedUser.email}">
			  		</div>
			  		<div class="inputdiv">
			  			<input class="inputType" type="text" value="birthday" id="birthday" name="${selectedUser.birthday}">	
			  		</div>
			  		<div class="inputdiv">
			  			<input class="inputType" type="text" value="gender" id="gender" name="${selectedUser.gender}">	
			  		</div>
			  		<div class="submitdiv">
			  			<button class="loginbutton" type="submit">LOGIN</button>
		  			</div>
	  			</form>
		  	</div>
 		</c:when>
 		<c:when test = "${user.id != selectedUser.id}">
	 		<div class="container">
		 		<div class="inputdiv">
		  			<input class="inputType" type="text" id="name" name="name" value="${selectedUser.name}">
				</div>
				<div class="inputdiv">
		  			<input class="inputType" type="text" id="surname" name="surname" value="${selectedUser.surname}">
		  		</div>
		  		<div class="inputdiv">
	  				<input class="inputType" type="text" id="username" name="username" value="${selectedUser.username}">
		  		</div>
		  		<div class="inputdiv">
		  			<input class="inputType" type="text" id="email" name="email" value="${selectedUser.email}">
		  		</div>
		  		<div class="inputdiv">
		  			<input class="inputType" type="text" value="birthday" id="birthday" name="${selectedUser.birthday}">	
		  		</div>
		  		<div class="inputdiv">
		  			<input class="inputType" type="text" value="gender" id="gender" name="${selectedUser.gender}">	
		  		</div>
		  		<div class="submitdiv">
		  			<button class="loginbutton" type="submit">LOGIN</button>
	  			</div>
		  	</div>
 		</c:when>
	</body>
</html>