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
  background-image: url("user12.jpg");
  background-repeat: no-repeat;
   background-size: cover;
    width: 100%;
    height: 100%;
}
a:link {
  color:white ;
  background-color: transparent;
  text-decoration: none;
}
a:visited {
  color: white;
  background-color: transparent;
  text-decoration: none;
}

a:hover {
  color: white;
  background-color: transparent;
  text-decoration: underline;
}

a:active {
  color: yellow;ound-color: transparent;
  text-decoration: underline;
}
</style>


</style>

</head>

<body>

<p align="right">
	<a href="profile.do">UserProfile</a>
</p>
<h1 align="center">User Home page</h1>
	<table class="center">

		<tr>
			<td style="color: white">Raise a Ticket :</td>
			<td> <a href="ticket.do">Click to Raise Ticket </a></td>
		</tr>
		<tr>
			<td style="color: white">Ticket History :</td>
			<td> <a href="UserTicketHistory.jsp">Click for Ticket History </a></td>
		</tr>
		<tr>
			<td style="color: white">Open Ticket :</td>
			<td> <a href="status.do">Open Tickets Here </a></td>
		</tr>
		
	</table>
	<p align="center">
	<a href="logout.do">Logout</a>
</p>
</body>
</html>