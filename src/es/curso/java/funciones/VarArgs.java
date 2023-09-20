package es.curso.java.funciones;

public class VarArgs {

	public static void main(String [] args) {
		metodo1(12,"Juan", "Victor");
		
	}
	
	public static void metodo1(int num, String... nombres) {
		
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
	}
	
}
