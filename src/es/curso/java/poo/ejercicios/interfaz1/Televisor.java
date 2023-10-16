package es.curso.java.poo.ejercicios.interfaz1;

public class Televisor extends DispositivoElectrónico {

	private String hdmi;
	
	
	
	public Televisor(long id, double precio, String fabricante, String hdmi) {
		super(id, precio, fabricante);
		
		this.hdmi = hdmi;
	}



	/**
	 * @return the hdmi
	 */
	public String getHdmi() {
		return hdmi;
	}



	/**
	 * @param hdmi the hdmi to set
	 */
	public void setHdmi(String hdmi) {
		this.hdmi = hdmi;
	}



	@Override
	public void encender() {
		System.out.println("El televisor LG con " + this.hdmi + " integrado se ha encendido");
		
	}



	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}
	
	

}
