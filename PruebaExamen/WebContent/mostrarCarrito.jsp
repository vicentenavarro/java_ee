<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
<div>Listado de productos</div>
<table>
<tr>
<td>ID</td><td>Nombre</td><td>Precio</td>
</tr>
	<c:forEach items="${carrito}" var="producto"/>
	<tr>
		<td>"${producto.idProducto}"/><td>
		<td>"${producto.nombre}"/></td>
		<td>"${producto.precio}"/></td>
		
	</tr>
	</c:forEach>
</table>
<div>Precio total a pagar:${precioTotal}</div>
</body>
</html>