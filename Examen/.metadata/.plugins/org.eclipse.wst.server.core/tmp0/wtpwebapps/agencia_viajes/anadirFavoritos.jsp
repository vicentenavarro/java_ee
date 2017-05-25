<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/cssStyle.css" />
<title>Página de favoritos</title>
</head>
<body>
<header>
	<h1>Viajes Navarro</h1>
</header>
	<div>Favorito añadido</div>
	<table>
		<c:forEach items="${sessionScope.favoritos}" var="viajes">
			<tr>
				<td>${viajes.destino}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="Inicio">Volver </a>

</body>
</html>