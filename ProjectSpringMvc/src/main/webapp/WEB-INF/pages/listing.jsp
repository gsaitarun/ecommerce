<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<td><h1><c:forEach items="${list}" var="lists">
							 <a href="">${lists.id}</a>
                            <a href="fetch2/${lists.id}">${lists.name}</a>
                           </br> 
                            <img src="data:image/jpg;base64,${lists.base64}" height="500" width="550" /><br>
                            </c:forEach></h1></td>
</body>
</html>