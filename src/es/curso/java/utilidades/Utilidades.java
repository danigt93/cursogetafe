package es.curso.java.utilidades;

import java.util.Scanner;

public class Utilidades {

	public static void main(String[] args) {
		String menu = "MENU";
		String newMenu = menu(menu);
		System.out.println(newMenu);
	}
	
public static String menu (String texto) {
	String opcion;
	do {
		System.out.println("1. Opcion 1\n" + "2. Opcion 2\n" + 
				"3. Opcion 3\n" + "4. Opcion 4\n" +
				"5. Opcion 5\n" + "6. Salir\n" );
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa la opcion que desees que aparezca en pantalla: ");
		opcion = scan.nextLine();
		
		switch(opcion) {
		case "1" : System.out.println("Opcion 1");break;
		case "2" : System.out.println("Opcion 2");break;
		case "3" : System.out.println("Opcion 3");break;
		case "4" : System.out.println("Opcion 4");break;
		case "5" : System.out.println("Opcion 5");break;
		case "6" : System.out.println("Salir");break;
		}
	}while(Integer.parseInt(opcion)!=6);
	return opcion;
	
 }
}
