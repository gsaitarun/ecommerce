<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  isELIgnored="true" %>
<!DOCTYPE html>



<html>
<head>
<style>
.a {
	width: 100%;
	height: 120px;
	background-color: #08114A;
}

.b {
	background: #ddd;
	cursor: pointer;
}

.c {height; 40px;
	
}

.d {
	float: left;
	margin-left: 225px;
	margin-top: 10px;
	background-color:;
	width: 33%;
	height: 500px;
}

.e {
	float: left;
	margin-right: 10px;
	margin-bottom: 500px;
	background-color: black;
	width: 250px;
	height: 500px;
}

.f {
	background-color:;
	width: 230%;
	height: 100%;
}

.g {
	float: left;
	background-color: gray;
	width: 270px;
	height: 250px;
}

.h {
	float: left;
	background-color: #08114A;
	width: 270px;
	height: 250px;
}

.k {
	float: left;
	margin-top: 5px;
	background-color: blue;
	height: 48%;
}
</style>
</head>
<body>

	<div class="a">
		<div class="x"
			style="float: right; color: white; font-family: 'Open Sans', Helvetica, Arial, sans-serif; margin-bottom: 20px">
			<h2>id: ${login.firstname}</h2>
		</div>
		<img
			src="//c1.neweggimages.com/WebResource/Themes/2005/Nest/logo_424x210.png"
			alt="Newegg.com- Computer Parts, Laptops, Electronics, HDTVs, Digital Cameras and More!"
			width="100px" height="50px" /> <input class="b" type="text"
			style="margin-left: 2px; margin-top: 7px; width: 95.5%; height: 35px" />
		<button class="c">submit</button>
	</div>
	<div class = "mm">
	 <form:form action="fetch1" method="GET" modelAttribute = "p">
		<button>desktops</button>
	</form:form>
</div>
	<form action="fetch2">
		<button>laptops</button>
	</form> 
	
	<form action="fetch3">
		<button>gaming</button>
	</form>
	
	<div class="d">
		<a class="z" href="pc1"> <img
			src="//promotions.newegg.com/international/19-1882/627x627.jpg"
			alt="" title="" height="510px" width="510px"></a>
	</div>
	<div class="e" style="position: absolute; left: 44.9627%; top: 138px;">
		<a class="z" href="pc2"> <img
			src="//promotions.newegg.com/international/19-1882/308x627_row.jpg"
			alt="" title="" height="510px" width="250px" /></a>
	</div>

	<div class="f" style="position: absolute; left: 60.5627%; top: 138px">
		<a class="z" href="ps3"> <img
			src="//promotions.newegg.com/international/19-1882/308x308_left.jpg"
			alt="" title=""></a>
	</div>
	<div class="g" style="position: absolute; left: 80.5627%; top: 138px">
		<a class="z" href="ps4"> <img
			src="//promotions.newegg.com/international/19-1882/308x308_right.jpg"
			alt="" title=""></a>
	</div>
	<div class="h"
		style="position: absolute; left: 60.5627%; top: 458px; height: 190px; width: 650px">
		<a class="z" href="ps5"> <img
			src="//promotions.newegg.com/international/19-1882/627x308.jpg"
			alt="" title="" height="190px" width="650px"></a>
	</div>





</body>
</html>
