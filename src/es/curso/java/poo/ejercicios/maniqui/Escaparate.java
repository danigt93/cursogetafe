package es.curso.java.poo.ejercicios.maniqui;

public class Escaparate {

	public static void main(String[] args) {
		
		Boton bp = new Boton(120,"forma","color","tamanio");
		Boton b1 = new Boton(124,"forma","color","tamanio"); //Siemrpe que veas NEW es porque se esta creando un objeto
		Boton b2 = new Boton(123,"forma","color","tamanio");

		//Meto todos los alumnos en un array
		Boton [] botones = {b1,b2};
		
		Pantalon p1 = new Pantalon(20,"talla","color","precio" + (bp));
		Camisa c1 = new Camisa(30,"talla","color","precio", (botones));
		Vestido v1 = new Vestido(40,"talla","color","precio");
		Maniqui maniquiDesnudo = new Maniqui(55);
		Maniqui maniquiVestido = new Maniqui(55, "Pantalon", "Camisa", "Vestido");
		

	}
}
