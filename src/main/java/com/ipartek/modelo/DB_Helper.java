package com.ipartek.modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.modelo.dto.Habitacion;


	public class DB_Helper implements I_Constantes{


	public Connection conectar() {
		Connection con = null;

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(CONEXION, USUARIO, PASS);
			System.out.println("BASE DE DATOS CONECTADA");
		} catch (ClassNotFoundException e) {
			System.out.println("NO SE ENCONTRO EL DRIVER");
		} catch (SQLException e) {
			System.out.println("ERROR AL CONECTAR A LA BD");
		}

		return con;
	}

	public void desconectar(Connection con) {
		try {
			con.close();
			System.out.println("BASE DE DATOS DESCONECTADA");
		} catch (SQLException e) {
			System.out.println("NO SE PUDO DESCONECTAR");
		}
	}
	
	

	public List<Habitacion> obtenerTodasHabitaciones(Connection con) {
		try {
			
			List<Habitacion> lista = new ArrayList<>();
			CallableStatement cstmt = con.prepareCall(SP_MOSTRAR_HABITACIONES_TODAS);
			
			cstmt.execute();

			ResultSet rs = cstmt.getResultSet();

			while (rs.next()) {
				

				Habitacion habi = new Habitacion();
				
				
				habi.setId_habitacion(rs.getInt(HABITACIONES_ID_HABITACION));
				habi.setNumHabitacion(rs.getInt(HABITACIONES_NUMERO_HABITACION));
				habi.setMetros(rs.getInt(HABITACIONES_METROS));
				habi.setPrecio(rs.getInt(HABITACIONES_PRECIO));
				habi.setNumeroCamas(rs.getInt(HABITACIONES_NUMERO_CAMAS));
				habi.setExterior(rs.getBoolean(HABITACIONES_EXTERIOR));
				
				
				
				lista.add(habi);
			}
			return lista;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	

}
