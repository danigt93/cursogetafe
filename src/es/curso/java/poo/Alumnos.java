package es.curso.java.poo;

//POJO
public class Alumnos {

	String nombre;
	String apellidos;
	String dni;
	double nota;
	
	//3 constructores:
	public Alumnos() {
		this.nombre = "";
	}
	
	public Alumnos(String nombre , String apellidos, String dni) {
		this.nombre = nombre;		//THIS. se pone para decirle que se fije en la variable que he puesto como String nombre de la línea 6
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	public Alumnos(String nombre , String apellidos, String dni, double nota) {
		this.nombre = nombre;		//THIS. se pone para decirle que se fije en la variable que he puesto como String nombre de la línea 6
		this.apellidos = apellidos;
		this.dni = dni;
		this.nota = nota;
	}
	
	
	//GETTER Y SETTER
	public void setDni(String dni) {			//Set es para lanzar la información
		this.dni = dni;							
	}
	
	public String getDni() {					//Get es para recoger la información
		return dni;
	}
	
	//MANERA RAPIDA: GETTER Y SETTER
	//CLICK DRCH(ratón) + SOURCE = GENERATE GETTERS AND SETTERS
	
	
	//metodos(ya no se pone static) correr, se va a ejecutar diferentes en los objetos aunque sean de la misma clase
	public void estudiar () {
		System.out.println(nota);
		if (nota==0) {
			System.out.println("La persona con nombre " + this.nombre + " está suspenso con un " + this.nota + " .\n No ha estudiado nada");
		}
		if (nota<5) {
			System.out.println("La persona con nombre " + this.nombre + " está suspenso con un " + this.nota + " .\n Ha estudiado poco");
		}
		if (nota>=5 && nota<9) {
			System.out.println("La persona con nombre " + this.nombre + " está aprobado con un " + this.nota +" .\n Ha estudiado mucho");
		}

		if (nota==10) {
			System.out.println(" Cásate con mi hij@ ");
		}else if (nota>10) {
			System.out.println("No es de aquí, llévenselo");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
}
