<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Colores</title>
</head>
<body>
<%
		String color = request.getParameter("color");
		String nombre = request.getParameter("nombre");
		//Si no se pasa ningún parámetro a la jsp
		if (nombre == null) {
			response.sendRedirect("FormularioColores.html");
			//Te vuelve a redireccionar a formulario colores
			//porque no ha metido nada.
		} else {
			if (color.trim().isEmpty() || nombre.trim().isEmpty()) {
				//isEmpty comprueba si la cadena esta vacia
	%>
	<%@include file="/FormularioColoresConAviso.html"%>
	<!-- Si entra dentro de la condición te incluye en la página el html de la pagina
	formularioColoresConAviso -->
	<%
		} else {
	%>

<body bgcolor="<%=color%>">
<h2>Datos Introducidos</h2>
<p>
	Nombre: <font color="red"><%=nombre%></font>
</p>
<p>
	Color del fondo: <font color="red"><%=color%></font>
</p>
<a href="FormularioColores.html">Volver</a>
</body>
<%
	}
	}
%>
</html>