<%@page import="com.ipartek.modelo.I_Constantes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ipartek.modelo.dto.Habitacion"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
List<Habitacion> listaHabitaciones = new ArrayList<>();

if( request.getAttribute(I_Constantes.ATR_LISTA_HABITACIONES) !=  null){  
	listaHabitaciones = (List<Habitacion>)request.getAttribute(I_Constantes.ATR_LISTA_HABITACIONES); 
	
}
       
%>

<!DOCTYPE html>
<html lang="es">



<head>
    <meta charset="UTF-8">
    <title>Lista de Habitaciones</title>
    <link rel="stylesheet" href="styles/style_habitaciones.css">

</head>


<body>

	<h2>Lista de Habitaciones</h2>
	

			<table border="1">
				<thead>
					<th>#</th>
					<th>Habitación número</th>
					<th>Metros</th>
					<th>Precio</th>
					<th>Número de camas</th>
					<th>Exterior</th>
					
				</thead>
				<tbody>


					<%for (Habitacion elem : listaHabitaciones) {%>
					<tr>
						<th><%=elem.getId_habitacion()%></th>
						<th><%=elem.getNumHabitacion()%></th>
						<th><%=elem.getMetros()%> m²</th>
						<th><%=String.format("%.2f", elem.getPrecio())%> €</th>
						<th><%=Math.round(elem.getNumeroCamas())%></th>
						<th><%= elem.getExterior() ? "con" : "sin" %></th>
						
					</tr>
					<%}%>
				</tbody>
			</table>
		
	
</body>
</html>