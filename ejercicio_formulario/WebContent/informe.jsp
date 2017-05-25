<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:include page="cabecera.jsp"/>
	<%
	String nombre= request.getParameter("nombre");
	String apellidos= request.getParameter("apellidos");
	String telefono= request.getParameter("telefono");
	String numero =request.getParameter("numero");
	int num= Integer.parseInt(numero);
	%>
	<body>
	<%
		if(num%2==0){
	%>
			<p><%@ include file="/multiplo2.html" %></p>
	<%
		}
		if(num%3==0){
	%>
			<h1>Es multiplo de 3</h1>
	<% }
	
		if(num%5==0){
	%>
	
		<h1>Es multiplo de 5</h1>
	<% }%>
		
	
			<h2>Datos introducidos:</h2>
			
			<p>Nombre: <%=nombre %></p>
			<p>Apellidos: <%=apellidos %></p>
			<p>Telefono: <%=telefono %></p>
			<p>Numero: <%=numero %></p>
			<br>
			<p><a href="index.html">Volver</a></p>
		
	
	</body>

<jsp:include page="footer.jsp"/>
