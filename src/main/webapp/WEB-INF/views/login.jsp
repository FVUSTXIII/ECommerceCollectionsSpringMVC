<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>	
	<form:form action="login_" method="post" modelAttribute="credential" class="container-fluid" style="display: flex;width: 100vw;height:100vh;justify-content: center;align-items: center; font-weight: bolder;">
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
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</html>