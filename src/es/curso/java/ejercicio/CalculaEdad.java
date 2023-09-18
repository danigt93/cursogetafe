

package es.curso.java.ejercicio;

import java.util.Scanner;

public class CalculaEdad{

	public static void main (String[] args) {
		
		//Para calcular la edad
		String edad = "1993";
		int numEdad = calculaEdad(edad);
		System.out.println("El usuario tiene " + numEdad + " años");
		
		//Tabla de multiplicar
		pintaTablaMultiplicar();
		
		calculaVelocidad(1050,120);
	}
	

	
	
	
	static int calculaEdad(String anioNacimiento) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu año de nacimiento: ");
		
		int edadUsuario = scan.nextInt();
		int anio = Integer.parseInt(anioNacimiento);
		int anioReal = 2023 - edadUsuario;
		return anioReal;
		}
	

	
	public static void pintaTablaMultiplicar() {
		for(int i = 1; i<=10 ; i++ ) {
			for(int j= 1; j<=10 ; j++) {
				System.out.println(i + " X "+ j +" = " + (i*j));
			}
			System.out.println("=======TABLA DEL " + i +"=======");
		}
	}
	
	public static void calculaVelocidad(double distancia, int tiempo) {
		System.out.println("velocidad " + distancia / tiempo);
	}
}
