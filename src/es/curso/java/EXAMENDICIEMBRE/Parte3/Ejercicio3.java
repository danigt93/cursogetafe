package es.curso.java.EXAMENDICIEMBRE.Parte3;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Ejercicio3 {
		
	    public static void main(String[] args) {
	    	
	        // Información de la conexión a la base de datos

	        String url_oracle = "jdbc:oracle:thin:curso/password@localhost:1521:XE";
	        String usuario = "curso";
	        String contraseña = "password";

	        try (Connection connection = DriverManager.getConnection(url_oracle, usuario, contraseña)) {
	        	
	        	if (!existeTabla(connection, "TB_Productos")) {
	                 crearTabla(connection);
	                 insertarProductos(connection);
	             }
	        	
	            consultarTodosProductos(connection);
	            consultarPrecioMedioYCantidadPorTipo(connection);
	            
	        } catch (SQLException e) {
	        	
	            e.printStackTrace();
	            
	        }
	        
	    }
	    

	    private static boolean existeTabla(Connection connection, String nombreTabla) throws SQLException {
	        String query = "SELECT 1 FROM " + nombreTabla + " WHERE ROWNUM = 1";
	        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	            try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                return resultSet.next();
	            }
	        }	
	        
	    }
	    
	    
	    private static void crearTabla(Connection connection) throws SQLException {
	        String query = "CREATE TABLE TB_Productos ("
	                + "ID_Producto INT PRIMARY KEY,"
	                + "Nombre_Producto VARCHAR(75) NOT NULL,"
	                + "Tipo_Producto VARCHAR(20) CHECK (Tipo_Producto IN ('Alimentacion', 'Electronica', 'Ropa')) NOT NULL,"
	                + "Precio DECIMAL(5, 2) NOT NULL,"
	                + "Cantidad_Stock INT NOT NULL)";

	        try (Statement statement = connection.createStatement()) {
	            statement.executeUpdate(query);
	        }
	    }

	    private static void insertarProductos(Connection connection) throws SQLException {
	    	
	        String insertQuery = "INSERT INTO TB_Productos (ID_Producto, Nombre_Producto, Tipo_Producto, "
	        		+ "Precio, Cantidad_Stock) VALUES (?, ?, ?, ?, ?)";
	        
	        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
	            // Insertar 6 productos (2 de cada tipo)
	            insertarProducto(preparedStatement, 1, "Manzana", "Alimentacion", 10.5, 20);
	            insertarProducto(preparedStatement, 2, "Kiwi", "Alimentacion", 15.75, 30);
	            insertarProducto(preparedStatement, 3, "Ordenador", "Electronica", 199.99, 15);
	            insertarProducto(preparedStatement, 4, "PlayStation", "Electronica", 299.50, 10);
	            insertarProducto(preparedStatement, 5, "Camiseta", "Ropa", 49.99, 25);
	            insertarProducto(preparedStatement, 6, "Pantalon", "Ropa", 69.99, 12);
	        }
	    }

	    private static void insertarProducto(PreparedStatement preparedStatement, int id, String nombre, String tipo, double precio, int cantidad) throws SQLException {
	        preparedStatement.setInt(1, id);
	        preparedStatement.setString(2, nombre);
	        preparedStatement.setString(3, tipo);
	        preparedStatement.setDouble(4, precio);
	        preparedStatement.setInt(5, cantidad);
	        preparedStatement.executeUpdate();
	    }

	    private static void consultarTodosProductos(Connection connection) throws SQLException {
	        String query = "SELECT * FROM TB_Productos";
	        try (Statement statement = connection.createStatement();
	             ResultSet resultSet = statement.executeQuery(query)) {
	            System.out.println("Datos de todos los productos:");
	            while (resultSet.next()) {
	                System.out.println("ID: " + resultSet.getInt("ID_Producto")
	                        + ", Nombre: " + resultSet.getString("Nombre_Producto")
	                        + ", Tipo: " + resultSet.getString("Tipo_Producto")
	                        + ", Precio: " + resultSet.getDouble("Precio")
	                        + ", Cantidad en Stock: " + resultSet.getInt("Cantidad_Stock"));
	            }
	            System.out.println();
	        }
	    }

	    private static void consultarPrecioMedioYCantidadPorTipo(Connection connection) throws SQLException {
	        String query = "SELECT Tipo_Producto, AVG(Precio) AS PrecioMedio, SUM(Cantidad_Stock) AS CantidadTotal FROM TB_Productos GROUP BY Tipo_Producto";
	        try (Statement statement = connection.createStatement();
	             ResultSet resultSet = statement.executeQuery(query)) {
	            System.out.println("Precio medio y cantidad total por tipo de producto:");
	            while (resultSet.next()) {
	                System.out.println("Tipo: " + resultSet.getString("Tipo_Producto")
	                        + ", Precio Medio: " + resultSet.getDouble("PrecioMedio")
	                        + ", Cantidad Total: " + resultSet.getInt("CantidadTotal"));
	            }
	        }
	    }
	}

