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
.hi
   {
    width : 500px;
    height : 500px;
   }
</style>
<body>
<form action = "inner">
<button>home</button></form>
<div class="objOption">
                <td><h1><c:forEach items="${list}" var="lists">
                           <%--  
					   		id:<a href="">${lists.id}</a>  </br>  </br>
                            name:<a href="">${lists.name}</a></br>  </br>
                            prize:<a href="">${lists.prize}</a></br>  </br>
                            totalItmes:<a href="">${lists.quantity}</a></br>  --%> </br>
                            <a href=""></a>
                            
                            <img src="data:image/jpg;base64,${lists.base64}" height="100" width="150" >

                            <div class = "hi"><c:out value="${lists.image}"/>
                              
                           </br>
						</c:forEach></td></h1>
                    
                
            </div>
            
           
            <div class = "hello">
	<form action="fetch" method = "get">
	<button>hi</button></form></div>		                           
		
</body>
</html>