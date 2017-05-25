<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/cssStyle.css" />
<title>Insert title here</title>
</head>
<body>
<header>
	Viajes Navarro
</header>
	<h1>Resultados de la busqueda</h1>
	<table>
	<tr>
			<td>Id Viaje</td>
			<td>Destino</td>
			<td>D�as</td>
			<td>Precio</td>
			
	</tr>
		<c:forEach items="${lista}" var="viajes">
			<tr>
				<tr>
				<td>${viajes.id}</td>
				<td>${viajes.destino}</td>
				<td>${viajes.destino}</td>
				<td>${viajes.precio}Euros</td>
				<td><a href="AnadirFavoritos?destino=${viajes.destino}">A�adir Favoritos</a></td>
			</tr>
			
		</c:forEach>
	</table>
	<br>
	<a href="Inicio">Inicio</a>

</body>
</html>