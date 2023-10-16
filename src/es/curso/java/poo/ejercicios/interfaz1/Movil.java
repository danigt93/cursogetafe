package es.curso.java.poo.ejercicios.interfaz1;

public class Movil extends DispositivoElectrónico {


	private String sistemaOperativo;
	
	
	
	public Movil(long id, double precio, String fabricante, String sistemaOperativo) {
		super(id, precio, fabricante);
		
		this.sistemaOperativo = sistemaOperativo;
	}



	/**
	 * @return the sistemaOperativo
	 */
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}



	/**
	 * @param sistemaOperativo the sistemaOperativo to set
	 */
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}



	@Override
	public void encender() {
		System.out.println("El Samsung S23 Ultra con " + this.sistemaOperativo + " como sistema operativo se ha encendido");
		
	}



	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}
	
	
}
