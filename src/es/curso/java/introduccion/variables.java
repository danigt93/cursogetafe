package es.curso.java.introduccion;

public class variables {
	//VARIABLES DE INSTANCIA O CLASE
	static String curso = "Curso Java";
	static int num;
public static void main(String[] args) {
	
	//VARIABLE LOCAL: solo se puede usar dentro del metodo donde se declara
	int num; // Declaracion
	num = 7; //Inicializar
	
	
	//Comentario de línea
	
	/*
	 Comentario de bloque
	 Línea
	 Línea 2
	 */
	
	//Declaración de variable
	//Tipos primitivos
	byte numero2 = 127;
	short numero1 = 32767;
	int numero = 9;
	long numero3 = 101;
	//Numeros Decimales
	double decimal1 = 9.6;
	float decimal2 = 8.7f;
	//Caractares
	char caracter = '1';
	//Boolean
	boolean esMayorEdad = true;
	boolean esPar = false;
	
	int edad= 28;
	String nombre = "Daniel";
	//nombre = "1";
	
	System.out.println("Mi nombre es: " + nombre + " y edad:" + (edad + 2));
	}
}
