package es.curso.java.poo.ejercicios.grancarrera;

import java.util.Scanner;

public class Ludopatas {
	
	private String nombre;
	private int saldo;
	private int apuesta;
	
		
	public Ludopatas(String nombre, int saldo, int apuesta) {
		
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


	public int getSaldo() {
		return saldo;
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	public int getApuesta() {
		return apuesta;
	}


	public void setApuesta(int apuesta) {
		this.apuesta = apuesta;
	}
	
	public void apuesta(Ludopatas...apuestas) {

		Scanner scan = new Scanner(System.in);
		int apuestaSaldo = scan.nextInt();
		boolean sinSaldo = false;
		int saldoRestante = 0;
				
			for (Ludopatas apuesta : apuestas) {
				
				do {
					for(int i=0;saldo!=0;i++) {
						if() {
					
						}
					}
					
				}while(!sinSaldo);
			}
	}
}
