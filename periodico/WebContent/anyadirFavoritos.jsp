<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Favoritos</title>
</head>
<body>
<h1>Listado de Favoritos</h1>
<br>
<table>
	<c:forEach items="${sessionScope.favoritos}" var="anuncio">
	<tr>
		<td>${anuncio.texto}</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>