package es.curso.java.hibernate.ejercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import es.curso.java.hibernate.ejercicio.dao.UserDAO;
import es.curso.java.hibernate.ejercicio.entity.UsuarioEntity;
import es.curso.java.hibernate.ejercicio.util.UtilFecha;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;

public class Ejercicio2{

	public static void main(String[] args) throws IOException {
		Ejercicio2 ejer2 = new Ejercicio2();
		ejer2.iniciar();
		ejer2.leerArchivo("");
	}
	
	public void iniciar() {
		EntityManager em = JpaUtil.getEM("hibernateOracle");
		
		UserDAO userDao = new UserDAO(em);
		//Insertar los usuarios
		insertarUsuarios(userDao);
		//Consultar usuarios
		List<UsuarioEntity> usuarios = consultaUsuarios(userDao);
		//Escribir en fichero
		escribirFichero("./hibernate_ejercicio2.txt",usuarios);
	}
	
	public void insertarUsuarios(UserDAO userDao) {
		
		UsuarioEntity user1 = new UsuarioEntity("N1", "A1", "1A", new Date());
		UsuarioEntity user2 = new UsuarioEntity("N2", "A2", "2A", new Date());
		UsuarioEntity user3 = new UsuarioEntity("N3", "A3", "3A", new Date());
		
		userDao.insertarUsuarios(Arrays.asList(user1,user2,user3));
	}
	
	public List<UsuarioEntity> consultaUsuarios(UserDAO userDao) {
		
		return userDao.getUsers();
	}
	
	public void escribirFichero (String fichero, List<UsuarioEntity> usuarios) {
		File archivo = new File(fichero);
		try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, false))) {

			//CABECERA
			buffer.append("ID;NOMBRE;APELLIDOS;DNI;FECHA");
			buffer.newLine();
			for (UsuarioEntity userEntity : usuarios) {
				SimpleDateFormat formattedDate = new SimpleDateFormat("yyyyMMdd");
				String fecha = formattedDate.format(userEntity.getFechaAlta());
				
				buffer.append(userEntity.getId() + ";" +
						userEntity.getNombre() + ";" +
						userEntity.getApellidos() + ";" +
						userEntity.getDni() + ";" +
						userEntity.getNombre() + ";" +
						fecha
						);
				buffer.newLine();
			}

			System.out.println("El archivo se ha creado con éxito!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public String leerArchivo(String nombre) throws IOException {

//		FileReader fileReader = new FileReader(archivo);
//		BufferedReader reader = new BufferedReader(fileReader);
//
//		String linea;
//		while ((linea = reader.readLine()) != null) {
//			sb.append(linea).append("\n");
//		}

		//Creacion de objetos:
		Path path = Paths.get(nombre);
		List<String> lines = Files.readAllLines(path);
		
//		CabeceraClass consola = new CabeceraClass("PS5","Consola",,5000,3);
//		CabeceraClass tv = new CabeceraClass("LG","Tv Plasma",Date.from(null),1000,6);
//		CabeceraClass sillon = new CabeceraClass("Sillon Masajes","Mobiliario",Date.from(null),3000,7);
//		CabeceraClass pcGaming = new CabeceraClass("MSI","Portátil",Date.from(null),5000,9);
//		CabeceraClass moto = new CabeceraClass("Suzuki","Automovil",Date.from(null),7000,8);
//		CabeceraClass zapatillas = new CabeceraClass("Jordan","Zapatillas",Date.from(null),200,13);
//		CabeceraClass coche = new CabeceraClass("Honda","Automovil",Date.from(null),25000,1);
//		CabeceraClass piscina = new CabeceraClass("Piscina","Ocio/ext.",Date.from(null),15000,2);
		
		
		
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){

            String linea;
            
            while ( (linea = reader.readLine()) != null){
            	
                sb.append(consola).append(tv).append(sillon).append(pcGaming).append(moto)
                .append(zapatillas).append(coche).append(piscina).append("\n");
                
            }
        } catch (IOException e) {
        	
            e.printStackTrace();
            
        }
        
		return sb.toString();
	}

	
}
