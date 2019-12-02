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
<form action="<c:url value="/updateOne"/>" method="post">
    Id : <label><input type="hidden" name="id" value='<c:out value="${user.id}"/>'></label><br>
    UserName : <label><input type="text" name="name" value='<c:out value="${user.name}"/>'></label><br>
    Age : <label><input type="text" name="age" value='<c:out value="${user.age}"/>'></label><br>
    <input type="submit"/>
</form>
</body>
</html>
