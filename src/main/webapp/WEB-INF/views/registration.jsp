<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="margin: 0; padding: 0;">
	<div class="container-fluid" style="display: flex;width: 100vw;height:100vh;justify-content: center;align-items: center; font-weight: bolder;">	
	<form:form action="saveUser" method="post" modelAttribute="user"  style="border: solid 1px;height: 45vh;padding: 1%;display: flex;">
		<table>
			<form:hidden path="userId"/>
			<tr>
				<td>Name:	</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Password:	</td>
				<td><form:input type="password" path="password"/></td>
			</tr>
			<tr>
				<td>Email:	</td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td>Phone Number:	</td>
				<td><form:input path="phoneNo"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Register" style="width: 100%;"/></td>
			</tr>
		</table>
	</form:form>
	</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</html>