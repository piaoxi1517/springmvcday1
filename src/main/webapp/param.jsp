<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/24
  Time: 8:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--请求参数绑定--%>
    <%--<a href="param/testParam">请求参数绑定</a>--%>
    <%--把数据封装到Account类中--%>
    <%--<form action="param/saveAccount" method="post">--%>
        <%--姓名：<input type="text"name="username"/><br/>--%>
        <%--密码：<input type="text" name="password"/><br/>--%>
        <%--金额：<input type="text" name="money"/><br/>--%>
        <%--用户的姓名：<input type="text" name="list[0].nuame"/><br/>--%>
        <%--用户的年龄：<input type="text" name="list[0].age"/><br/>--%>
        <%--用户的姓名：<input type="text" name="map['one'].uname"/><br/>--%>
        <%--用户的年龄：<input type="text" name="map['one'].age"/><br/>--%>
        <%--<input type="submit" name="提交"><br/>--%>

    <%--</form>--%>
    <%--自定义类型装换器--%>
    <form action="anno/testModelAttribute" method="post">

    用户的姓名：<input type="text" name="uname"/><br/>
    用户的年龄：<input type="text" name="age"/><br/>

    <input type="submit" name="提交"><br/>

    </form>
    <a href="anno/testRequestParam?name=haha">Username</a><br/>
    <a href="anno/testCookieValue">CookieValue</a>
    <a href="anno/testSessionAttribute">SessionAttribute</a><br/>
    <a href="anno/getSessionAttribute">getSessionAttribute</a><br/>
</body>
</html>
