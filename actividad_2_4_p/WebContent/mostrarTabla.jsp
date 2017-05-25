<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tabla de Multiplicar</title>
</head>
<style>
	div {
		border:1px;
		border-style: solid;
		background-color:lightgreen;
		box-shadow:2px 2px 5px green;
		}
	a{
		align:center
	}
</style>
<body>
	<div>
		<table>
			<%
				Integer a=(Integer)request.getAttribute("a");
			%>
			<thead>
				<td colspan="10">Tabla de multiplicar del <%=a%></td>
			</thead>
			<tr>
				<%
					for (int i=1;i<=10;i++){
				%>
				<td><%=i%></td>
				<%} %>
			</tr>
			<tr>
				<%
				for(int i=1;i<=10;i++){
				%>
				<td><%=(i * a)%></td><%
				}
				%>
			</tr>
		</table>
		</div>
		<br>
		<a href="index.html">Volver</a>
				
	
	
	


</body>
</html>