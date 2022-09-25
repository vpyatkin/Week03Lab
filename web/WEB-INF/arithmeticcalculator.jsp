<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 24, 2022, 8:28:33 PM
    Author     : Vladik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <button type="submit" name="operator" value="add">+</button>
            <button type="submit" name="operator" value="subtract">-</button>
            <button type="submit" name="operator" value="multiply">*</button>
            <button type="submit" name="operator" value="divide">%</button>
        </form>
        <br>
        Result: ${result} <br>
        <a href="./age">Arithmetic Calculator</a>
    </body>
</html>
