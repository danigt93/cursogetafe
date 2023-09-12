package es.curso.java.ejercicio;

import java.util.Scanner;

public class CochesDeCarreras {
	public static void main(String[] args) {
		System.out.println("Numero de coches: ");
		Scanner scan = new Scanner(System.in);
		int numCoches = scan.nextInt();
		int Vmax = 0;
		int Vmin = 300;
		
		for( int num = 1 ; num<= numCoches; num++) {
			System.out.println("Velocidad Max. de coche " + num);
			scan = new Scanner(System.in);
			Vmax = scan.nextInt();
			
			}
		
		
		
		System.out.println("La velocidad mínima de la carrera es " + Vmin);
	}
	
}


//Ejercicio1:
//Solicitar consola el numero de coches de una aula.
//Pedir Vlcidad max de cada coche
//pon Vlocidad min de la carrera