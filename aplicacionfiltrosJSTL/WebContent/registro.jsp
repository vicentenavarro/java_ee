<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="dao.ResultadoCRUD,java.util.ArrayList,modelos.UsuarioBean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<body>
<jsp:useBean id="usuario" class="modelos.UsuarioBean" scope="request">
	<jsp:setProperty name="usuario" property="nombre"/>
	<jsp:setProperty name="usuario" property="edad" value="${edad}"/>
	<%--${} --%>
</jsp:useBean>

<jsp:useBean id="dao" class="dao.DaoUsuario" scope="application"/>

<%
	if(dao.insertar(usuario,request.getParameter("contraseña"))==ResultadoCRUD.OK){
		ArrayList<UsuarioBean> lista=dao.listar();
		request.setAttribute("lista",lista);
%>
<div>Usuarios registados hasta ahora</div>
<table>
	<tr>
		<td>Nombre</td>
		<td>Edad</td>
	</tr>
			<c:forEach items="${lista}" var="u" >
			
	<tr>
		<td><c:out value="${u.nombre}"></td>
		<td><c:out value="${u.edad}"</td>
	</tr>
	</c:forEach>
</table>
<%}
	else{
%>
<div>Usuario ya existe</div>
<%}%>
</body>
</html>