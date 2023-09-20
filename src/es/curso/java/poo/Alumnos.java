package es.curso.java.poo;

//POJO
public class Alumnos {

	String nombre;
	String apellidos;
	String dni;
	int nota;
	
	//3 constructores:
	public Alumnos() {
		this.nombre = "";
	}
	
	public Alumnos(String nombre , String apellidos, String dni) {
		this.nombre = nombre;		//THIS. se pone para decirle que se fije en la variable que he puesto como String nombre de la línea 6
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	public Alumnos(String nombre , String apellidos, String dni, int nota) {
		this.nombre = nombre;		//THIS. se pone para decirle que se fije en la variable que he puesto como String nombre de la línea 6
		this.apellidos = apellidos;
		this.dni = dni;
		this.nota = nota;
	}
	
	
	
	//metodos(ya no se pone static) correr, se va a ejecutar diferentes en los objetos aunque sean de la misma clase
	public void estudiar () {
		System.out.println("La persona con nombre " + nombre + " y edad " + nota + " está corriendo");
		if (nota<5) {
			System.out.println(" No ha estudiado nada ");
		
		if (nota>=5 && nota==9) {
			System.out.println(" Ha estudiado mucho ");
			
		if (nota==10) {
			System.out.println(" Cásate con mi hij@ ");
		}else {
			System.out.println("No es de aquí, llévenselo");
		}}}
	}
}
