<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
		<tr>
			<td>ID</td>
			<td>Nombre</td>
			
			<td></td>
		</tr>
		<c:forEach items="${lista}" var="anuncios">
			<tr>
				<td>${producto.id}</td>
				<td>${producto.texto}</td>
				
				
			</tr>
		</c:forEach>

	</table>
	<a href="index.jsp">Volver</a>

</body>
</html>