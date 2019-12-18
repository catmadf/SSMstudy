<%--
  Created by IntelliJ IDEA.
  User: 烛影鸾书
  Date: 2019/11/28
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>所有用户信息</title>
    </head>

    <body>
        <table border="1px">
            <tr>
                <td>ID</td>
                <td>name</td>
                <td>age</td>
                <td>delete</td>
                <td>update</td>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td><c:out value="${user.id}"/></td>
                    <td><c:out value="${user.name}"/></td>
                    <td><c:out value="${user.age}"/></td>
                    <%--<td><a href='<c:url value="/delete?uid=${user.id}"/>'>删除</a></td>--%>
                    <%--<td><a href='<c:url value="/update?uid=${user.id}"/>'>更新</a></td>--%>
                </tr>
            </c:forEach>
        </table>
    </body>

</html>
