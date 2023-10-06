package es.curso.java.poo.herencia.hospital;

public abstract class Enfermo extends Persona{
	
	private String enfermedad;
	
	public Enfermo(long id, String nombre, int edad, String enfermedad) {
		super(id, nombre, edad);
		// TODO Auto-generated constructor stub
		this.enfermedad = enfermedad;
	}
	
	@Override
	public void comer() {
		System.out.println("El paciente " + getNombre() + " está comiendo en la habitación");
	}
	
}
