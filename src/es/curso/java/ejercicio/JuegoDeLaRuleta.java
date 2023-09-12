package es.curso.java.ejercicio;

import java.util.Scanner;

public class JuegoDeLaRuleta {
	public static void main(String[] args) {
		
		System.out.println("Bienvenido al Gran Casino Helecho donde entras con 1000 pavos y sales sin techo" + "\nPor favor elija una de estas opciones:" 
		+ "\n1. Apostar por un número (0-36) \n2. Apostar por docenas (0-12/13-24/25-36) \n3. Apostar por par/impar \n4. Apostar por rojo/negro "
		+ "\n5. Dejar de jugar");
		
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		
		String jugador = "";
		String respuesta = "";
		double importe = 1000;
		
		switch(opcion) {
		case 1 :
		case 2 :
		case 3 :
		case 4 : System.out.println("Has elegido: Juego " + opcion );break;
		case 5 : System.out.println("Tira ya pa tu casa anda, te has quedado con "+ importe);break;
		default : System.err.println("Opción incorrecta");
		}
		
				
		
		do {
			System.out.println("Cuanto deseas apostar?: ");
			double importeApuesta = scan.nextInt();
			

			//Juego 1:
			int num;
			int tirada;
			if(opcion==1) {
				System.out.println("Apuesta por un numero del 0-36: ");				
				num = scan.nextInt();
				tirada = (int)(Math.random()*36)+1;
				System.out.println("El numero sacado por la ruleta ha sido el: " + tirada);
				System.out.println("Te quedan " + (importe -= importeApuesta) + " €");
				
				if(num == tirada) {
				System.out.println("Enhorabuena has acertado!!!");
				importe += importeApuesta*36;
					}
				if(importe>0) {
					System.out.println("Quieres seguir jugando??");
					scan = new Scanner(System.in); 
					respuesta = scan.nextLine();
					}
				}
			
			//Juego 2:
			int numDocena;
			int tiradaDocena;
			int primeraDocena = 12;
			int segundaDocena = 24;
			int terceraDocena = 36;
			
			if(opcion==2) {
				System.out.println("Apuesta por una docena: ");				
				numDocena = scan.nextInt();
				tiradaDocena = (int)(Math.random()*36)+1;
				
				
				
				
				System.out.println("La docena que ha tocado ha sido: ");
				System.out.println("Te quedan " + (importe -= importeApuesta) + " €");
				
				
				if(tiradaDocena<=12) {
					 System.out.println("PRIMERA");
				}

				
				
				//nuemro se divide entre 12 se le asigna directamente a la docena
				
				
				
//				if(tiradaDocena <= primeraDocena ) {
//					System.err.println(" 1º DOCENA ");
//				}
//				if(tiradaDocena <= segundaDocena ) {
//					System.err.println(" 2º DOCENA ");
//				}
//				if(tiradaDocena <= terceraDocena ) {
//					System.err.println(" 3º DOCENA ");
//				}
//				
//				if(numDocena == tiradaDocena) {
//					System.out.println("Enhorabuena has acertado!!!");
//					importe += importeApuesta*12;
//						}
//					if(importe>0) {
//						System.out.println("Quieres seguir jugando??");
//						scan = new Scanner(System.in); 
//						respuesta = scan.nextLine();
//						}
				
				
				}
				
 
			
			
			
			}while(importe>0 && !respuesta.equalsIgnoreCase("no"));
		
		
		
		
		
		
			
	}
}
