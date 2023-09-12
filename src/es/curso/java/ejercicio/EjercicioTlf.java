package es.curso.java.ejercicio;

import java.util.Scanner;

public class EjercicioTlf {
	public static void main(String[] args) {
	System.out.println("Calcula el precio de tu llamada, por favor ingrese tiempo de llamada:");//, día de la semana y hora y calcularemos el coste de su llamada: );
	Scanner scan = new Scanner(System.in);
	int minutos = scan.nextInt();
	double centMinuto = 0.50;
	
	
	if (minutos <= 5) {
		System.out.println("1 Euro");
	}else if(minutos <= 8) {
		System.out.println("1.80 Euros");
	}else if(minutos <= 10) {
		System.out.println("2.50 Euros");
	}
	
	
	
	
	
	

	}
}











/*
 * Respuesta:
 * public static void main(String[] args) {
 * int tiempo=0;
 * String dia="";
 * int hora == 0;
 * double costeLlamada = 0;
 * 
 *Obtenemos los datos
 *
 *System.out.println("Introduce el tiempo de llamada");
	Scanner scan = new Scanner(System.in);
	tiempo = scan.nextInt();
	
	System.out.println("Introduce el dia de llamada");
	Scanner scan = new Scanner(System.in);
	dia = scan.nextLine();
	
	System.out.println("Introduce la hora de llamada");
	Scanner scan = new Scanner(System.in);
	hora = scan.nextInt();
	
	if(tiempo>0){
	    costeLlamada=1;
	    }
	    
		if(tiempo>5){
		costeLlamada += 0.8;
		}
		
		if(tiempo>8){
		costeLlamada += 0.7;
		}
		
		if(tiempo>10){
		costeLlamada += (tiempo - 10)*0.5;
		}
		
	(aplicamos impuestos a partir de aqui)
	
	if(dia.equalsIgnoreCase("domingo")){
		costeLlamada *= 1.03;
	}else{
		
			if(hora>6 && hora<=12){
			
			costeLlamada *= 1.15;
			
			}else if (hora>12 && hora<=23){
			
			costeLlamada *= 1.10;
			
			}else{
			
			costeLlamada *= 0.9;
			}
			
		}
		
	System.out.println("el coste de llamada ha sido de %.1f", costeLlamada);
	}else {
	System.err.println("el tiempo no puede ser negativo");
	}
	
	System.out.println("FIN");
	
	}
	
 */