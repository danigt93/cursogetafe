package es.curso.java.poo;

public class AlumnosMain {

	public static void main(String[] args) {
		
		
		Alumnos p1 = new Alumnos(); //Siemrpe que veas NEW es porque se esta creando un objeto
		p1.nombre = "Edu";
		p1.apellidos = "Sanchez Ancho";
		p1.dni = "x0";
		p1.nota = 3;
		
		Alumnos p2 = new Alumnos("nombre", "apellidos", "dni");
		p2.nombre = "Casidy";
		p2.apellidos = "Pérez Montilla";
		p2.dni = "b2";
		p2.nota = 5;
		
		Alumnos p3 = new Alumnos("nombre", "apellidos", "dni", 0);
		p3.nombre = "DiStefanooor";
		p3.apellidos = "Galván Rodriguez";
		p3.dni = "a1";
		p3.nota = 8;
		
		p1.nota = 3;
		p2.nota = 5;
		p3.nota = 8;
		p1.estudiar();
		p2.estudiar();
		p3.estudiar();
		
		//Meto todos los alumnos en un array
		Alumnos[] alumnos = {p1, p2, p3};
		
		//Creo objeto de la clase para llamar a método no estático
		AlumnosMain am = new AlumnosMain();
		am.pintaAprobados(alumnos);
	}
	
	public void pintaAprobados(Alumnos [] alumnos) {
		
		for (Alumnos alumno : alumnos) {
			if(alumno.nota>=5) {
				System.out.println(alumno.dni);
				System.out.println(alumno.nombre);
				System.out.println(alumno.apellidos);
				System.out.println(alumno.nota);
				System.out.println("===========================");
			}
		}
	}

}
