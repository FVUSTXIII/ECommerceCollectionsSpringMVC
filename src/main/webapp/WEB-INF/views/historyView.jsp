<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
</html>