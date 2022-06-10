<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/6/10
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>vip页面</title>
</head>
<body>

<div>
    <table align="center" width="60%" border="2px">
        <tr align="center">
            <td><a href="${pageContext.request.contextPath}/vip1/1.do">VIP 1-1</a> </td>
            <td><a href="${pageContext.request.contextPath}/vip1/2.do">VIP 1-2</a> </td>
            <td><a href="${pageContext.request.contextPath}/vip1/3.do">VIP 1-3</a> </td>
        </tr>

        <tr align="center">
            <td><a href="${pageContext.request.contextPath}/vip2/1.do">VIP 2-1</a> </td>
            <td><a href="${pageContext.request.contextPath}/vip2/2.do">VIP 2-2</a> </td>
            <td><a href="${pageContext.request.contextPath}/vip2/3.do">VIP 2-3</a> </td>
        </tr>

        <tr align="center">
            <td><a href="${pageContext.request.contextPath}/vip3/1.do">VIP 3-1</a> </td>
            <td><a href="${pageContext.request.contextPath}/vip3/2.do">VIP 3-2</a> </td>

        </tr>

    </table>
</div>


</body>
</html>
