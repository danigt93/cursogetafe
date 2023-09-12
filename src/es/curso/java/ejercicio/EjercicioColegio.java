package es.curso.java.ejercicio;

import java.util.Scanner;

public class EjercicioColegio {

	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Cuántas aulas hay en el colegio: ");
		int numAula = scan.nextInt();
		int [][] colegio = new int[numAula][];

		
		for(int i = 0; i<numAula ; i++ ) {
		System.out.println("Cuántas alumnos hay en el aula " + i);
		int numAlum = scan.nextInt();
		int [] alumnos = new int [numAlum];
		
		
		for(int j = 0; j<numAlum ; j++) {
		System.out.println("Alumno " + j);
		
			String [] datos = {"Nombre:DNI:Nota"};
			for(int f = 0; f<datos.length ; f++ ) {
				
			
					}
				}
			}
		
		for (int i=0;i<colegio.length;i++) {
			for(int j=0;j<colegio[i].length;j++) {
				System.out.print(colegio[i][j]);
				
				}
			}
		System.out.println();
	}
}
