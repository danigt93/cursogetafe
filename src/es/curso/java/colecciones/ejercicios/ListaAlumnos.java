package es.curso.java.colecciones.ejercicios;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import es.curso.java.poo.Alumnos;
import es.curso.java.utilidades.Utilidades;


public class ListaAlumnos {

	public static void main(String[] args) {
		
		ListaAlumnos la = new ListaAlumnos();
		la.iniciaEjercicio();
		
	}
	
	private void iniciaEjercicio() {
	
	List<Alumnos> alumnos = generaListadoAlumnos();
	System.out.println(alumnos.size());
	for (Alumnos alumno : alumnos) {
		System.out.println(alumno);
		} 
	
	String dni = Utilidades.pideDatoTexto("Introduce el dni a borrar");
	
	for (Alumnos alumno : alumnos) {
		if(dni.equalsIgnoreCase(alumno.getDni())) {
			alumnos.remove(alumno);
		}
	}
	
	pintaAlumnos(alumnos);
	
	dni = Utilidades.pideDatoTexto("Introduce el dni a borrar");
	
	for (Alumnos alumno : alumnos) {
		if(dni.equalsIgnoreCase(alumno.getDni())) {
			alumno.setNombre("Nombre nuevo");
		}
	}
	
	pintaAlumnos(alumnos);
	
	}
	
	
	
	private void pintaAlumnos(List<Alumnos>alumnos) {
		for (Alumnos alumno : alumnos) {
			System.out.println(alumno);
		}
	}
	
	

	/*
	 * Método devolver listado alumnos
	 * @return
	 * */
	
	
	public List<Alumnos> generaListadoAlumnos(){
		
		Alumnos a1 = new Alumnos("Fermin","Trujillo","2L");
		Alumnos a2 = new Alumnos("Antonio","Torres","1G");
		Alumnos a3 = new Alumnos("Daniel","Segura","3X");
		Alumnos a4 = new Alumnos("Aurora","Fernandez","4R");
		
		List<Alumnos> listaAlumnos = new CopyOnWriteArrayList<Alumnos>();
		
		if(listaAlumnos.isEmpty()) {
		listaAlumnos.add(a1);
		listaAlumnos.add(a2);
		listaAlumnos.add(a3);
		listaAlumnos.add(a4); 
		}
		
		return listaAlumnos;
	}
	
}
