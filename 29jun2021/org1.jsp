<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Accordion - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#accordion" ).accordion({
       collapsibe: true,
       active: false
    });
  } );
  </script>
</head>
<body>

<div id="accordion">
 <c:forEach items="${authors}" var="x">
  <h3>${x.name}</h3>
  <div>
      <h3><i>${x.name}</i> Author wrote some of the books such as </h3>
      <ul>
        <c:forEach items="${x.books}" var="y">
          <li><b>The Book called ${y.name}</b> contains<i> ${y.pages}</i> pages with price of <i> ${y.price}</i> rs .</li>
        </c:forEach>

      </ul>
  </div>

 </c:forEach>

  </div>


</body>
</html>