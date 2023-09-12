package es.curso.java.ejercicio;

import java.util.Scanner;

/* Declarar e inicializar una variable de tipo String 
 * con el valor del nombre de un mes:
 * 
 * Dependiendo del nombre del mes indicar la estación del año.
 * Si el nombre del mes es incorrecto indicarlo.
 * 
 * Si el mes es Agosto indicar además que está en vacaciones de verano 
 * y si es diciembre en vacaciones de Navidad 
 */
public class EjercicioIfEstacionesVariableVacaciones {
	public static void main(String[] args) {
		//Cojo texto de la consola
		System.out.println("Introduce un mes");
		Scanner scan = new Scanner(System.in);
		String mes = "Abril";//scan.nextLine();
		
		System.out.println("EL valor recogido por la consola es '" +mes +"'");
		
		
		String estacion = "";
		
		if (   mes .equals( "Enero") || mes.equals("Febrero")  || mes.equals("Marzo")  ) {      // cntrl + F = sustituir
			estacion = "invierno";
		}else if (   mes .equals( "Abril") || mes.equals("Mayo")  || mes.equals("Junio")  ) {
			estacion = "primavera";
		}else if (   mes .equals( "Julio") || mes.equals("Agosto")  || mes.equals("Septiembre")  ) {
			estacion = "verano";
			if (mes.equals("Agosto")) {
				//estacion = estacion + "Son vacaciones de verano";
				estacion += "\tSon vacaciones de verano";
			}
			
		}else if (   mes .equals( "Octubre") || mes.equals("Noviembre")  || mes.equals("Diciembre")  ) {
			estacion = "otoño";
			if (mes.equals("Diciembre")) {
				estacion += "\tSon vacaciones de Navidad";
			}
		}else {
			System.out.println("Mes incorrecto");
		}
		
		if(estacion!="") {
			System.out.println("Estás en " +estacion);
		}
		
//		if(estacion .equals( "") {
//			System.out.println("Mes incorrecto");
//		}else {
//			System.out.println("Estás en " +estacion);
//		}
		
		
		System.out.println("Fin");
	}
}
