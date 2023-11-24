package es.curso.java.hibernate.basics.entities;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;


@Entity
@Table(name = "TB_USUARIO")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String nombre;
	private String apellidos;
	
	@Column(length = 10, name = "DNI_USUARIO", unique = true)
	private String dni;
	
	@Transient
	private LocalDate fechaAlta = LocalDate.now();

	public Usuario() {
		super();
	}
	
	
	public Usuario(Long id, String nombre, String apellidos, String dni, LocalDate fechaAlta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
	}

	public Usuario(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}


	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}


	/**
	 * @return the fechaAlta
	 */
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}


	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	@Override
	public String toString() {
		return "Usuario [" + (id != null ? "id=" + id + ", " : "") + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos + ", " : "") + (dni != null ? "dni=" + dni + ", " : "")
				+ (fechaAlta != null ? "fechaAlta=" + fechaAlta : "") + "]";
	}
	
	
}
