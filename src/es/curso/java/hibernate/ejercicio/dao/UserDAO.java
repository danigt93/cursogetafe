package es.curso.java.hibernate.ejercicio.dao;

import java.util.Date;
import java.util.List;

import es.curso.java.hibernate.ejercicio.entity.UsuarioEntity;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class UserDAO {
	
	private EntityManager em;

	public UserDAO() {
		em = JpaUtil.getEM("hibernateMySQL");
	}
	
	public UserDAO(String persitenceUnitName) {
		em = JpaUtil.getEM(persitenceUnitName);
	}
	
	public UserDAO(EntityManager em) {
		this.em = em;
	}
	
	public List<UsuarioEntity> getUsers (){
		List<UsuarioEntity> usuarios;
		
		usuarios = em.createQuery("from UserEntity", UsuarioEntity.class)
			.getResultList();
		
		return usuarios;
	}
	
	public List<UsuarioEntity> getUsersByName (String name){
		List<UsuarioEntity> usuarios;
		
		Query query = em.createQuery(
				"from UserEntity ue where ue.nombre=?1", 
				UsuarioEntity.class);
		
		
//		Query query2 = em.createQuery(
//				"select new UserVip(ue.id) from UserEntity ue where ue.vip=?1", 
//				UserVip.class);
		
		query.setParameter(1, name);
		usuarios = query.getResultList();
		
		return usuarios;
	}
	
	public List<UsuarioEntity> getUsersByDate (Date fechaConsulta){
		List<UsuarioEntity> usuarios;
		
		Query query = em.createQuery(
				"from UserEntity ue where ue.fechaAlta>=?1", 
				UsuarioEntity.class);
		
		query.setParameter(1, fechaConsulta);
		usuarios = query.getResultList();
		
		return usuarios;
	}
	
	public void insertarUsuario (UsuarioEntity user) {
		 em.getTransaction().begin();
		 try {
			 em.persist(user);
			 
			 em.getTransaction().commit();
		 }catch(Exception e) {
			 em.getTransaction().rollback();
		 }
	     
	}
	
	public void insertarUsuarios (List<UsuarioEntity> users) {
		 em.getTransaction().begin();
		 try {
			 
			for (UsuarioEntity user : users) {
				 em.persist(user);
			}
			 
			em.getTransaction().commit();
		 }catch(Exception e) {
			 em.getTransaction().rollback();
		 }
	     
	}
	
	
	public void borrarUsuarioPorNombre (String nombre) {
		 em.getTransaction().begin();
		 try {
			List<UsuarioEntity> usuarios = getUsersByName(nombre);
            
            for (UsuarioEntity userEntity : usuarios) {
            	em.remove(userEntity);
			}
            
            em.getTransaction().commit();
		 }catch(Exception e) {
			 em.getTransaction().rollback();
		 }
	     
	}
	
	public void modificarUsuarioPorDni (String dni, UsuarioEntity userModified) {
		
		TypedQuery<UsuarioEntity> query = em.createQuery(
				"from UserEntity where dni=?1",
				UsuarioEntity.class);
		query.setParameter(1, dni);
		
		try {
			UsuarioEntity user = query.getSingleResult();
			em.getTransaction().begin();
			//user.setId(userModified.getId());
			user.setNombre(userModified.getNombre());
			user.setApellidos(userModified.getApellidos());
			user.setFechaAlta(userModified.getFechaAlta());

			em.merge(user);
			
			em.getTransaction().commit();
		}catch (NoResultException nre) {
			System.out.println("Dni "+dni+ " no encontrado");
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		
	}
	
}
