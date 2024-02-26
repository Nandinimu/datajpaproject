<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Operations on members</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body style="margin-top: 35px">
	<div class="container">
		<h2 class="display-4">All Operations on Members</h2>
		<br>
		<hr>
		<br> <a href="addmember">Add New Member</a> <br>
		<br> <a href="updatemob">Modify Mobile Number</a> <br>
		<br> Search Member by name here
		<form name="frm" method="post" action="searchMembername">
			Name : <input type="text" name="name" required> <input
				type="submit" value="search">
		</form>
		<br>
		<br> Search members on joining year after specified year
		<form name="frm" method="post" action="searchMemberyear">
			Year : <input type="number" name="joiningyr" required> <input
				type="submit" value="search">
		</form>
		<br>
		<br>
		<br> <a href="return">Home</a>
	</div>
</body>
</html>