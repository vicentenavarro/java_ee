<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
		background-color:lightyellow;
		}
</style>
<body>

	<div>
		<p>Sesion:
		<%=request.getAttribute("id") %>
		</p>
		<p>
		Número de peticiones en una sesion:
		<%=request.getAttribute("nSesion") %>
		</p>
	</div>
	<div>
		Número de peticiones total:
		<%=request.getAttribute("totalPeticiones") %>
	</div>
	<br>
	<div>
	<a href="CuentaAccesos">Recargar</a>
	</div>
	<div>
	<a href="CerrarSesion">Cerrar sesion</a>
	</div>

</body>
</html>