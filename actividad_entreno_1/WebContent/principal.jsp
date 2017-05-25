<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList,modelos.Contactos" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agenda de Contactos</title>
</head>
<body>

	<table>
		<tr>
			<td>Nombre</td>
			<td>Telefono</td>
		</tr>
		<% ArrayList<Contactos> listado=(ArrayList<Contactos>)request.getAttribute("listado");
		for(Contactos c : listado){
		%>
		<tr>
			<td><% c.getUsuario(); %></td>
			<td><% c.getTelefono(); %></td>
		</tr>
		<% } %>
	</table>
	<form action="Principal" method="POST">
		<label for="usuario">Nombre: </label> 
		<input type="text" name="nombre" id="usuario" placeholder="Introduzca el nombre" /> 
		<br /> 
		<label for="telefono">Telefono: </label> 
		<input type="text" name="telefono" id="telefono" placeholder="Introduzca el telefono" />
		<br/>
		<button type="submit">Enviar</button>
	</form>
	<a href="Principal">Recargar</a>
</body>
</html>