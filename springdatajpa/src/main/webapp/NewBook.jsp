<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add new book</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body style="margin-top: 35px">
	<div class="container">
		<h2 class="display-4">Add New Book</h2>
		<br>
		<hr>
		<form action="addnewbook" method="post">
			<table>
				<tr>
					<td>Book Id</td>
					<td><input type="number" name="bookid" required
						autocomplete="off" class="form-control"></td>
				</tr>
				<tr>
					<td>ISBN</td>
					<td><input type="text" name="isbn" required autocomplete="off"
						class="form-control"></td>
				</tr>
				<tr>
					<td>Title</td>
					<td><input type="text" name="title" required
						autocomplete="off" class="form-control"></td>
				</tr>
				<tr>
					<td>Author Name</td>
					<td><input type="text" name="author" required
						autocomplete="off" class="form-control"></td>
				</tr>
				<tr>
					<td>Publisher Name</td>
					<td><input type="text" name="publisher" required
						autocomplete="off" class="form-control"></td>
				</tr>
				<tr>
					<td>Publication Year</td>
					<td><input type="number" name="publication_year" required
						autocomplete="off" class="form-control"></td>
				</tr>
				<tr>
					<td>Genre</td>
					<td><input type="text" name="genre" required
						autocomplete="off" class="form-control"></td>
				</tr>
				<tr>
					<td>Description</td>
					<td><input type="text" name="description" required
						autocomplete="off" class="form-control"></td>
				</tr>
				<tr>
					<td>Pages</td>
					<td><input type="number" name="pages" required
						autocomplete="off" class="form-control"></td>
				</tr>
				<tr>
					<td>Price</td>
					<td><input type="number" name="price" required
						autocomplete="off" class="form-control"></td>
				</tr>
				<tr>
					<td>Language</td>
					<td><input type="text" name="language" required
						autocomplete="off" class="form-control"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit"
						class="btn btn-primary"></td>
					<td></td>
				</tr>
			</table>
		</form>
		<br> <a href="back">Go for different Operation</a>
	</div>
</body>
</html>