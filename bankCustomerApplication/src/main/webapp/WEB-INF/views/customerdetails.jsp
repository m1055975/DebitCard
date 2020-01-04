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

<title>Home page</title>
</head>
<body>
	<h1>Register Customer</h1>
	<form action="/customerdet">
		<div class="container text" style="border: 1px solid block"
			align="center">

			<div class="form-group">
				<label for="customerName">Customer Name : </label> <input
					type="text" class="form-control" id="customerName"
					placeholder="Enter Customer Name" name="customerName">
			</div>
			<div class="form-group">
				<label for="age">Age : </label> <input type="number"
					class="form-control" id="age" placeholder="age" name="age">
			</div>

			<div class="button">
				<a href="/customer"><button type="submit"
						class="btn btn-primary">Submit</button></a> <a href="/index"><button
						type="button" class="btn btn-primary">Back</button></a>
			</div>

		</div>
	</form>

</body>
<script>
	$('form').validate({
		rules : {
			customerName : {
				required : true,
				lettersonly : true,
				minlength : 5,
				maxlength : 30,
			},
			age : {
				required : true,
				min : 21,
			}
		}
	});
</script>
</html>
