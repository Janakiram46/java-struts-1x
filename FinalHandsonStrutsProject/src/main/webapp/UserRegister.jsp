<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
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
  background-image: url("user9.jpg");
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
  color: blue;
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
	<script type="text/javascript">
		function validation() {
			var username = document.getElementById("username").value;
			var password = document.getElementById("password").value;
			var mobilenumber = document.getElementById("mobilenumber").value;
			var address = document.getElementById("address").value;
			var email = document.getElementById("email").value;
			var atposition = email.indexOf("@");

			var dotposition = email.indexOf(".")
			if (username == "") {
				alert("Please enter username which must have alphabets only and length contains atleast 6 characters ...");
				return false;
			}
			if (password == "") {
				alert("Please enter your password which contains atleast 6 letters you can include symbols,numbers,alphabets...");
				return false;
			}

			if (mobilenumber == "")

			{
				alert("Please enter valid mobilenumber  only numbers which in between 10 and 12...");
				return false;
			}

			if (address == "")

			{
				alert("Please enter  proper address...");
				return false;
			}

			if (atposition < 1
					|| dotposition<atposition+2 || dotposition+2>email.length
					|| email == "")

			{
				alert("Please enter Email properly which contains @ and . symbol must...");
				return false;
			}
			return true;
		}
	</script>
	<h1 align="center">Registration Form</h1>
	<form onsubmit="return validation()" method="post">
		<table class="center">
			<tr>
				<td style="color: blue">User Name :</td>
				<td><input type="text" id="username" placeholder="Username"
					name="username" pattern="[a-zA-Z ]{6,}"
					title="name must be atleast 6 characters use only alphabets"></td>
			</tr>
			<tr>
				<td style="color: blue">Password :</td>
				<td><input type="password" id="password" placeholder="Password"
					name="password" pattern="[a-zA-Z0-9_ ]{6,}"
					title="Password must contain alphabets and only underscore symbol length atleast 6 characters"></td>
			</tr>
			<tr>
				<td style="color: blue">Mobile Number :</td>
				<td><input type="text" id="mobilenumber"
					placeholder="Mobile number" name="mobilenumber"
					pattern="[0-9]{10,12}" title="Mobilenumber must be 10 to 12 digit"></td>
			</tr>
			<tr>
			<tr>
				<td style="color: blue">Address :</td>
				<td><input type="text" id="address" placeholder="Address"
					name="address" pattern="[a-zA-Z0-9@#$%&*()'? ]{10,}"
					title="address must be 10 characters long you can use alphabets,symbols,numbers"></td>
			</tr>
			<tr>
				<td style="color: blue">Email :</td>
				<td><input type="text" id="email" placeholder="Email"
					name="email" title="email must contain @ and . symbols"></td>
			</tr>
		
			
		</table>
		<p align="center">
		<input type="submit" placeholder="Register"></p>
	</form>
</body>
</html>