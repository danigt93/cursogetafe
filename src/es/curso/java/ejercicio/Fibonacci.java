package es.curso.java.ejercicio;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String [] args) {
		System.out.println("Pide el numero total de números que quieras que se muestren de la serie de Fibonacci: ");
		Scanner scan = new Scanner(System.in);
		int numVeces = scan.nextInt();
		int f0 = 0;
		int f1 = 1;
		int f2;
		
		
		for( int num = 1; num<=numVeces; num++ ) {
			f2 = f0;
			f0 = f1 + f0;
			f1 = f2;
			System.out.println(f1);
		
		}
			
		
	}
}



/*
 * Pedir por consola el numero total de numeros que se desean mostrar de la serie de fibonacci
 * Serie: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233...
 */


