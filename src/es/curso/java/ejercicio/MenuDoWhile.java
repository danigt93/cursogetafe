package es.curso.java.ejercicio;

import java.util.Scanner;

public class MenuDoWhile {

	public class MenuEstacion {

		public static void main(String[] args) {
			int opcion;	
			do {	
		
				String menu = "1. Opcion1\n2. Opcion2\n3. Opcion3\n4. Opcion4\n5. Salir";
				System.out.println(menu);
				System.out.println("Selecciona una opcion");
				Scanner scan = new Scanner(System.in);
				opcion = scan.nextInt();
				
				System.out.println("Opcion seleccionada " + opcion);
				
			}while (opcion!=5);
			
			
		}	
	
	}
}
