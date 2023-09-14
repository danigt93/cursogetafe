package es.curso.java.ejercicio;

import java.util.Scanner;

public class CalculaEdad{

	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Dime tu año de nacimiento:");
		int anioNacim = scan.nextInt();
		int [] años = new int [anioNacim];
		
		
		int anioAct = 2023;
		
		int calculaEdad = anioAct - anioNacim;
		
		System.out.println("El usuario tiene: " + calculaEdad);
	
	}
	
	static int calculaEdad(String anioNacimiento) {
		 int anios = anioNacimiento.length();
		 System.out.println(anios);
	
	}
	
	void pintaTablaMultiplicar (int numero) {
		
	}
}
