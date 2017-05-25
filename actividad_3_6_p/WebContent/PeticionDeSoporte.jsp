 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="dao.ResultadoCRUD"%>
<jsp:useBean id="PeticionSoporteBean" scope="request" class="modelos.PeticionSoporteBean">
	<jsp:setProperty name="PeticionSoporteBean" property="email"
		param="email"/>
	<jsp:setProperty name="PeticionSoporteBean" property="sistema"
		param="so"/>
	<jsp:setProperty name="PeticionSoporteBean" property="software"
		param="sw"/>
	<jsp:setProperty name="PeticionSoporteBean" property="problema"
		param="problema"/>
</jsp:useBean>
<jsp:useBean id="DAOPeticion" scope="request"
	class="dao.DAOPeticion" />"
<%
	if (DAOPeticion.create(PeticionSoporteBean) == ResultadoCRUD.OK) {
%>
<jsp:forward page="Registrado.html" />

<%
	} else {
%>
<jsp:forward page="NoRegistrado.html" />
<%
	}
%>