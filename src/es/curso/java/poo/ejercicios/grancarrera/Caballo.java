package es.curso.java.poo.ejercicios.grancarrera;

import java.util.Random;

public class Caballo {

	private long id;
	private String nombre;
	private int dorsal;
	private int edad;
	private int velocidad;
	private int peso;
	private double avance;
	
	public Caballo(long id, String nombre, int dorsal, int edad, int velocidad, int peso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.edad = edad;
		this.velocidad = velocidad;
		this.peso = peso;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public long getId() {
		return id;
	}
	
	public double getAvance() {
		return avance;
	}
	
	
	
	public void correr() {

		//OTRA FORMA DE HACER EL RANDOM
//		double avanceCaballos = 0;
//		
//		Random rd1 = new Random();
//		int randomVelocidad = rd1.nextInt(1, 20);
//		int randomPeso = rd1.nextInt(1, 3);
//		int randomEdad = rd1.nextInt(1, 3);
//		
//		avanceCaballo = this.velocidad * randomVelocidad - this.peso * randomPeso - this.edad * randomEdad;
//		
//		this.avance += avanceCaballo > 0 ? avanceCaballo : 0;
		
		
		int velocidadCaballos = velocidad * (int)((Math.random()*20));
		int pesoCaballos = peso * (int)(Math.random()*3);
		int edadCaballos = edad * (int)(Math.random()*3);
		
		avance += velocidadCaballos - pesoCaballos - edadCaballos;
	}



	
}
