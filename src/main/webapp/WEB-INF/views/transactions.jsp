<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Transactions</title>
</head>
<body>
<h1>Transactions quantity=${transactions.size()}</h1>

<table style="border-style: solid">
    <tr>
        <td>ID</td>
        <td>Client sender ID</td>
        <td>Client getter ID</td>
        <td>Sum</td>
        <td>Date and Time</td>
    </tr>
    <c:forEach var="transaction" items="${transactions}">
        <tr>
            <td>${transaction.id}</td>
            <td>${transaction.senderAcc}</td>
            <td>${transaction.getterAcc}</td>
            <td>${transaction.amount}</td>
            <td>${transaction.addDate}</td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="add-transaction">New transaction</a>
<a href="/">home</a>
</body>
</html>
