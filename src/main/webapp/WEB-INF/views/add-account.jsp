<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add account</title>
</head>
<body>
<h1>New account</h1>
<f:form method="POST" commandName="account" action="accounts">
    <table>
        <tr>
            <td>
                <i>Sum:</i>
            </td>
            <td>
                <f:input path="sum"/>
            </td>
        </tr>
        <tr>
            <td><input type="submit" value="Save Changes"/></td>
        </tr>
    </table>
</f:form>
</body>
</html>
