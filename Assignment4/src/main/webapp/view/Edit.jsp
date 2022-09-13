<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Clean Blog </title>
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
<!-- Font Awesome icons (free version)-->
<script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js"
	crossorigin="anonymous"></script>
<!-- Google fonts-->
<link
	href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic"
	rel="stylesheet" type="text/css" />
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800"
	rel="stylesheet" type="text/css" />
<!-- Core theme CSS (includes Bootstrap)-->
<link
	href="${pageContext.request.contextPath}/template/web/css/styles.css"
	rel="stylesheet" />
</head>
<body>



	<div class="container">
		<h5 style="color: red">${error}</h5>
		<form action="PreEdit" method="POST">
			<input type="hidden" class="form-control" name="id"
				value="${thisNews.getId()}">
			<div class="form-group">
				<label for="">Title</label> <input type="text" class="form-control"
					name="title" value="${thisNews.getTitle()}">
			</div>
			<div class="form-group">
				<label for="">Author</label> <input type="text" class="form-control"
					name="author" value="${thisNews.getAuthor()}" readonly="readonly">
			</div>
			<div class="form-group">
				<label for="">Short Description</label>
				<textarea class="form-control" name="shortdescription" rows="=2">${thisNews.getShortdescription()}</textarea>
			</div>
			<div class="form-group">
				<label for="">Content</label>
				<textarea class="form-control" name="contents" rows="4">${thisNews.getContent()}</textarea>
			</div>
			<div class="form-check">
				<input type="checkbox" class="form-check-input" name="status"
					<%-- ${(thisNews.getStatus == 0) ? "" : "checked"} --%> value="Published">
				<label class="form-check-label" for="">Published</label>
			</div>
			<br>
			<button type="submit" class="btn btn-lg btn-info">Submit</button>
		</form>
	</div>

	<%@include file="footer.jsp"%>
</body>
</html>