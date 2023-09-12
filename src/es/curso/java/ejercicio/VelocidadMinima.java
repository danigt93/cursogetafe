package es.curso.java.ejercicio;

import java.util.Scanner;

public class VelocidadMinima {
	public static void main(String[] args) {
		System.out.println("Numero de coches: ");
		Scanner scan = new Scanner(System.in);
		int numCoches = scan.nextInt();
		int velocidadMinima = 400;
		
		for( int num = 1 ; num<= numCoches; num++) {
			System.out.println("Velocidad del coche " + num);
			scan = new Scanner(System.in);
			int velocidadCoche = scan.nextInt();
			
			if(velocidadCoche<velocidadMinima) {
			   velocidadMinima = velocidadCoche; 
			}
		
		
		
		//System.out.println("La velocidad mínima de la carrera es ");
	}
	
}
}
