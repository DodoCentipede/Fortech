<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*"%>
<%@ page import="entities.*" %>
<%@ page import="model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PeopleRezervations</title>
</head>
<body>

<table cellpadding="4" cellspacing="3" border="0">
	<tr> 
		<th>idUser</th>
		<th>seatNumber</th>
		<th>tipeTicket</th>
	</tr>
	<c:forEach var="f" items="${sessionScope.contNext}">
		<tr>
			<td>${f.p.idUser}</td>
			<td>  ${f.p.seatNumber}</td>
			<td>  ${f.p.tipeTicket}</td>			
		</tr>
	</c:forEach>
	</table>
</body>
</html>