package es.curso.java.utilidades;

import java.util.Scanner;

public class Utilidades {

	public static String pideDatoTexto (String texto) {
		String reply=null;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		reply = scan.nextLine();
		
		return reply;
	}
	
	public static int pideDatoNumerico (String texto) {
		int reply=0;
		System.out.println("Que opción deseas elegir?");
		Scanner scan = new Scanner(System.in);
		reply = scan.nextInt();
		
		return reply;
	}
	
	public static int pintarMenu(String menu) {
		
		return pintarMenu("1. Suma\n" + "2. Resta\n" + "3. Multiplicación\n" + "4. División\n" + "5. Salir\n");
	}

	public static int pintarMenu(String menu, String pregunta, String caracterSeparacion) {
		
		
		return pintarMenu(menu.split(caracterSeparacion),pregunta);
	}
	
	
	public static int pintarMenu(String[] menu, String pregunta) {
		for (String opcion : menu) {
			System.out.println(opcion);
		}
		//Pido la opción del menú
		int opcion = pideDatoNumerico(pregunta);
		
		return opcion;
	}
}
