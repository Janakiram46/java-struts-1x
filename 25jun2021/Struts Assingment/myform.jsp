<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<html:form action="/simpleform">
   <table>
      <tr>
          <th>Id</th>
          <td><html:text property="id" /></td>
     </tr>
     <tr>
          <th>Name</th>
          <td><html:text property="name" /></td>
     </tr>
     <tr>
          <th>Mobile Number</th>
          <td><html:text property="mobileno" /></td>
     </tr>
      <tr>
          <th>City</th>
          <td><html:text property="city" /></td>
     </tr>
     <tr>
      <td> <html:submit property="method" value="store"></html:submit> </td>
   </table>
   </html:form>

</body>
</html>