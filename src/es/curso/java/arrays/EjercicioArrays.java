package es.curso.java.arrays;

import java.util.Scanner;

public class EjercicioArrays {

	public static void main (String[] arg) {
		System.out.println("Cuántos colores vamos a guardar??? ");
		Scanner scan = new Scanner(System.in); 
		int numeroColores = scan.nextInt();
		System.out.println("Cuáles son? ");
		String colores = "";
		
		for (int i=0 ; i<numeroColores ; i++){
			colores = scan.next();		
		}
		
		
		System.out.println(colores);
	}
}




//preguntar cuantos colores se quieren guardar
//guardamos todos los colores
//mostramos todos los colores
//mostramos todos los colores que contengan "o" y empiezen por "a"