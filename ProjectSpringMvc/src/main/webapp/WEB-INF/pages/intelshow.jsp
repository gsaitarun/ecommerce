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
button {
  background-color:  #66ccff;
  border:  #66ccff;
  
  color: white;
  padding: 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 12px;
  width:100px;
  border-radius:16px;
  font-family: Arial, Helvetica, sans-serif
}
button3 {
  background-color: white;
  margin-right:160px;
  float:right;
  border: #3dabf5;
  color: white;
  padding: 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 12px;
  width:8.5%;
  border-radius:16px;
  font-family: Arial, Helvetica, sans-serif
}
.button1{
	background-color: white; 
  color: black; 
  border: 1px solid  #66ccff;
}
.button2{
	background-color: white; 
  color:  #66ccff;; 
  border: 1px solid #66ccff;
}

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
					<td><h1><c:forEach items="${ID}" var="lists">
							<%-- <a href="">${lists.id}</a>
                            <a href="fetch2">${lists.name}</a>
                           </br> --%>
                           
                            <img src="data:image/jpg;base64,${lists.base64}" height="500" width="550" /><br>
                         id:<a href="">${lists.id}</a>  </br>  </br>
                            name:<a href="">${lists.name}</a></br>  </br>
                            price:<a href="">${lists.prize}</a></br>  </br>
                            totalItmes:<a href="">${lists.quantity}</a></br> </br>
                             <form action = "cart"><button><class = "button button1" >Add to cart</button></form>
                          
						</c:forEach></td></h1>
				</span>
			</tr>
		</table>
</body>
</html>