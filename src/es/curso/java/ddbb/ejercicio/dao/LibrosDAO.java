package es.curso.java.ddbb.ejercicio.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.ddbb.ejercicio.libreria.entities.Libros;

public class LibrosDAO extends ConexionDAO {


	public LibrosDAO() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Libros> getLibros () throws SQLException {
		
		List<Libros> libros = new ArrayList<Libros>();

		Statement stmt = this.getConexion().createStatement();
		String query = "SELECT ID_LIBRO, NOMBRE, AUTOR, EDITORIAL, ISBM FROM TB_LIBROS";
		
		ResultSet rs = stmt.executeQuery(query);
		
		while (rs.next()) {
			long id = rs.getLong("ID_LIBRO");
			String nombreLibro = rs.getString("NOMBRE");
			String autorLibro = rs.getString("AUTOR");
			String editorialLibro = rs.getString("EDITORIAL");
			long isbmLibro = rs.getLong("ISBM");
			

			Libros libro = new Libros(nombreLibro,autorLibro,editorialLibro,isbmLibro);
			
			libros.add(libro);
		}
		
		return libros;
	}
	

	
	
}