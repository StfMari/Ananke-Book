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
		
		textarea {
 			width: 30%;
 			height: 120px;
		}
		
	</style>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
	<%@ include file="util/topnav.jsp"%>
	<div class="grid-container">
		<div class="item1">
		 	<textarea id="post" name="post" cols="40" rows="5" placeholder="${user.username} a che cosa stai pensando?"></textarea>
		 	<button class="button" type="submit" onclick="post('post')">POSTA</button>
		</div>
		<div class="item2">Menu</div>
		<div class="item3">
			<input type="button" value="CARICA POST" onclick="loadPost()">
		</div>  
		<div class="item4">Right</div>
	</div>
	<script>
		function post(postId){
			fetch("http:///Ananke-Book/login/publishpost", {
				method: 'PUT',
				body: JSON.stringify({
				  userId: ${user.id},
				  content: document.getElementById('postId').innerHTML(),
				  date: new Date()}
				}),
				headers: {
				  "Content-type": "application/json; charset=UTF-8"
				}
			  })
		}
	</script>
</body>
</html>