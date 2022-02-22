<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
</head>
<body>
	<h3>${ fecha }</h3>
	<table>
		<tr>
			<th>Product Name</th>
			<th>Price</th>
			<th>Quantity</th>
		</tr>
		<c:forEach items="${CartElements}" var ="cart_element">
		<tr>
			<td>${ cart_element.key.name }</td>
			<td>${ cart_element.key.price }</td>
			<td>${ cart_element.value }</td>
		</tr>
		</c:forEach>
	</table>
	<hr>
	<div>
		<span><b>Total:</b> ${ total }</span>
	</div>
	<div>
		<form:form>
		
		</form:form>
	</div>
</body>
</html>