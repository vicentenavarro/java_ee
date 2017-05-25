<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/cssStyle.css" />
<title>Listado Viajes</title>
</head>
<body>
<header>
	Viajes Navarro
</header>
<div>Listado general de anuncios</div>
	<table>
		<tr id="tablaCab">
			<td>Id Viaje</td>
			<td>Destino</td>
			<td>Días</td>
			<td>Precio</td>
			
			
		</tr>
		<c:forEach items="${lista}" var="viajes">
			<tr>
				<td>${viajes.id}</td>
				<td>${viajes.destino}</td>
				<td>${viajes.duracion}</td>
				<td>${viajes.precio}Euros</td>
				<td><a href="AnadirFavoritos?destino=${viajes.destino}">Añadir Favoritos</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="Inicio">Volver</a>

</body>
</html>