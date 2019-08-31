<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.cities {
	position: fixed;
	width: 100%;
	height: 56px;
	background-color: #2874f0;
	color: black;
}

.second {
	width: 540px;
	height: 36px;
}

.third {
    
	position: fixed;
	width: 100%;
	height: 40px;
	background-color: orange;
	<style>
.top{
width:100%;
height:40px;
background-color:#ede9df;
}
.middle{
width:25%;
height:400px;
background-color:pink;
float:left;
}
.middle1{
width:25%;
height:400px;
background-color:white;
float:left;
}
.middle2{
width:25%;
height:400px;
background-color:pink;
float:left;
}
.middle3{
width:25%;
height:400px;
background-color:white;
float:left;
}
.middle4{
width:25%;
height:400px;
background-color:white;
float:left;
}
.middle5{
width:25%;
height:400px;
background-color:pink;
float:left;
}
.middle6{
width:25%;
height:400px;
background-color:white;
float:left;
}
.middle7{
width:25%;
height:400px;
background-color:pink;
float:left;
}
	
}
</style>
<body>
<div class="third">
		<table>
			<tr>
				<span style="margin-left: 300px">
					<td><h1><c:forEach items="${list}" var="lists">
							<a href="fetch3">${lists.desktops}</a>

						</c:forEach></td></h1>
				</span>
			</tr>
		</table>
		
		<div class="middle1"><img src="shirt.jpg" alt="Trousers"><a href="https://www.shopwillslifestyle.com/">description</a></div>
	<div class="middle2"><img src="shirt.jpg" alt="T-Shirt"><a href=""/></div>
	<div class="middle3"><img src="shirt.jpg" alt="shorts"><a href=""/></div>
	<div class="middle4"><img src="shirt.jpg" alt="Jeans"><a href=""/></div>
	<div class="middle5"><img src="shirt.jpg" alt="faded Jeans""><a href=""/></div>
	<div class="middle6"><img src="shirt.jpg" alt="Trousers"><a href=""/></div>
	<div class="middle7"><img src="shirt.jpg" alt="Shirt"><a href=""/></div>

	</div>
</body>
</html>