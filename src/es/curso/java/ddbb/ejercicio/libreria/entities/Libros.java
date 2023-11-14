package es.curso.java.ddbb.ejercicio.libreria.entities;

public class Libros {

	private long id;
	private String nombre;
	private String autor;
	private String editorial;
	private long isbm;
	
	
	public Libros(long id, String nombre, String autor, String editorial, long isbm) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.isbm = isbm;
	}

	public Libros(String nombre, String autor, String editorial, long isbm) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.isbm = isbm;
	}
	

	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}


	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}


	/**
	 * @return the isbm
	 */
	public long getIsbm() {
		return isbm;
	}

	@Override
	public String toString() {
		return "Libros [id=" + id + ", " + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (autor != null ? "autor=" + autor + ", " : "")
				+ (editorial != null ? "editorial=" + editorial + ", " : "") + "isbm=" + isbm + "]";
	}
	
	
	
}
