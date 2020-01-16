<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="admin" method="post">
STUDENT ID 		: <input type="text" name="studentid" required><br>
STUDENT NAME	:   <input type="text" name="studentname" required><br>
STANDARD CATEGORY		: <input type="text" name="category" required><br>
STANDARD 		:<input type="text" name="standard" required><br>
<input type="submit" name="ADD">      
</form>
</body>
</html>