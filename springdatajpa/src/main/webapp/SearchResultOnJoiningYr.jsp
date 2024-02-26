<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Member Search Result</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body style="margin-top: 35px">
	<div class="container">
		<h2>Search result on joining year after specified year</h2>
		<hr>
		<br>
		<br>
		<table class="table table-bordered table-hover">
			<tr>
				<th>Member ID
				<th>Name
				<th>Gender
				<th>Age
				<th>Mobile
				<th>Joining Year
			</tr>
			<c:forEach items="${lst}" var="lst">
				<tr>
					<td>${lst.memberid }
					<td>${lst.name}
					<td>${lst.gender }
					<td>${lst.age }
					<td>${lst.mobile }
					<td>${lst.joiningyr }
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>