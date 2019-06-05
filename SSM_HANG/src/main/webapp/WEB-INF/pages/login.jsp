<%--
  Created by IntelliJ IDEA.
  User: weijun.zou
  Date: 2017/11/9
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="/user/login" method="post">
    <h2>${info}</h2>
    <input type="text" name="name"><br>
    <input type="password" name="password"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
