package es.curso.java.ddbb.ejercicio;

import java.sql.SQLException;

import es.curso.java.ddbb.ejercicio.dao.LibrosDAO;
import es.curso.java.ddbb.ejercicio.libreria.entities.Libros;

public class LibrosMain {

		public static void main(String[] args) {
			LibrosDAO librosMain;
			
			try {
				librosMain = new LibrosDAO();
				librosMain.getLibros();
				
				for (Libros libros: librosMain.getLibros()) {
					System.out.println(libros);
				}
				
				System.out.println();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		}
		

	}
	
