package es.curso.java.hibernate.ejercicio;

import java.util.Date;

import es.curso.java.hibernate.ejercicio.util.UtilFecha;

public class CabeceraClass {
	
	private String nombre;
	private String tipo;
	private Date fecha;
	private int precio;
	private int unidades;
	
	
	public CabeceraClass() {
		super();
	}
	
	
	public CabeceraClass(String nombre, String tipo, Date fecha, int precio, int unidades) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.fecha = UtilFecha.generaFechaActual();
		this.precio = precio;
		this.unidades = unidades;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getUnidades() {
		return unidades;
	}


	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}


	@Override
	public String toString() {
		return "CabeceraClass [nombre=" + nombre + ", tipo=" + tipo + ", fecha=" + fecha + ", precio=" + precio
				+ ", unidades=" + unidades + "]";
	}
	
	
}
