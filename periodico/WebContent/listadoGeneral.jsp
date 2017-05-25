<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado General</title>
</head>
<body>

	<div>Listado general de anuncios</div>
	<div>----------------------------</div>
	
	<table>
	<c:forEach items="${lista}" var="anuncio">
		<tr>
			<td><a href="AnyadirFavorito?id?${anuncio.id}">${anuncio.texto}</a></td>
		</tr>
		
	</c:forEach>
	</table>
	<a href="paginaInicio">Volver</a>

</body>
</html>