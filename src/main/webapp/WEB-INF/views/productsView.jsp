<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style = "margin: 0; padding:0";>
 	<div style="width: 100vw; text-align : center;"> <h1>Products</h1></div>
	<div style="display: flex; width: 100vw; justify-content: center;">
		<div style="display: block;">
			<form:form action="searchByName" method="post" modelAttribute="product">
			<form:input type="text" path="name" placeholder="Search Products..." />
			<input type="submit" value="search"/>
		</div>
	</form:form>
	</div>
	
	<div style="height: 50vh; display: flex; align-items: center; ">
	 <div style="display: flex; width: 100vw; justify-content: center; text-align: center;">
	 	<table class="table">
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
	 </div>
	</div>
	<c:choose>
   		<c:when test="${cartSize > 0}"><div style="width: 100vw; text-align: center;"><a href="viewCart?userId=${user.userId}">View Cart</a> (<span>${cartSize}</span>)</div></c:when> 
   
   		<c:otherwise><div style="width: 100vw; text-align: center;"><a href="viewCart?userId=${user.userId}">View Cart</a></div></c:otherwise> 
	</c:choose>
	
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</html>