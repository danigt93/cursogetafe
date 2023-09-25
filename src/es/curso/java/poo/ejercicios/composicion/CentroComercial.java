package es.curso.java.poo.ejercicios.composicion;

public class CentroComercial {

	public static void main(String[] args) {
		
		Direccion dir1 = new Direccion("N1",2,23432);
		Direccion dir2 = new Direccion("N2",3,23436);
		
		Tienda tienda1 = new Tienda("Tienda1", 1 ,"Alimentacion", dir1);
		Tienda tienda2 = new Tienda("Tienda2", 2 ,"Electrónica", dir2);
		Tienda tienda3 = new Tienda("Tienda3", 3 ,"Alimentacion", dir1);
		
		
		System.out.println(tienda1.getDireccion().getCodPostal());
				
	}
}

