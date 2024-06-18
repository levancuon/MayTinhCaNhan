<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 6/15/2024
  Time: 8:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Calulator</h2>
<form action="/calculator/result" method="post">
    <input type="text" placeholder="a" name="a">
    <input type="text" placeholder="b" name="b"> <br>
    <input type="submit" value="Addition" name="c">
    <input type="submit" value="Subtraction" name="c">
    <input type="submit" value="Multiplication" name="c">
    <input type="submit" value="Division"  name="c">  <br>
</form>
Kết quả = ${result}
</body>
</html>
