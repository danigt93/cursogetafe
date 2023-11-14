package es.curso.java.guerra;

import es.curso.java.guerra.excepciones.HabilidadesException;

public class VehiculoTripulado extends VehiculoGuerra {

	public VehiculoTripulado(String nombre) throws HabilidadesException {
		super(nombre);
		
	}

	public VehiculoTripulado(String nombre, int atk, int def) throws HabilidadesException {
		super(nombre, atk, def);
	}

	
	@Override 
	public double atacar() {

		double ataqueResultado;
		double r1 = (double)(Math.random()*1);
		double r2 = (double)(Math.random()*0.5);
		
		double sumFuerzas = 0;
		for(Guerrero gue : this.getGuerreros()) {
			sumFuerzas += gue.getFuerza();
		}
		
		ataqueResultado = (this.getAtk() * r1 ) + (sumFuerzas * r2);
		
		System.out.println(ataqueResultado);
		
		return ataqueResultado;
	}

	@Override
	public double defender(double ataqueEnemigo) {
		double defensaResultado;
		double r1 = (double)(Math.random()*1);
		double r2 = (double)(Math.random()*0.5);
		
		double sumResistencias = 0;
		for(Guerrero gue : this.getGuerreros()) {
			sumResistencias += gue.getResistencia();
		}
		
		defensaResultado = (this.getDef() * r1) + (sumResistencias * r2);
		
		System.out.println(defensaResultado);
		
		return defensaResultado;
	}

}
