package es.curso.java.ddbb.ejercicio.libreria.entities;

public class Direccion {

	private long id;
	private String nombre;
	private int numCalle;
	private int codPostal;
	private String ciudad;
	private String provincia;
	private String pais;

		
	public Direccion(long id, String nombre, int numCalle, int codPostal, String ciudad, String provincia,
			String pais) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numCalle = numCalle;
		this.codPostal = codPostal;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
	}
	
	
	public Direccion(String nombre, int numCalle, int codPostal, String ciudad, String provincia, String pais) {
		super();
		this.nombre = nombre;
		this.numCalle = numCalle;
		this.codPostal = codPostal;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the numCalle
	 */
	public int getNumCalle() {
		return numCalle;
	}


	/**
	 * @param numCalle the numCalle to set
	 */
	public void setNumCalle(int numCalle) {
		this.numCalle = numCalle;
	}


	/**
	 * @return the codPostal
	 */
	public int getCodPostal() {
		return codPostal;
	}


	/**
	 * @param codPostal the codPostal to set
	 */
	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}


	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}


	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}


	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}


	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}


	@Override
	public String toString() {
		return "Direccion [id=" + id + ", " + (nombre != null ? "nombre=" + nombre + ", " : "") + "numCalle=" + numCalle
				+ ", codPostal=" + codPostal + ", " + (ciudad != null ? "ciudad=" + ciudad + ", " : "")
				+ (provincia != null ? "provincia=" + provincia + ", " : "") + (pais != null ? "pais=" + pais : "")
				+ "]";
	}
	
	
}
