<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>accounts</title>
</head>
<body>
<h1>Accounts amount=${accounts.size()}</h1>

<table style="border-style: solid">
    <tr>
        <td>ID</td>
        <td>Client ID</td>
        <td>Sum</td>
    </tr>
    <c:forEach var="account" items="${accounts}">
        <tr>
            <td>${account.id}</td>
            <td>${account.client}</td>
            <td>${account.sum}</td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="add-account">New account</a>
<a href="/">home</a>
</body>
</html>
