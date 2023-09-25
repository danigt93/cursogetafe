package es.curso.java.poo.ejercicios.maniqui;

public class Vestido {

	private long id;
	private String talla;
	private String color;
	private double precio;
	
	public Vestido(long id, String talla, String color, double precio) {
		super();
		this.id = id;
		this.talla = talla;
		this.color = color;
		this.precio = precio;
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

	public long getId() {
		return id;
	}
	
	
}
