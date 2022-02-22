<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>	
	<form:form action="login_" method="post" modelAttribute="credential">
		<table>
			<tr>
				<td>Name:	</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Password:	</td>
				<td><form:input type="password" path="password"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Log In"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>