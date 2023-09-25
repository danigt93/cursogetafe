package es.curso.java.poo.ejercicios.maniqui;


public class Boton {

	private long id;
	private String forma;
	private String color;
	private String tamanio;
	
	
	
	public Boton(long id, String forma, String color, String tamanio) {
		super();
		this.id = id;
		this.forma = forma;
		this.color = color;
		this.tamanio = tamanio;
	}


	public String getForma() {
		return forma;
	}


	public String getColor() {
		return color;
	}


	public String getTamanio() {
		return tamanio;
	}


	public long getId() {
		return id;
	}
												
}
