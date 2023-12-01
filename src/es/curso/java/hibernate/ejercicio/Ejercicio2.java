package es.curso.java.hibernate.ejercicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import es.curso.java.hibernate.basics.daos.AlumnoHibernateDAO;
import es.curso.java.hibernate.ejercicio.dao.UserDAO;
import es.curso.java.hibernate.ejercicio.entity.UsuarioEntity;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;

public class Ejercicio2{

	public static void main(String[] args) {
		Ejercicio2 ejer2 = new Ejercicio2();
		ejer2.iniciar();
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
}
