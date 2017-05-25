<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/cssStyle.css" />
<title>Viajes Navarro</title>
</head>

<body>
<header>
	Viajes Navarro
</header>

	<div>${initParam.Promocion}</div>
<table>

	
	<tr>
		<td>Numero de usuarios viendo el sitio web:</td>
		<td>${numeroUsuarios}</td>
	</tr>
</table>
<br>
<a href="ListadoGeneral">Ir al listado completo de viajes</a>
<br/>
<a href="buscar.html">Buscar anuncios</a>

</body>
</html>