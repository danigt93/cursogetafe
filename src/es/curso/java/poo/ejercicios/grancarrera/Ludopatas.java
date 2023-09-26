package es.curso.java.poo.ejercicios.grancarrera;

public class Ludopatas {
	
	private String nombre;
	private int saldo;
	private int apuesta;
	
		
	public Ludopatas(String nombre, int saldo, int apuesta) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.apuesta = apuesta;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getSaldo() {
		return saldo;
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	public int getApuesta() {
		return apuesta;
	}


	public void setApuesta(int apuesta) {
		this.apuesta = apuesta;
	}
	

	
}
