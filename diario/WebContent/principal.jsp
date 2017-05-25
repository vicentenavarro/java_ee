<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>Numero de usuarios logados: ${applicationScope.numeroUsuarios}&nbsp;&nbsp;&nbsp;<a href="logOut">LogOut</a></div>
<div>Hola: ${sessionScope.usuario.nombre}</div>	
	<form action="NuevaEntrada" method="post">
		<textarea name="texto"></textarea>
		<br>
		<button type="submit">Insertar</button>
	
	</form>
	<table>
	<tr>
		<th>Texto</th>
		<th>Fecha</th>
	</tr>
	<c:forEach items="${lista}" var="entrada">
	<tr>
		<td>${entrada.texto}</td>
		<td><fmt:formatDate value="${entrada.fecha}"/></td>
		
		<td>
			<form action="Borrar" method="post">
			<input type="hidden" name="id" value="${entrada.id}"/>
			<button type="submit">Borrar</button>
			</form>
		</td>
	</tr>
	</c:forEach>
	</table>
	


</body>
</html>