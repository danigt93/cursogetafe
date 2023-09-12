package es.curso.java.introduccion.condiciones;

public class CondicionesIf {
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		
		int numero = 100;
		boolean esMayorEdad = false;
		
		//System.out.println((7+2)*3);
		
		if (numero>=100 && (esMayorEdad || numero<200)) {
		System.out.println("1");
		System.out.println("2");
		
		}else if(numero == 100) {
			System.out.println("3");
			System.out.println("4");
		}else {
		
		System.out.println("5");
		System.out.println("6");
		}
		System.out.println("Fin");
	}
	

}


//1: ponemos una adivinanza y hay que ingresar la respuesta, se recoje el resultado de esa adinvinanza. si acierta tiene que ponerlo y en el caso contrario igual.
//2: pedimos introducir el nombre y edad, dependiendo de la edad (entre 0 a 5 años, es un bebe)(entre 6 y 15, niño)(entre 16 a 20 es adolescente)(enter 20 y 40)(40-60)(60-80)(80-100)