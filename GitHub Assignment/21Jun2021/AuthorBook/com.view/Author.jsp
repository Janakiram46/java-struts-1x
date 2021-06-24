<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"></script>
</head>
<body>

	<form action="BookServlet.do" method="post">
		<table>
			<tr>
				<th>Book Id</th>
				<td><input type="text" name="bookid"></td>
			</tr>
			<tr>
				<th>Book Name</th>
				<td><input type="text" name="bookname"></td>
			</tr>
			<tr>
				<th>Book Price</th>
				<td><input type="text" name="bookprice"></td>
			</tr>

			<tr>
				<th>Author Id</th>
				<td><select name="authorId">
						<c:forEach items="${Authorlist}" var="x">
							<option value="${x.authorId}">${x.authorName}</option>
						</c:forEach>
				</select>
				</td>
			</tr>
			
			<tr>
				<th>Book Pages</th>
				<td><input type="text" name="bookpages"></td>
			</tr>
		
		<tr>
        <td><input type="submit" class="btn btn-primary"></td>
        </tr>
         </table>  
           
		<table class="table table-hover">
		
			<thead>
				<tr>
					<th>Book Id</th>
					<th>Book Name</th>
					<th>Book Price</th>
					<th>Author Id</th>
					<th>Book Pages</th>
				</tr>
			</thead>

			<tbody>

				<c:forEach items="${bookList}" var="x">
					<tr>
						<td>${x.bookId}</td>
						<td>${x.bookName}</td>
						<td>${x.bookPrice}</td>
						<td>${x.authorId}</td>
						<td>${x.pages}</td>
					</tr>
				</c:forEach>
				
			</tbody>
			
		</table>
	</form>

</body>
</html>