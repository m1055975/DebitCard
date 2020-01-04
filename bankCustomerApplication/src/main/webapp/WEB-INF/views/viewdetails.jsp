<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"
	integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo="
	crossorigin="anonymous"></script>
<title>products page</title>
</head>
<body>

	<h1>View</h1>

	<c:forEach var="customers" items="${customers}">
		<h4>${ customers.customerName}</h4>
		<table border="1" width="70%" cellpadding="2">

			<tr>
				<th>Debit Card Number</th>
				<th>Expiry Date</th>
				<th>Age</th>
			</tr>

			<c:forEach var="customer" items="${customers.debitCards}">
				<tr>

					<td>${customer.dcNumber}</td>
					<td>${customer.expiryDate}</td>
					<td>${customers.age}</td>
				</tr>
			</c:forEach>

		</table>
	</c:forEach>
	<br>
	<br>
	<br>

</body>
</html>