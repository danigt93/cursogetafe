package es.curso.java.poo.herencia.orquesta;

public class Guitarra extends Instrumento {

	int numCuerdas;
	
	public Guitarra(String nombre, String tipo, int numCuerdas) {
		super(nombre, "cuerda");
		this.numCuerdas = numCuerdas;
		
	}

	
	public int getNumCuerdas() {
		return numCuerdas;
	}
	
	@Override
	public String toString() {
		return "Guitarra [numCuerdas=" + numCuerdas + "]";
	}
	
	@Override
	public void afinar() {
		System.out.println("Afinando guitarra " + this.getNombre());
	}


	

	
	
}
