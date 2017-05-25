<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Series</title>
</head>
<body>

	<%@page import="java.util.Random" %>
	
	<%
		String sNseries=request.getParameter("nseries");
		try{
			int nSeries=Integer.parseInt(sNseries);
			Random rnd=new Random(System.currentTimeMillis());
		
	%>
	<table>
		<%
			for(int i=0;i<nSeries;i++){
		%>
		<tr>
			<td class="cabezera">Serie número: <%=i+1 %></td>
			<%
				for (int z=0;z<6;z++){
					int n=rnd.nextInt(49)+1;
				
			%>
			<td class="celda"><%=n %></td>
			<% } %>
		</tr>
		<% } %>
		<tr>
		<td class="pie" colspan="7"><a href="index.html">Inicio</a>
		</tr>
	</table>
	<%
		}
		catch(NumberFormatException nfe){
			}
	%>
		

</body>
</html>