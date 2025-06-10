package com.ipartek.modelo.dto;

public class Habitacion {
	
	private int id_habitacion;
	private int numHabitacion;
	private double metros;
	private float precio;
	private double numeroCamas; 
	private boolean exterior;
	
	
	public Habitacion(int id_habitacion, int numHabitacion, double metros, float precio, double numeroCamas,
			boolean exterior) {
		super();
		this.id_habitacion = id_habitacion;
		this.numHabitacion = numHabitacion;
		this.metros = metros;
		this.precio = precio;
		this.numeroCamas = numeroCamas;
		this.exterior = exterior;
	}
	
	
	public Habitacion() {
		super();
		this.id_habitacion = 0;
		this.numHabitacion = 0;
		this.metros = 0;
		this.precio = 0;
		this.numeroCamas = 0;
		this.exterior = false;
	}


	public int getId_habitacion() {
		return id_habitacion;
	}


	public void setId_habitacion(int id_habitacion) {
		this.id_habitacion = id_habitacion;
	}


	public int getNumHabitacion() {
		return numHabitacion;
	}


	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}


	public double getMetros() {
		return metros;
	}


	public void setMetros(double metros) {
		this.metros = metros;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public double getNumeroCamas() {
		return numeroCamas;
	}


	public void setNumeroCamas(double numeroCamas) {
		this.numeroCamas = numeroCamas;
	}


	public boolean getExterior() {
		return exterior;
	}


	public void setExterior(boolean exterior) {
		this.exterior = exterior;
	}


	@Override
	public String toString() {
		return "Habitacion [id_habitacion=" + id_habitacion + ", numHabitacion=" + numHabitacion + ", metros=" + metros
				+ ", precio=" + precio + ", numeroCamas=" + numeroCamas + ", exterior=" + exterior + "]";
	}
	
	
	
	
}
