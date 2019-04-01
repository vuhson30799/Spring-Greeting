<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 4/1/2019
  Time: 8:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert</title>
</head>
<body>
<form action="/convertResult" method="post">
    <fieldset>
        <legend>Information</legend>
        <table>
            <td>Money:</td>
            <td><input type="text" name="money"/></td>
        </table>
        <button type="submit">Convert</button>
    </fieldset>
</form>
</body>
</html>

