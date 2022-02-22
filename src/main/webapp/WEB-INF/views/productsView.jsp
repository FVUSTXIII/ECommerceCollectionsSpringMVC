<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Products</h1>
	<form:form action="searchByName" method="post" modelAttribute="product">
		<form:input type="text" path="name" placeholder="Search Products..." />
		<input type="submit" value="search"/>
	</form:form>
	
	<table>
		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Product Category</th>
			<th>Price</th>
			<th>Available</th>
			<th></th>
		</tr>
		<c:forEach items="${products}" var = "prod">
			<form:form action="addToKart" method="post" modelAttribute="product">
			<tr>
				<form:hidden path="id" value="${prod.id}"/>
				<td>${prod.id} </td>
				<form:hidden path="name" value="${prod.name}"/>
				<td>${prod.name} </td>
				<form:hidden path="category" value ="${prod.category}"/>
				<td>${prod.category} </td>
				<form:hidden path="price" value = "${prod.price}"/>
				<td>${prod.price} </td>
				<form:hidden path="quantity" value = "${prod.quantity}"/>
				<td>${prod.quantity} </td>
				<c:choose>
   					<c:when test="${prod.quantity > 0}"><td><input type = "submit" value ="add to cart"/></td></c:when> 
   
   					<c:otherwise><td><input type = "submit" value ="Out of Stock" disabled/></td></c:otherwise> 
				</c:choose>
				
			</tr>
			</form:form>
		</c:forEach>
	</table>
	<c:choose>
   		<c:when test="${cartSize > 0}"><div><a href="viewCart?userId=${user.userId}">View Cart</a> (<span>${cartSize}</span>)</div></c:when> 
   
   		<c:otherwise><div><a href="viewCart?userId=${user.userId}">View Cart</a></div></c:otherwise> 
	</c:choose>
	
</body>
</html>