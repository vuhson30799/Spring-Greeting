<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 3/27/2019
  Time: 8:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Translate</title>
</head>
<body>
<form action="/translateResult" method="post">
    <fieldset>
        <legend>
            Word
        </legend>
        <table>
            <tr>
                <td>Word: </td>
                <td><input type="text" name="word"></td>
            </tr>
        </table>
        <input type="submit" value="translate">
    </fieldset>
</form>
</body>
</html>
