package es.curso.java.guerra;

import java.util.ArrayList;
import java.util.List;

import es.curso.java.guerra.excepciones.HabilidadesException;
import es.curso.java.guerra.excepciones.UnidadesPermitidasException;

public abstract class VehiculoGuerra implements Tripulable {

	private String nombre;
	private int atk;
	private int def;
	private List <Guerrero> guerreros = new ArrayList<Guerrero>(); //Se pone new Array... para crear la lista sino te DARÁ NULLPOINTEREXECPTION
	private int puntosVida = PUNTOS_VIDA;
	
	
	private VehiculoGuerra(int atk, int def) throws HabilidadesException{
		if(atk + def>10) {
			throw new HabilidadesException("La suma del ataque y defensa no puede ser superior a 10");
		}else {
		this.atk = atk;
		this.def = def;
		}
	}
	
	
	public VehiculoGuerra(String nombre) throws HabilidadesException{
		this(5,5);
		this.nombre = nombre;
	}
	
	public VehiculoGuerra(String nombre, int atk, int def) throws HabilidadesException{
		this(atk, def);
		this.nombre = nombre;
	}

	/**
	 * @return the atk
	 */
	public int getAtk() {
		return atk;
	}


	/**
	 * @return the def
	 */
	public int getDef() {
		return def;
	}
	

	/**
	 * @return the puntosVida
	 */
	int getPuntosVida() {
		return puntosVida;
	}


	/**
	 * @param puntosVida the puntosVida to set
	 */
	void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	
	/**
	 * @return the guerreros
	 */
	public List<Guerrero> getGuerreros() {
		return guerreros;
	}
	
	
	
	public void embarcarGuerrero(Guerrero guerrero) throws UnidadesPermitidasException{
		
		if(this.guerreros.size()<10) {			
		this.guerreros.add(guerrero);
		}else {
			throw new UnidadesPermitidasException("Has superado el numero de unidades max. establecido en 10");
		}
	}
	
}
