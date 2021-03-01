<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<style>
		.item1 { grid-area: header; }
		.item2 { grid-area: menu; }
		.item3 { grid-area: main; }
		.item4 { grid-area: right; }
		.item5 { grid-area: footer; }
		
		.grid-container {
			display: grid;
			grid-template-areas:
			'header header header header header header'
			'menu main main main right right';
			grid-gap: 10px;
			background-color: #cca300;
			padding: 10px;
		}
		
		.grid-container > div {
			background-color: rgb(255, 204, 0);
			text-align: center;
			padding: 20px 0;
			font-size: 30px;
		}
	</style>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
	<%@ include file="util/topnav.jsp"%>
	<div class="grid-container">
		<div class="item1">
			<input type="text" placeholder="${user.username} a che cosa stai pensando?">
		 
		</div>
		<div class="item2">Menu</div>
		<div class="item3">
			<input type="button" value="CARICA POST" onclick="loadPost()">
		</div>  
		<div class="item4">Right</div>
	</div>
	<script>
	</script>
</body>
</html>