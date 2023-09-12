package es.curso.java.ejercicio;

import java.util.Scanner;

public class TenistasTop10 {
	public static void main(String[] args) {
		System.out.println("Cuántos tenistas van a participar?: ");
		Scanner scan = new Scanner(System.in);
		int numTenistas = scan .nextInt();
		int contador = 0;
		
			for( int i = 1 ; i<=numTenistas ; i++ ) {
				System.out.println("Tenista" + i + "en que puesto estas?");
				scan = new Scanner(System.in);
				int posicion = scan.nextInt();
		
				if(posicion<=10) {
					contador++;
			}
		}
		
		System.out.println("Hay "+ contador + "tenistas en el top 10");	
			
	}
}
