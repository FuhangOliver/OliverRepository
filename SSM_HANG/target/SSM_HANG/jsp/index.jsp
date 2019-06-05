<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>主页</title>
<body>
<h2>请先登录</h2>
<form action="/user1/login" method="post">
    <input type="text" name="name" value="admin"><br>
    <input type="password" name="password" value="admin"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
