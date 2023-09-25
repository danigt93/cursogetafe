package es.curso.java.poo.ejercicios.maniqui;

public class Maniqui {

	private long id;
	private Vestido vestido;
	private Pantalon pantalon;
	private Camisa camisa;
	
	
	public Maniqui(long id) {
		this.id = id;
	}
	
	public Maniqui(long id, Pantalon pantalon, Camisa camisa) {
		this.id = id;
		this.pantalon = pantalon;
		this.camisa = camisa;
		
	}
	
	public Maniqui(long id, Vestido vestido) {
		this.id = id;
		this.vestido = vestido;	
	}
	
	
	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public long getId() {
		return id;
	}
	
	//Métodos:
	
	public void vestir(Pantalon pantalon, Camisa camisa) {
		desvestir();
		this.pantalon = pantalon;
		this.camisa = camisa;		
	}
	
	public void vestir(Vestido vestido) {
		desvestir();
		this.vestido = vestido;	
	}

	public void desvestir() {
		
		this.pantalon = null;
		this.camisa = null;
		this.vestido = null;
		
	}
	

	
}
