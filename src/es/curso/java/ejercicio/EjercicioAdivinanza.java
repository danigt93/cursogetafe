package es.curso.java.ejercicio;

import java.util.Scanner;

public class EjercicioAdivinanza {
	public static void main(String[] args) {
		System.out.println("Oro parece, PLATA NO es... Que soy?:" + "\tIngrese su respuesta: ");
		Scanner scan = new Scanner(System.in);
		String request = scan.nextLine();
		String resp = "el plátano";
		
		if(resp.equals(request)) {
			System.out.println("Correcto");
		}
		
		if(!request.equals(resp)) {
			System.out.println("Incorrecto");
		}
		}
	}



//1: ponemos una adivinanza y hay que ingresar la respuesta, se recoje el resultado de esa adinvinanza. si acierta tiene que ponerlo y en el caso contrario igual.
//2: pedimos introducir el nombre y edad, dependiendo de la edad (entre 0 a 5 años, es un bebe)(entre 6 y 15, niño)(entre 16 a 20 es adolescente)(enter 20 y 40)(40-60)(60-80)(80-100)