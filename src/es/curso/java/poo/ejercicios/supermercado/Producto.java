package es.curso.java.poo.ejercicios.supermercado;

public class Producto {

	
	private long id;
	private String nombre;
	private double precio;
	private String tipo;
	
	
	public Producto(long id, String nombre, double precio, String tipo) {
		
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.tipo = tipo;
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


	public long getId() {
		return id;
	}


	public double getPrecio() {
		return precio;
	}
	
	
}
