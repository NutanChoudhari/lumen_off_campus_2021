<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<%out.println(session.isNew()); %>
	<%out.println(session.getId()); %>
	<%session.setAttribute("one", "sugar"); %>
	<a href="first.jsp">Next</a>
</body>
</html>