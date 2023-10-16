package es.curso.java.poo.ejercicios.interfaz1;

public class Moto extends Vehículo {

	private int numRuedas;
	
	
	
	public Moto(long id, String matricula, String marca, int numRuedas) {
		super(id, matricula, marca);
		
		this.numRuedas = numRuedas;
	}



	/**
	 * @return the numRuedas
	 */
	public int getNumRuedas() {
		return numRuedas;
	}



	/**
	 * @param numRuedas the numRuedas to set
	 */
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}



	@Override
	public void encender() {
		System.out.println("La Suzuki GSX R1000 con " + this.numRuedas + " ruedas se ha encendido");
		
	}



	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}

	
	
}
