package es.curso.java.poo.herencia.hospital;

public class Enfermero extends EmpleadosHospital {

	private int planta;
	
	
	public Enfermero(long id, String nombre, int edad, String turno, int planta) {
		super(id, nombre, edad, turno);
		// TODO Auto-generated constructor stub
		this.planta = planta;
	}


	/**
	 * @return the planta
	 */
	public int getPlanta() {
		return planta;
	}


	/**
	 * @param planta the planta to set
	 */
	public void setPlanta(int planta) {
		this.planta = planta;
	}
	
	public void atenderPaciente() {
		
	}
	
}
