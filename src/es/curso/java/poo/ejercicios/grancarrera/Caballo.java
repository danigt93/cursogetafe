package es.curso.java.poo.ejercicios.grancarrera;

public class Caballo {

	private String id;
	private String nombre;
	private int numero;
	private int edad;
	private int velocidad;
	private int peso;
	
	public Caballo(String id, String nombre, int numero, int edad, int velocidad, int peso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numero = numero;
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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

	public String getId() {
		return id;
	}
	
	
	
	public void metodoCorrer() {
		
		int velocidadCaballos = velocidad * (int)((Math.random()*20));
		int pesoCaballos = peso * (int)(Math.random()*3);
		int edadCaballos = edad * (int)(Math.random()*3);
		
		int avanceCaballos = velocidadCaballos - pesoCaballos - edadCaballos;
		System.out.println(avanceCaballos);
		
		
		//(simular avance del caballo)
		//velocidad*(random(1-20))-peso*(random(1-3))-edad*(random(1-3));
		
		
		//System.out.println("Caballo" +  + " avanza " +  + " metros");
		
	}
	
}
