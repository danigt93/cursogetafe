package es.curso.java.poo.ejercicios.interfaz1;

public abstract class DispositivoElectrónico implements InterfezSistemaEncendido {

	private long id;
	private double precio;
	private String fabricante;
	
	
	
	
	public DispositivoElectrónico(long id, double precio, String fabricante) {
		super();
		this.id = id;
		this.precio = precio;
		this.fabricante = fabricante;
	}




	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}




	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}




	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}




	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}




	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}




	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
