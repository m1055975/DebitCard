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
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"></script>

<title>Home page</title>
</head>
<body>
	<h1>Add Debit Card</h1>
	<form action="/debitcarddet">
		<div class="container text" style="border: 1px solid block"
			align="center">
			<label for="customerName">Customer Name :</label> <select
				name="customerId" id="customerId">
				<c:forEach items="${customer}" var="customer">
					<option value="${customer.customerId}">${customer.customerName}</option>
				</c:forEach>
			</select>
			<div class="form-group">
				<label for="dcNumber">Debit Card Number : </label> <input
					type="number" class="form-control" id="dcNumber"
					placeholder="Enter Debit Card number" name="dcNumber">
			</div>
			<div class="form-group">
				<label for="expiryDate">Expiry Date : </label> <input type="date"
					class="form-control" id="expiryDate"
					placeholder="Enter Expiry Date " name="expiryDate">
			</div>
			<div class="form-group">
				<label for="cardType">Type : </label> <select class="form-control"
					id="cardType" name="cardType">
					<option value="visa">VISA</option>
					<option value="master">MASTER</option>
				</select>
			</div>
			<div class="form-group">
				<label for="amount">Amount : </label> <input type="number"
					class="form-control" id="amount" placeholder="amount" name="amount">
			</div>

			<div class="button">
				<a href="/debitcard"><button type="submit"
						class="btn btn-primary">Submit</button></a>
				<a href="/index"><button
						type="button" class="btn btn-primary">Back</button></a>
			</div>
		</div>
	</form>

</body>
<script>
	$.validator.addMethod("expiryDate", function(value, element) {
		var curDate = new Date();
		var inputDate = new Date(value);
		if (inputDate >= curDate)
			return true;
		return false;
	}, "Invalid Date!");
	$('form').validate({
		rules : {
			dcNumber : {
				required : true,
				minlength : 16,
				maxlength : 16,
			},
			amount : {
				required : true,
				min : 50000,
			},
			expiryDate : {
				required : true,
				expiryDate : true,

			}
		}
	});
</script>
</html>
