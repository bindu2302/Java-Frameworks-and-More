<%@ page import="java.time.LocalDate" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
LocalDate date = LocalDate.now(); 

%>


<h5>Date: <%= date %></h5>
	<h3> Welcome ${ username } </h3>
</body>
</html>