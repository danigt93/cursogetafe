package es.curso.java.poo.ejercicios.grancarrera;

public class Carrera {
	
	private int id;
	private String nombre;
	private Caballo [] caballos;
	private double distancia;
	
	
	public Carrera(int id, String nombre, Caballo[] caballos, double distancia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.caballos = caballos;
		this.distancia = distancia;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Caballo[] getCaballos() {
		return caballos;
	}


	public void setCaballos(Caballo[] caballos) {
		this.caballos = caballos;
	}


	public double getDistancia() {
		return distancia;
	}


	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}


	public int getId() {
		return id;
	}
	
	
	
	
	public void iniciarCarrera() {
	
		boolean ganador = false;
		int dorsalGanador = 0;
		
		do {
			for (Caballo caballos : caballos) {
				caballos.correr();
				
				if( caballos.getAvance() > this.distancia) {
					dorsalGanador = caballos.getDorsal();
					ganador = true;
					break;
				}
			}
			System.out.println("El caballo ganador ha sido: " + dorsalGanador);
		} while (ganador==false);
	}
	
	
}
