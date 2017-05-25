<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="javax.servlet.http.Cookie"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table {
	border: solid;
	border-width: 1px;
	bordercolor: black;
	cellpadding:0px;
	cellspacing:0px;
	border-collapse:collapse;
}
td{
	border: solid;
	border-width: 1px;
	bordercolor: black;
}
tr .center{
	text-align:center;
	font-weight:bold;
}
</style>
</head>
<body>
	<table>
		<thead>
			<tr id="center">
				<td>Nombre de la cookie</td>
				<td>Valor de la cookie</td>
			</tr>
		</thead>
	<%
		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {
	%>
	
		<tr>
			<td><%=c.getName()%></td>
			<td><%=c.getValue()%></td>
		</tr>
    <%
		}
	%>
	</table>
	<a href="index.html">Volver</a>
</body>
</html>