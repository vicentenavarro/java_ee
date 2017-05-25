<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenido</title>
</head>
<body>

<table>
	<tr>
		<td>Numero de anuncios:</td>
		<td>${numeroAnuncios}<td>
	<tr>
	<tr>
		<td>Numeros de usuarios viendo el sitio web:</td>
		<td>${numeroUsuarios}
	</tr>
</table>
<a href="listadoGeneral.jsp">Listar productos</a>
<br>
<a href="buscar.html">Buscar anuncios</a>
</body>
</html>