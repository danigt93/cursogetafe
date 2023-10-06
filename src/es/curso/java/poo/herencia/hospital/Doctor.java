package es.curso.java.poo.herencia.hospital;

public class Doctor extends EmpleadosHospital {

	private String especialidad;
	
	public Doctor(long id, String nombre, int edad, String turno, String especialidad) {
		super(id, nombre, edad, turno);
		this.especialidad = especialidad;
	}

	/**
	 * @return the especialidad
	 */
	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * @param especialidad the especialidad to set
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	public void diagnosticarPaciente() {
		
		int gradoEnfermo = (int)((Math.random()*10));
		
		
		if(gradoEnfermo>8) {
			System.out.println("El paciente está enfermo");
			//Enfermo enfermo = new Enfermo();
		}
		
	}
		
	
}