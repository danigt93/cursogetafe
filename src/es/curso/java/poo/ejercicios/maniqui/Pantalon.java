package es.curso.java.poo.ejercicios.maniqui;

public class Pantalon {

	private long id;
	private String talla;
	private String color;
	private String precio;
	private Boton boton;
	
	
	public Pantalon(long id, String talla, String color, String precio) {
		super();
		this.id = id;		 //2625
		this.talla = talla;  //"XS"+"M"+"L"+"XL"
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


	public String getPrecio() {
		return precio;
	}


	public void setPrecio(String precio) {
		this.precio = precio;
	}


	public long getId() {
		return id;
	}
	
	
}
