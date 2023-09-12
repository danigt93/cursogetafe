package es.curso.java.ejercicio;

/*
 * Declarar 3 variables:
 * +2 de tipo String nombre y apellidos
 * +1 de tipo int anioNacimiento
 * inicializar las variables
 * mostrar los datos con la edad del usuario e indicando con true o false
 * si el año es par o impar
 */
public class EjercicioProfesor {
	public static void main(String[] args) {
		// Declarado e inicializado las variables
		String nombre = "Jose luis";
		String apellidos = "llorente";
		int anioNacimiento = 2000;

		int edad = 2023 - anioNacimiento;
		boolean anioEsPar = (anioNacimiento % 2) == 0;

		System.out.println(
				"El usuario " + nombre + " " + apellidos + " tiene " + edad + " años y nacio en año par " + anioEsPar);

	}
	
}
