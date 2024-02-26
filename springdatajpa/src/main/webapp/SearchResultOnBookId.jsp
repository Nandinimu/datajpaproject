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
		<h2>Search result for book Id ${book.bookid}</h2>
		<hr>
		<br>
		<br>
		<table class="table table-bordered table-hover">
			<tr>
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
			<tr>
				<td>${book.isbn}
				<td>${book.title }
				<td>${book.author }
				<td>${book.publisher }
				<td>${book.publicationyear }
				<td>${book.genre }
				<td>${book.description }
				<td>${book.pages }
				<td>${book.price }
				<td>${book.language }
			</tr>
		</table>
	</div>

</body>
</html>