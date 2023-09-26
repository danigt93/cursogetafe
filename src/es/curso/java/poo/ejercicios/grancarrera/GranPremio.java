package es.curso.java.poo.ejercicios.grancarrera;

public class GranPremio {

	private int id;
	private String nombre;
	private Carrera [] carrera;
	
	
	
	public GranPremio(int id, String nombre, Carrera[] carrera) {
		
		this.id = id;
		this.nombre = nombre;
		this.carrera = carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carrera[] getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera[] carrera) {
		this.carrera = carrera;
	}

	public int getId() {
		return id;
	}
	
	
	public void empezarGranPremio() {
		for (Carrera carrera : carrera) {
			carrera.iniciarCarrera();
		}
		
	}
	
}
