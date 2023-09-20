package es.curso.java.poo;

public class PersonasMain {

	public static void main(String[] args) {
		
		Persona p1 = new Persona(); //Siemrpe que veas NEW es porque se esta creando un objeto
		System.out.println(p1.nombre);
		System.out.println(p1.nota);
		p1.nombre = "Eva";
		System.out.println(p1.nombre);
		
		Persona p2 = new Persona();
		Persona p3 = p1;
		p1 = p2;
		p2.nombre = "María";
		
		System.out.println(p3.nombre);
		
//		p1.edad = 34;
//		p2.correr();
//		p1.correr();
//		
//		p3.edad= 18;
//		p3.correr();
		
	}

}
