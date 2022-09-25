<%-- 
    Document   : agecalculator
    Created on : Sep 24, 2022, 7:17:17 PM
    Author     : Vladik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday">
        </form>
        ${message}
        <a href="">Arithmetic Calculator</a>
    </body>
</html>
