package es.curso.java.funciones;

import es.curso.java.utilidades.Utilidades;

public class FuncionesMenu {

	public static void main(String [] args) {
		String menu = "";
		pintarMenu(menu);
		int valor = 0;
		
	}
	
	public static void pintarMenu(String menu) {
		int elegir = Utilidades.pintarMenu(menu);
		int opcion = Utilidades.pideDatoNumerico(menu);
	}
	
//	public static int sumatorio(int suma) {
//		suma = OperacionesCalculadora.suma(suma);
//	}
}
