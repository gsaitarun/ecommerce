<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<style>
.a {
	background-color: #3dabf5;
	border: #3dabf5;
	color: white;
	padding: 10px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 18px;
	width: 10%;
	border-radius: 16px;
	font-family: Arial, Helvetica, sans-serif
}

.b {
	background-color: white;
	color: black;
	border: 1px solid #3dabf5;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
	<form action="login2">
		<center>
			<button class="a ">LOGIN</button>
		</center>
		<br>
	</form>
	<a href="${pageContext.request.contextPath}/login2">Login</a>>
	<form action="registration2">
		<center>
			<button class="a">REGISTRATION</button>
		</center>
	</form>
</body>
</html>