package es.curso.java.poo.herencia.hospital;

public class Habitacion {

	private Enfermo enfermo;
	private int numHabitacion;
	
	
	public Habitacion(Enfermo enfermo, int numHabitacion) {
		super();
		this.enfermo = enfermo;
		this.numHabitacion = numHabitacion;
	}


	/**
	 * @return the enfermo
	 */
	public Enfermo getEnfermo() {
		return enfermo;
	}


	/**
	 * @param enfermo the enfermo to set
	 */
	public void setEnfermo(Enfermo enfermo) {
		this.enfermo = enfermo;
	}


	/**
	 * @return the numHabitacion
	 */
	public int getNumHabitacion() {
		return numHabitacion;
	}


	/**
	 * @param numHabitacion the numHabitacion to set
	 */
	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}
	
	
}
