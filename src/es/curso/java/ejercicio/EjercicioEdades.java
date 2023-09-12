package es.curso.java.ejercicio;

import java.util.Scanner;

public class EjercicioEdades {
public static void main(String[] args) {
	System.out.println("Introduce un nombre: ");
	Scanner scan = new Scanner(System.in);// Esto es para escanear(Control + Shift + O)
	String nombre = scan.nextLine();
	System.out.println("Introduce una edad: ");
	int edad = scan.nextInt();
	 
	
	if (edad<=5) {
		System.out.println("Es un bebe");
	}else if(edad<=15) {
		System.out.println("Es un niño");
	}else if(edad<=20) {
		System.out.println("Es un casi hombre");
	}else if(edad<=50) {
		System.out.println("Es un pureta");
	}else if(edad<=80) {
		System.out.println("Estás pal arrastre yayo");
	}else if(edad<=120) {
		System.out.println("Te pasaste el juego, descansa de lo que te queda de jubilación, leyenda");
	}
	
	
}
}

// Ejercicio: introducir el nombre y edad, dependiendo de la edad (entre 0 a 5 años, es un bebe)(entre 6 y 15, niño)(entre 16 a 20 es adolescente)
//(entre 20 y 40)(40-60)(60-80)(80-100)

