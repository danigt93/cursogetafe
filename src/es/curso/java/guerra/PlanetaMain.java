package es.curso.java.guerra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.curso.java.guerra.excepciones.HabilidadesException;
import es.curso.java.guerra.excepciones.UnidadesPermitidasException;

public class PlanetaMain{

	public static void main(String[] args) throws HabilidadesException {
		
		PlanetaMain planeta = new PlanetaMain();
		planeta.iniciarGuerra();
		System.out.println("Empieza la guerra!!!");
		
		
		
	}
	
	
	void iniciarGuerra() throws HabilidadesException{
		
		VehiculoTripulado miNave = new VehiculoTripulado("ZOINKS");
		System.out.println(miNave);
		
		misPersonajes(miNave);
		miNave.atacar();
		
		
	}
		
	
	void misPersonajes(VehiculoTripulado nave) throws HabilidadesException{
		
		String name = "El Cigala";
		int force = 7;
		int defense = 3;
		
		
		
		do {
			int contador = 0;
			
			for(int i = 0; nave.getGuerreros().size() < 10 ;i++){
				Guerrero personaje = new Guerrero(name,force,defense);
				
				try {
					nave.embarcarGuerrero(personaje);
					System.out.println("Has embarcado a " + personaje);
				} catch (UnidadesPermitidasException e) {
					
					e.printStackTrace();
				}
				contador++;
				System.out.println("Has embarcado a " + contador + " personajes");
			}
		}while(nave.getGuerreros().size() > 10);
		
		
		
	}
	
	
	
	VehiculoGuerra construyeVehiculo() {
		
		return null;
		
	}
	
	VehiculoGuerra vehiculosBaseDeDatos() {
		
		return null;
		
	}
	
}
