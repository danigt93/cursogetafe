package es.curso.java.poo.herencia.hospital;

public abstract class EmpleadosHospital extends Persona {

	private String turno;
	
	
	public EmpleadosHospital(long id, String nombre, int edad, String turno) {
		super(id, nombre, edad);
		// TODO Auto-generated constructor stub
		this.turno = turno;
	}


	/**
	 * @return the turno
	 */
	public String getTurno() {
		return turno;
	}


	/**
	 * @param turno the turno to set
	 */
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
	public void fichar() {
		System.out.println("El empleado " + getNombre() + "está fichando");
	}
	
	public void comer() {
		System.out.println("Empleado " + getNombre() + "está comiendo");
	}
}
