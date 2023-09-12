package es.curso.java.ejercicio;

import java.util.Scanner;

public class EjercicioOpciones {
	public static void main(String[] args) {
		System.out.println("Mostrar meses de una estacion:\n1. Opcion1\n2. Opcion2\n3. Opcion3\n4. Opcion4\n5. Salir");
		Scanner scan = new Scanner(System.in);
		int opcion = 1;
				
		if (opcion==1) {
		System.out.println("Que estacion quieres?: ");
		}
		
		String mes = scan.nextLine();
		switch(mes.toLowerCase()) {
		case "invierno": System.out.println("Enero, Febrero y Marzo");break;
		case "primavera": System.out.println("Abril, Mayo y Junio");break;
		case "verano":System.out.println("Julio, Agosto y Septiembre");break;
		case "otoño": System.out.println("Octubre, Noviembre y Diciembre");break;
		default: System.out.println("Opcion incorrecta");
		}
	}
}


//Ejercicio: hay que hacer un menu
//opcion 1
//opcion 2
//opcion 3
//opcion 4
//Salir ---- tiene que decir Adiós

//Selecciona una opcion

/*
 * public class Menu {
	public static void main(String[] args) {
		String menu = "1. Opcion1\n2. Opcion2\n3. Opcion3\n4. Opcion4\n5. Salir";
		System.out.println(menu);
		System.out.println("Selecciona una opcion");
		Scanner scan = new Scanner (System.in);
		int opcion = scan.nextInt();
		
		switch(opcion) {
		case 1: 
			System.out.println("Introduce la estación del año");
			scan = new Scanner(System.in);
			String estacion = scan.nextLine();
			String meses = "";
			switch(estacion.toLowerCase()) {
		case "invierno": meses = "Enero, Febrero y Marzo";break;
		case "primavera": meses = "Abril, Mayo y Junio";break;
		case "verano":meses = "Julio, Agosto y Septiembre";break;
		case "otoño": meses = "Octubre, Noviembre y Diciembre";break;
		//default: System.err.println("La estacion introducida no es correcta");
			}
			
			if (!meses.equals("")){
			System.out.println("Los meses de la estacion"+estacion+"son"+meses");
			}else{
			System.err.println("La estacion introducida no es correcta");
			}
		 break;
		
		default: System.out.println("Opcion incorrecta");
		
		}
		
		
	}
}
 */