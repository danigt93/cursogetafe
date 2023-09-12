package es.curso.java.arrays;

import java.util.Scanner;

public class Notas {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el número de alumnos: ");
	        int numAlumnos = scanner.nextInt();

	        double[] notas = new double[numAlumnos];

	        // Guardar las notas de los alumnos
	        for (int i = 0; i < numAlumnos; i++) {
	            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
	            notas[i] = scanner.nextDouble();
	        }

	        // Calcular la media
	        double suma = 0;
	        for (double nota : notas) {
	            suma += nota;
	        }
	        double media = suma / numAlumnos;

	        // Calcular la nota máxima y mínima
	        double notaMaxima = notas[0];
	        double notaMinima = notas[0];

	        for (int i = 1; i < numAlumnos; i++) {
	            if (notas[i] > notaMaxima) {
	                notaMaxima = notas[i];
	            }
	            if (notas[i] < notaMinima) {
	                notaMinima = notas[i];
	            }
	        }

	        // 	Mostrar resultados
	        System.out.println("Media de las notas: " + media);
	        System.out.println("Nota máxima: " + notaMaxima);
	        System.out.println("Nota mínima: " + notaMinima);
	        
	        //nuevo array para ir de mayor a menor
	        int [] deMayoraMenor = new int[0];
	        
	        
		}
}
//Indicar el numero de notas a almacenar, preguntar y guardar las notas
//sacar la media de todas las notas
//la nota máxima
//la nota mínima

//un nuevo arrays con las notas ordenadas de mayor a menor