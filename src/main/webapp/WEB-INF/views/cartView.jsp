<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Cart</title>
</head>
<body>
	<c:set var="date" scope="session" value="${fecha}"/>
		<h3> <c:out value="${ date }"></c:out></h3>
	<table class="table">
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
	<div class="center-block" style="width: 100vw; text-align: center;">
		<a href="transactionsHistory?date=${ date }" >Proceed With Payment</a>
	</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</html>