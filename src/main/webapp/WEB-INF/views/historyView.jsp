<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Transaction History</title>
</head>
<body>
	<h1>Transaction History</h1>
	<c:forEach items="${history}" var = "transaction">
		<div style="display: inline-block;">
			<div>
				${transaction.key}
			</div>
			<div>
				<ul>
				<c:set var="total" value="0"/>
				<c:forEach items ="${transaction.value}" var = "transaction_item">
					
					<c:set var="item_name" scope="page" value="${transaction_item.item_name}"/>
					<c:set var="qty" scope="page" value="${transaction_item.qty}"/>
					<c:set var="price" scope="page" value="${transaction_item.price}"/>
					<li>
						<c:out value = "${item_name}"/> - <c:out value = "${qty}"/> - <c:out value = "${price}"/>
						<c:set var="total" value="${total + (qty * price)}"/>		
					</li>
					
					
				</c:forEach>
				</ul>
			</div>
		</div>
		<div>Total: <c:out value = "${total}"/></div>
			<c:set var="total" scope="session" value="0"/>
		<hr>
	</c:forEach>
	<a href="getProducts">Go back to products</a>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</html>