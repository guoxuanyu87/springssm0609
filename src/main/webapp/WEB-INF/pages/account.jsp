<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/6/9
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table align="center" border="2px" width="60%">

    <tr align="center">
        <th>序号</th>
        <th>姓名</th>
        <th>金额</th>
    </tr>
    <c:forEach items="${list}" var="account">
        <tr align="center">
            <td>${account.id}</td>
            <td>${account.name}</td>
            <td>${account.money}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
