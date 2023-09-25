package es.curso.java.poo.ejercicios.maniqui;

public class Camisa {

	private long id;
	private String talla;
	private String color;
	private double precio;
	private Boton[]boton;
	
	public Camisa(long id, String talla, String color, double precio, Boton[] boton) {
		super();
		this.id = id;
		this.talla = talla;
		this.color = color;
		this.precio = precio;
		this.boton = boton;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Boton[] getBoton() {
		return boton;
	}

	public void setBoton(Boton[] boton) {
		this.boton = boton;
	}

	public long getId() {
		return id;
	}
	
	
}
