package es.curso.java.poo.herencia.orquesta;

public class Piano extends Instrumento {

	int numOctovas;
	String tipoPiano;
	
	
	public Piano(String nombre, String tipo, int numOctavas,String tipoPiano) {
		super(nombre, "cuerda");
		this.numOctovas = numOctavas;
		this.tipoPiano = tipoPiano;
	}


	public String getTipoPiano() {
		return tipoPiano;
	}

	public void setTipoPiano(String tipoPiano) {
		this.tipoPiano = tipoPiano;
	}

	public int getNumOctovas() {
		return numOctovas;
	}


	@Override
	public void afinar() {
		System.out.println("Afinando Piano " + getNombre());
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
