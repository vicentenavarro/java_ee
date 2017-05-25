<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form=action="ServletTienda" method="POST">
	<input type="hidden" name="opcion" value="2"/>
	<label for="idProducto">identificador el producto</label>
	<input type="number" name="idProducto" placeholder="ID del producto aquí"/>
	<button type="submit">Enviar</button>
</form>

</body>
</html>