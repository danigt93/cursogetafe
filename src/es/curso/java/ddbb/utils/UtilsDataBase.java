package es.curso.java.ddbb.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilsDataBase {
//PATRON DE DISEÑO SINGLETON
	
	
	private static Connection connection;
	
	public static Connection getInstance () throws SQLException {
		String url = "jdbc:mysql://localhost:3306/bbdd_basededatoscurso?serverTimezone=Europe/Madrid";
		String userName = "root";
		String password = "password";
		
		connection = getInstance(url, userName, password);
		
		return connection;
		
	}
	
	public static Connection getInstance (String url, String userName, String password) throws SQLException{
		
		if (connection == null) {
		connection = DriverManager.getConnection(url, userName, password);
		}
		return connection;
		
	}
	
	public static void cerrarConexion() throws SQLException{
		
		if (connection != null) {
			connection.close();
			connection = null;
			}
		
	}
	

}
