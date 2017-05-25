<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tienda</title>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
</head>
<body>
<div>${oferta}</div>
<div>Listado de productos</div>
<table>
<tr>
<td>ID</td><td>Nombre</td><td>Precio</td>
</tr>
	<c:forEach items="${lista}" var="producto"/>
	<tr>
		<td><c:out value="${producto.idProducto}"/><td>
		<td><c:out value="${producto.nombre}"/></td>
		<td><c:out value="${producto.precio}"/></td>
		<td>
			<form action=/ServletTienda" method="POST">
				<input type="hidden" name="opcion" value="3"/>
				<input type="hidden" name="idProducto" value="${producto.idProducto}">
				<button type="submit">Añadir al carrito</button>
			</form>
			
			<%--<a href="ServletTienda (Mirar en el suyo) --%>	
		</td>
		</tr>
</table>

<a href="index.jsp">Volver</a>

</body>
</html>