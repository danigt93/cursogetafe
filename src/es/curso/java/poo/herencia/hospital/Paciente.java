package es.curso.java.poo.herencia.hospital;

public abstract class Paciente extends Persona {

	private String [] sintomas;
	
	public Paciente(long id, String nombre, int edad, String [] sintomas) {
		super(id, nombre, edad);
		// TODO Auto-generated constructor stub
		this.sintomas = sintomas;
	}
	
	@Override
	public void comer() {
		System.out.println("El paciente " + getNombre() + " está comiendo en la cafetería");
	}
}
