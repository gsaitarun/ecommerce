<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<center>
<h1>Registration Page</h1>
<form action="registration" method="POST">
<table>
<tr><td><div class = "a"><input type = "text" placeholder = "FirstName" name="firstname"/></div></td></tr>
<tr><td><div class = "f"><input type = "text" placeholder = "lastname" name="lastname"/></div></td></tr>
<tr><td><div class = "e"><input type = "text" placeholder = "username" name="username" /></div></td></tr>
<tr><td><div class = "d"><input type = "text" placeholder = "phonenumber" name="phoneumber"/></div></td></tr>
<tr><td><div class = "b" ><input type = "email" placeholder =" email" name="email" /></div></td></tr>
<tr><td><div class = "c"><input type = "password" placeholder = "password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"/></div></td></tr>

<tr><td><button>submit</button></td></tr>
</table>
</form>

</center>
</body>
</html>