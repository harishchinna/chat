<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Friend Request</h1>
<spring:form action="send" modelAttribute="request">
<table>
<tr>
<td><label>SenderId:</label></td>
<td><input type="text" name="senderId" value=""></td>
</tr>
<tr>
<td><label>receiverId:</label></td>
<td><input type="text" name="receiverId" value=""></td>
</tr>
<tr>
<td><label>action:</label></td>
<td><input type="radio" name="action" value="send">send</td>
<td><input type="radio" name="action" value="accept">accept</td>
</tr>
<tr>
<td><input type="submit" name="submit" value="Send Request"></td>
<td><input type="reset" name="submit" value="Cancel Request"></td>
</tr>
</table>
</spring:form>
</body>
</html>