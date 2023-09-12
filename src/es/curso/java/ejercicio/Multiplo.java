package es.curso.java.ejercicio;

import java.util.Scanner;

public class Multiplo {
	public static void main(String[] args) {
		System.out.println("Ingresa 10 números:");
		Scanner scan = new Scanner(System.in);
		int numV = scan.nextInt();
		int mult3 = 0;
		int mult5 = 0;
		
		for( int num = 1 ; num<=10 ; num++ ) {
			System.out.println("Número: " + num);
			scan = new Scanner(System.in);
			int valor = scan.nextInt();
			
			if (valor%3==0) {
				mult3++;
			}
			if(valor%5==0) {
				mult5++;
			}
			
			
		}
	}
}

/*
 * Pedir 10 numeros --> Indicar cuantos son multiplos de 3 y cuantos multiplos de 5
 */