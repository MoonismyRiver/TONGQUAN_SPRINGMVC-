<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 08/08/2022
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create new Car</h1>
<form action="/car" method="post">
    <table>
        <tr>
            <td>Id</td>
            <td><label><input type="text" name="id"></label></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><label><input type="text" name="name"></label></td>
        </tr>
        <tr>
            <td>Color</td>
            <td><label><input type="text" name="color"></label></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><label><input type="text" name="price"></label></td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit">Create</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
