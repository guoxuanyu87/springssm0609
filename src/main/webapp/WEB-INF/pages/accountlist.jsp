<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/6/9
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>账户分页</title>
</head>
<body>

<table width="60%" border="2px" align="center">
    <tr>
        <th>序号</th>
        <th>名字</th>
        <th>金额</th>
    </tr>
    <c:forEach items="${page.list}" var="account">
        <tr>
            <td>${account.id}</td>
            <td>${account.name}</td>
            <td>${account.money}</td>
        </tr>
    </c:forEach>

</table>




</body>
</html>
