<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second</title>
</head>
<body>
	<%out.println(session.isNew()); %>
	<%out.println(session.getId()); %>
	<%session.setAttribute("three", "rice"); %>
	<%out.println(session.getAttribute("one")); %>
	<%out.println(session.getAttribute("two")); %>
	
	<%session.invalidate(); %>
	<a href="third.jsp">Next</a>
</body>
</html>