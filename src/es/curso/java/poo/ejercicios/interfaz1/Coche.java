package es.curso.java.poo.ejercicios.interfaz1;

public class Coche extends Vehículo{

	private int numPuertas;
	
	
	public Coche(long id, String matricula, String marca, int numPuertas) {
		super(id, matricula, marca);
		
		this.numPuertas = numPuertas;
	}


	/**
	 * @return the numPuertas
	 */
	public int getNumPuertas() {
		return numPuertas;
	}


	/**
	 * @param numPuertas the numPuertas to set
	 */
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}


	@Override
	public void encender() {
		System.out.println("El Honda Civic EG6 Spoon con " + this.numPuertas + " puertas se ha encendido");
		
	}


	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}

	
	
}
