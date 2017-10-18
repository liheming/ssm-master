<%--
  Created by IntelliJ IDEA.
  User: haily
  Date: 2017/9/12
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello 132 79879 learn ssm  </h1>

<form action="${pageContext.request.contextPath}/book/list.html" method="get">
    手机号码<input name="name" type="text"/>  <br />
    用户密码<input  name="pass" type="password"> <br />
    <input type="submit">
    <input type="reset">

</form>

</body>
</html>
