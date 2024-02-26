<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Search Result</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body style="margin-top: 35px">
	<div class="container">
		<h2>Search result on pages less than the specified number</h2>
		<hr>
		<br>
		<br>
		<table class="table table-bordered table-hover">
			<tr>
				<th>Book ID
				<th>Isbn
				<th>Title
				<th>Author
				<th>Publisher
				<th>Publication Year
				<th>Genre
				<th>Description
				<th>Pages
				<th>Price
				<th>Language
			</tr>

			<c:forEach items="${lst}" var="lst">
				<tr>
					<td>${lst.bookid }
					<td>${lst.isbn}
					<td>${lst.title }
					<td>${lst.author }
					<td>${lst.publisher }
					<td>${lst.publicationyear }
					<td>${lst.genre }
					<td>${lst.description }
					<td>${lst.pages }
					<td>${lst.price }
					<td>${lst.language }
				</tr>
			</c:forEach>


		</table>
	</div>


</body>
</html>