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
<form  action="higher" method="post" >
Student Id 	:<input type="text" name="studentid" value="${studentid}" readonly="readonly"><br>
Standard 	:<input type="text" name="standard" value="${standard}" readonly="readonly"><br>
English 	:<input type="text" name="english" required><br>
Tamil 		:<input type="text" name="tamil" required><br>
Physics 	:<input type="text" name="physics" required><br>
Chemistry 	:<input type="text" name="chemistry" required><br>
Computer 	:<input type="text" name="computer" required><br>
Maths 		:<input type="text" name="maths" required><br>
<input type="reset" value="Reset">
<input type="submit" value="Save">
</form>
</body>
</html>