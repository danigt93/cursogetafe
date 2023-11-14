package es.curso.java.competicion;

public class EquipoCompeticion {

	private String nombre;
	private int numLigas;
	private int numTrophy;
	
	
	public EquipoCompeticion(String nombre, int numLigas, int numTrophy) {
		super();
		this.nombre = nombre;
		this.numLigas = numLigas;
		this.numTrophy = numTrophy;
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
	 * @return the numLigas
	 */
	public int getNumLigas() {
		return numLigas;
	}


	/**
	 * @param numLigas the numLigas to set
	 */
	public void setNumLigas(int numLigas) {
		this.numLigas = numLigas;
	}


	/**
	 * @return the numTrophy
	 */
	public int getNumTrophy() {
		return numTrophy;
	}


	/**
	 * @param numTrophy the numTrophy to set
	 */
	public void setNumTrophy(int numTrophy) {
		this.numTrophy = numTrophy;
	}


	@Override
	public String toString() {
		return "EquipoCompeticion [" + (nombre != null ? "nombre=" + nombre + ", " : "") + "numLigas=" + numLigas
				+ ", numTrophy=" + numTrophy + "]";
	}
	
	
}
