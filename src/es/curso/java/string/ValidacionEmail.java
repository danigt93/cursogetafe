package es.curso.java.string;

import java.util.Scanner;

public class ValidacionEmail {
	
	public static void main(String[] args) {
		
		System.out.println("Escribe tu email: ");
		String email;
		Scanner scan = new Scanner(System.in);
		email = scan.next();
		System.out.println(email.trim());
		
		int posicionArr = email.indexOf("@");
		int posicionPunto= posicionArr+2;
		int caracteres = email.lastIndexOf(posicionPunto);
		
		
		if(email.contains("@") && !email.contains(" ") && posicionPunto==2) {
			System.out.println("Validado. Es correcto!!!");
		}else {
			System.out.println("Error!!!");
		}
		
		
	}
	
}



//Validar un email

//Solicitar un email. Indicamos si el email es correcto si cumple las siguientes validaciones. Si no es correcto indicar los fallos que tiene.

//Tiene 1 @
//NO contiene espacios en blanco despues de quitar los espacios en blanco a izq y derecha.
//Despues del "@" tiene que haber al menos un punto
//El espacio entre la @ y el primer punto despues de esta tiene que ser al menos de 2
//despues del ultimo punto tiene que haber entre 2 y 6 caracteres