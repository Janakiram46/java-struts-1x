<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Open Tickets</h1>
	<table class="table table-info">

		<thead class="thead-dark">
			<tr>
				<th>Ticket Id</th>
				<th>Subject</th>				
				<th>Description</th>
				<th>User Name</th>
				<th>Admin Name</th>
				<th>Status</th>
				<th>Date</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${admin}" var="x">
				<tr>
					<td>${x.ticketid}</td>
					<td>${x.subject}</td>
					<td>${x.description}</td>
					<td>${x.byusername}</td>
					<td>${x.toadminname}</td>
					<td>${x.status}</td>
					<td>${x.dateraised}
				</tr>
			</c:forEach>

		</tbody>

	</table>	
</body>
</html>