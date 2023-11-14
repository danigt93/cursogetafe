package es.curso.java.ddbb.ejercicio.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.ddbb.ejercicio.libreria.entities.Biblioteca;
import es.curso.java.ddbb.ejercicio.libreria.entities.Direccion;


public class BibliotecaDAO extends ConexionDAO {


	public BibliotecaDAO() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Biblioteca> getBibliotecas () throws SQLException {
		
		List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();

		Statement stmt = this.getConexion().createStatement();
		String query = "SELECT b.ID_BIBLIOTECA, b.NOMBRE, d.CALLE, d.NUMERO, d.C_POSTAL, d.CIUDAD, d.PROVINCIA, d.PAIS\r\n"
				+ "FROM TB_BIBLIOTECAS AS b JOIN TB_DIRECCIONES AS d ON d.ID_DIR = b.PK_DIR";
		
		ResultSet rs = stmt.executeQuery(query);
		
		while (rs.next()) {
			long idBiblioteca = rs.getLong("b.ID_BIBLIOTECA");
			String nombreBiblioteca = rs.getString("b.NOMBRE");
			String calle = rs.getString("d.CALLE");
			int numeroCalle = rs.getInt("d.NUMERO");
			int codPostal = rs.getInt("d.C_POSTAL");
			String ciudad = rs.getString("d.CIUDAD");
			String provincia = rs.getString("d.PROVINCIA");
			String pais = rs.getString("d.PAIS");

			Direccion dir = new Direccion(calle,numeroCalle,codPostal,ciudad,provincia,pais);
			Biblioteca biblio = new Biblioteca(idBiblioteca, nombreBiblioteca, dir);
			
			bibliotecas.add(biblio);
		}
		
		return bibliotecas;
	}
	
	public List<Biblioteca> getBibliotecas (String ciudad) {
		
		List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();
		
		return bibliotecas;
	}
	
	
	public Biblioteca getBiblioteca (long id) {
		
		
		return null;
	}
	
	
}
