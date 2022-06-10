<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/6/9
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <script type="text/javascript" src="plugins/jquery/jquery-3.3.1.min.js"></script>
</head>
<body>

<div>
    <a href="/account.do">查询全部账户</a>
</div>
<hr style="background-color: orange"/>

<div style="background-color: pink">
    <a href="/accountlist.do">查询账户分页</a>
</div>
<hr/>

<div>
    <form action="${pageContext.request.contextPath}/login.do" method="post">
        <div>
            <label>用户名：</label>
            <input id="phone" type="text" name="username" placeholder="请输入手机号">
        </div>
        <div>
            <label>密 码：</label>
            <input id="password" name="password" type="password" placeholder="请输入密码">
            <input type="button" id="bt1" value="发送验证码">
        </div>
        <input type="submit" value="登录">
    </form>

</div>


<script type="text/javascript">

    $("#bt1").click(function () {
        let phoneNum = $("#phone").val();

        $.ajax({
            url: "${pageContext.request.contextPath}/sendCode.do",
            method: "post",
            contentType: "application/json",
            data: JSON.stringify({"username": phoneNum}),
            success: function (resp) {
                // alert(resp);
                console.log(resp);
            }
        })

    });


</script>


</body>
</html>
