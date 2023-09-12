package es.curso.java.ejercicio;

public class Ejercicio1 {
	public static void main(String[] args) {
		String nombre = "Daniel Torres";
		int anio = 1992;
		int anioAct = 2023;
		boolean esPar = anio % 2 == 0;

		System.out.println("Nombre y apellido: " + nombre);
		System.out.println("Año de nacimiento: " + anio);
		System.out.println("Su edad es: " + (anioAct - anio));
		System.out.println("Nació en un año par?: " + esPar);

		if (esPar) {
			System.out.println("Sí nació en un año par " + esPar);
		}

		else {
			System.out.println("No nació en un año par"); 
		}

	}
}
