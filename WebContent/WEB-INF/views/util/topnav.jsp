<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<style>
			.topnav {
				overflow: hidden;
				background-color: #333;
			}
			
			.topnav a {
				float: left;
				color: #f2f2f2;
				text-align: center;
				padding: 14px 16px;
				text-decoration: none;
				font-size: 17px;
			}
	
			.topnav a:hover {
				background-color: #ffff;
				color: black;
			}
			
			.topnav a.active {
				background-color: #333;
				color: white;
			}
		</style>
	</head>
	<body>
		<div class="topnav">
		<a style="hover:none">AnankeBook</a>
 		<a href="./homepage">Homepage</a>
 		<c:choose>
	 		<c:when test = "${userBean == null}">
		 		<a href="./login">Login</a>
	 		</c:when>
	 		<c:when test = "${userBean != null}">
		 		<a href="./logout">Logout</a>
		 		<a href="./profile">Profile</a>
		 		<a href="./news">News</a> <!-- questo bisogna definire il controller che mostra quante notifiche sono presenti -->
		 		<a href="./search">Search</a> <!-- search for a friend, in future for a group or place or something else -->
	 		</c:when>
 		</c:choose>
	</div>
	</body>
</html>