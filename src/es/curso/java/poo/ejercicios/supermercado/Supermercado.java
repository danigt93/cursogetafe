package es.curso.java.poo.ejercicios.supermercado;

public class Supermercado {


		private long id;
		private String nombre;
		private Cajera [] cajeras;
		private Cliente [] clientes;
	
	
	public Supermercado(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Cajera[] getCajeras() {
		return cajeras;
	}


	public void setCajeras(Cajera[] cajeras) {
		this.cajeras = cajeras;
	}


	public long getId() {
		return id;
	}

	public Cliente[] getClientes() {
		return clientes;
	}
	
	public static void main(String[] args) {
		Supermercado supermercado = new Supermercado ("Supermercado CFTIC");
		supermercado.abrirSupermercado();
		
		
		
	}
	
	public void abrirSupermercado(){
//		3 clientes --> añadirProductos al carrito
//		2 cajeras --> cobrar a los clientes
//		cada cliente tiene que pagar el importe de la compra
		
		Producto p1 = new Producto(01,"Pan",3.80,"Alimento");
		Producto p2 = new Producto(02,"Tv",1500,"Electrodoméstico");
		Producto p3 = new Producto(03,"Champoo",4.50,"Higiene");
		Producto p4 = new Producto(04,"Friegasuelos",3.75,"Limpieza");
		Producto p5 = new Producto(05,"Pilas",7.80,"Electrónica");
		
		Producto [] productos = {p1,p2,p3,p4,p5};
		
		Cliente c1 = new Cliente(11, "Felipe", true);
		Cliente c2 = new Cliente(12, "Ana", false);
		Cliente c3 = new Cliente(13, "Casilda", true);
		
		Cliente [] clientes = {c1,c2,c3};
		
		Cajera cj1 = new Cajera("María");
		Cajera cj2 = new Cajera("Laura");
		
		}

	
}


