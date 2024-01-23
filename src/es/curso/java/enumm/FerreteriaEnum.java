package es.curso.java.enumm;

import java.util.Arrays;

public class FerreteriaEnum {

	private long id;
	private String nombre;
	private String direccion;
	private TornilloEnum [] tornillos;
	
	
	public FerreteriaEnum(long id, String nombre, String direccion, TornilloEnum[] tornillos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.tornillos = tornillos;
	}
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public TornilloEnum[] getTornillos() {
		return tornillos;
	}
	
	public void setTornillos(TornilloEnum[] tornillos) {
		this.tornillos = tornillos;
	}
	
	
	@Override
	public String toString() {
		return "FerreteriaEnum [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", tornillos="
				+ Arrays.toString(tornillos) + "]";
	}
	
	
	
}
