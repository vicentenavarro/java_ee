<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="HacerLogin" method="post">
		<label for="nombre">Nombre: </label>
			<input type="text" name="nombre" placeholder="Nombre de usuario"/>
		<br>
		<label for="password">Nombre: </label>
		<input type="password" name="password" placeholder="Contraseña"/>
		<br>
		<button type="submit"> Enviar</button>
	</form>
</body>
</html>