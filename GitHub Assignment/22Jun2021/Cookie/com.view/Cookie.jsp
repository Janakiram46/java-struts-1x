<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" ></script>
</head>
<body>
<form action="CookieHandler">
CookieData::<b>${cookie.message.value}</b> </br>
ModifyCookieData<input type="text"" name="message"></br>
<button type="submit" class="btn btn-danger">Add Cookie</button>
</form>
</body>
</html>