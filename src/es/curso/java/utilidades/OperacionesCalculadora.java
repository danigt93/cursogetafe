package es.curso.java.utilidades;

import java.util.Scanner;

public class OperacionesCalculadora {

	public static int suma(int sumaNumero) {
		Scanner scan = new Scanner(System.in);
		int valor = 0;
		int numero = scan.nextInt();
		sumaNumero = valor + numero;
		
		return sumaNumero;
		
	}
	
	public static int resta(int restaNumero) {
		Scanner scan = new Scanner(System.in);
		int valor = 0;
		int numero = scan.nextInt();
		restaNumero = valor - numero;
		
		return restaNumero;
		
	}
	
	public static int multiplicar(int multiplicacionNumero) {
		Scanner scan = new Scanner(System.in);
		int valor = 1;
		int numero = scan.nextInt();
		multiplicacionNumero = valor * numero;
		
		return multiplicacionNumero;
		
	}
	
	public static int dividir(int divisionNumero) {
		Scanner scan = new Scanner(System.in);
		int valor = 1;
		int numero = scan.nextInt();
		divisionNumero = numero/valor;
		
		return divisionNumero;
		
	}
}
