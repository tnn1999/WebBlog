<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body>


	<div class="container">
		<h3 style="color: red; text-align: center">${error}</h3>
		<h2 style="text-align: center">Login Page</h2>
		<form class="form-horizontal" action="/Assignment4/login"
			method="post" method="get">

			<div class="form-group">
				<label class="control-label col-sm-2" for="user">User:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="user"
						placeholder="Enter username" name="user">
				</div>

			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="pwd">Password:</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="pwd"
						placeholder="Enter password" name="pwd">
				</div>

			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Login</button>
				</div>

			</div>



		</form>

	</div>
</body>
<%@ include file="footer.jsp"%>
</html>