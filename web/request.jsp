<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2020/10/4
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <form action="request" method="post">
        用户名：<input type="text" name="name" value=""/><br/>
        密&nbsp&nbsp&nbsp&nbsp码：<input type="password" name="pwd" value=""/><br/>
        爱好：
        <input type="checkbox", name="fav" value="1">java
        <input type="checkbox", name="fav" value="2">python
        <input type="checkbox", name="fav" value="3">c<br/>
        <input type="submit" value="登录"/>
    </form>
</body>
</html>
