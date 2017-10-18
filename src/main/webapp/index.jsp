<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: haily
  Date: 2017/8/11
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>video</title>
</head>
<body>
hello world
<tr>
    <td>商品图片</td>
    <td>
        <c:if test="${items.pic !=null}">
            <img src="/pic/${items.pic}" width=100 height=100/>
            <br/>
        </c:if>
        <form action="" method="post">

        <input type="file"  name="items_pic"/>
            <input type="submit" >
        </form>
    </td>
</tr>
</body>
</html>
