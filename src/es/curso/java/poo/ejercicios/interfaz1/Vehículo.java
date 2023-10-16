package es.curso.java.poo.ejercicios.interfaz1;

public abstract class Vehículo implements InterfezSistemaEncendido{

	private long id;
	private String matricula;
	private String marca;
	
	
	
	public Vehículo(long id, String matricula, String marca) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.marca = marca;
	}



	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}



	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}



	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}



	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	
	
}
