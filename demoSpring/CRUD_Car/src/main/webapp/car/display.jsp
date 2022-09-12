<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 08/08/2022
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Car</h1>
<h2>${message}</h2>
<a href="/car/create.jsp">Create new car</a>
<form action="/car/search" method="post">
    <label><input type="text" name="search" value="${search}"></label>
    <button type="submit">Search</button>
</form>
<table style="width: 600px;margin-top: 10px" border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Color</th>
        <th>Price</th>
        <th colspan="2">Action</th>
    </tr>
    <c:forEach items="${cars}" var="c">
        <tr>
            <td>${c.getId()}</td>
            <td>${c.getName()}</td>
            <td>${c.getColor()}</td>
            <td>${c.getPrice()}</td>
            <td><button><a href="/car/update/${c.getId()}">Update</a></button></td>
            <td><button><a href="/car/delete/${c.getId()}">Delete</a></button></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
