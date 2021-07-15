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
  background-image: url("cinqueterre.jpg");
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
<script type="text/javascript">
var username=sessionStorage.getItem("name");
alert(" logged out successfully");
</script>
<body>

   <form >
       <h3 align="center"></i> logged out successfully!</h3>
        <h3 align="center"><a href="user.do">Loginpage</a></h3>
    </form>
</body>
</html>