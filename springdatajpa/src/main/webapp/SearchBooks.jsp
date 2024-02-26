<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Books</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body style="margin-top: 35px">
	<div class="container">
		<h2 class="display-4">Search your Books here</h2>
		<br>
		<hr>
		<br> Search book on book ID
		<form class="frm" method="post" action="searchBookid">
			Book Id <input type="Number" name="bookid" required> <input
				type="submit" value="Search">
		</form>
		<br> Search book on Genre
		<form class="frm" method="post" action="searchBookgenre">
			Book Genre <input type="text" name="genre" required> <input
				type="submit" value="Search">
		</form>
		<br> Search book on author
		<form class="frm" method="post" action="searchBookauthor">
			Author <input type="text" name="author" required> <input
				type="submit" value="Search">
		</form>
		<br> Search book for price range between
		<form class="frm" method="post" action="searchBookBtnRange">
			Range between min: <input type="number" name="minPrice" required>
			to max: <input type="number" name="maxPrice" required> <br>
			<input type="submit" value="Search">
		</form>
		<br> Search book on genre and language
		<form class="frm" method="post" action="searchBookGenreNdLang">
			Genre : <input type="text" name="genre" required> and
			Language : <input type="text" name="language" required> <br>
			<input type="submit" value="Search">
		</form>
		<br> Search book on pages less than the specified number
		<form class="frm" method="post" action="searchBookPagesLessThan">
			Number of Pages <input type="number" name="pages" required> <input
				type="submit" value="Search">
		</form>
		<br> Search book on Publication Year
		<form class="frm" method="post" action="searchBookPublicationYr">
			Publication Year <input type="text" name="publicationyear" required>
			<input type="submit" value="Search">
		</form>
		<br> <br> <a href="back">Go for different Operation</a>
	</div>
</body>
</html>