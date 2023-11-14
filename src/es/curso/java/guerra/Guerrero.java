package es.curso.java.guerra;

import es.curso.java.guerra.excepciones.HabilidadesException;

public class Guerrero {
	
	private String nombre;
	private int fuerza;
	private int resistencia;
	
	
	
	public Guerrero(String nombre, int fuerza, int resistencia) throws HabilidadesException{
		
		if(fuerza + resistencia>10) {
			throw new HabilidadesException("La suma de la fuerza y resistencia no puede ser superior a 10");
		}else {
			this.fuerza = fuerza;
			this.resistencia = resistencia;
		}
		
		this.nombre = nombre;

	}
	
	/**
	 * @return the nombre
	 */
	String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the fuerza
	 */
	int getFuerza() {
		return fuerza;
	}


	/**
	 * @param fuerza the fuerza to set
	 */
	void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}


	/**
	 * @return the resistencia
	 */
	int getResistencia() {
		return resistencia;
	}


	/**
	 * @param resistencia the resistencia to set
	 */
	void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	@Override
	public String toString() {
		return "Guerrero [" + (nombre != null ? "nombre=" + nombre + ", " : "") + "fuerza=" + fuerza + ", resistencia="
				+ resistencia + "]";
	}
	
	
}
