<%--
  Created by IntelliJ IDEA.
  User: 烛影鸾书
  Date: 2019/11/28
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/doReg" method="post">
    UserName : <label><input type="text" name="username"></label><br>
    Password : <label><input type="password" name="password"></label><br>
    <input type="submit"/>
</form>
</body>
</html>
