
package com.ipartek.modelo;

public interface I_Constantes {
	
	//Constantes de la BD
	String BD = "jsp_hotel";
	String DRIVER = "com.mysql.cj.jdbc.Driver";
	String CONEXION = "jdbc:mysql://localhost:3306/"+BD;
	String USUARIO = "root";
	String PASS = "1234";
	
	//constantes de los archivos JSP
	String JSP_INDEX="index.jsp";	
	String JSP_SERVICIOS="servicios.jsp";
	String JSP_HABITACIONES="habitaciones.jsp";
	
	//CONSTANTES DE PROCEDURES
	String TABLA_HABITACIONES = "habitaciones";	
	String HABITACIONES_ID_HABITACION = "id_habitacion";
	String HABITACIONES_NUMERO_HABITACION = "numeroHabitacion";
	String HABITACIONES_METROS = "metros";
	String HABITACIONES_PRECIO = "precio";
	String HABITACIONES_NUMERO_CAMAS = "numeroCamas";	
	String HABITACIONES_EXTERIOR= "exterior";

	
	String ATR_LISTA_HABITACIONES = "listaHabitaciones";
		
	//STORED PROCEDURES	
	String SP_MOSTRAR_HABITACIONES_TODAS = "call sp_mostrar_habitaciones_todas();";
	
	

}