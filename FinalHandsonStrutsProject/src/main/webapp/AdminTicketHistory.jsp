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
  background-image: url("Admin.jpg");
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
</head>
<body>
<h1> Admin Review</h1>
 <div align="center" style="color:red">
    	
    
    <form method="post" >
        Message :<html:text name="historyForm" property="message"  /><br>
        <input type="submit" placeholder="submit" />
    </form>
    </div>
</body>
</html>