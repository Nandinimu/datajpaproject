<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update number</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body style="margin-top: 35px">
	<div class="container">
		<h2 class="display-4">Update new Mobile Number</h2>
		<br>
		<hr>
		<form action="updatemobile" method="post">
			<table>
				<tr>
					<td>Member Id</td>
					<td><input type="number" name="memberid" required
						autocomplete="off" class="form-control"></td>
				</tr>
				<tr>
					<td>New Mobile Number</td>
					<td><input type="text" name="mobile" required
						autocomplete="off" class="form-control"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit"
						class="btn btn-primary"></td>
					<td></td>
				</tr>
			</table>
		</form>
		<br> <a href="backto">Go for different Operation</a>
</body>
</html>