<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table.center {
	margin-left: auto;
	margin-right: auto;
}

html, body {
	width: 100%;
}
body {
  background-image: url("Admin2.jpg");
  background-repeat: no-repeat;
   background-size: cover;
    width: 100%;
    height: 100%;
}
a:link {
  color:pink ;
  background-color: transparent;
  text-decoration: none;
}
a:visited {
  color: pink;
  background-color: transparent;
  text-decoration: none;
}

a:hover {
  color: red;
  background-color: transparent;
  text-decoration: underline;
}

a:active {
  color: yellow;ound-color: transparent;
  text-decoration: underline;
}
</style>
</head>
<body>
<h1 align="center">Admin Home Page</h1>
<p align="right" style="color:white">
		<a href="profile.do"> Admin Profile </a>
	</p>
	<table class="center">
		<tr>

			<td style="color: white">Open Tickets :</td>
             <td> <a href="admin.do"> Click Open Tickets</a></td>
			

		</tr>
		
		<tr>

			<td style="color: white">Ticket History :</td>

			<td> <a href="tickethistory.do">Click Ticket History </a></td>

		</tr>
		
		<td><a href="logout.do">logout</a></td>
		
		</table>
</body>
</html>