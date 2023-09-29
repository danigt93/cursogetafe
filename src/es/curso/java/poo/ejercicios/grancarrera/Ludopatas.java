package es.curso.java.poo.ejercicios.grancarrera;

import java.util.Scanner;

public class Ludopatas {
	
	private String nombre;
	private double saldo;
	private double apuesta;
	
		
	public Ludopatas(String nombre, double saldo, double apuesta) {
		
		this.nombre = nombre;
		this.saldo = saldo;
		this.apuesta = apuesta;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getSaldo() {
		return saldo;
	}


	public double getApuesta() {
		return apuesta;
	}


	public void setApuesta(double apuesta) {
		this.apuesta = apuesta;
	}
	
	
	
	public void apuesta(Ludopatas...apuestas) {

		Scanner scan = new Scanner(System.in);
		boolean sinSaldo = false;
		double saldoRestante = 0;
				
//			for (Ludopatas apuesta : apuestas) {
//				
//				do {
//					
//					
//					for(int i=0;saldo!=0;i++) {
//						double importeApuesta = scan.nextDouble();
//						saldoRestante = saldo - importeApuesta;
//						
//						
//						if () {
//							double ganancia = (importeApuesta*2);
//							System.out.println("Enhorabuena has ganado "+ ganancia + " euros");
//							saldo +=  ganancia ;
//							importeApuesta++;
//						}else {
//							System.out.println("Has perdido, sigue probando");
//						}
//					}
//					
//				}while(!sinSaldo);
//			}
	}
}
