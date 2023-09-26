package es.curso.java.poo.ejercicios.grancarrera;

public class CasaDeApuestas {

	public static void main(String[] args) {
//		DATOS A TENER EN CUENTA
//		edad (5-20)
//		+ velocidad (40-80)
//		+ peso (200-400)	
		
	Caballo c1 = new Caballo(01,"Pipin",12,13,65,230);
	Caballo c2 = new Caballo(02,"Popin",20,17,70,300);
	Caballo c3 = new Caballo(03,"Putin",23,10,75,295);
	
	Caballo [] caballos = {c1,c2,c3};
	
	
	Carrera trip1 = new Carrera(11,"1º Carrera",caballos,2300);
	Carrera trip2 = new Carrera(12,"2º Carrera",caballos,5390);
	Carrera trip3 = new Carrera(13,"3º Carrera",caballos,20854);
	
	Carrera [] carrera = {trip1, trip2, trip3};
	
	
	GranPremio gp1 = new GranPremio(21,"Gran Premio Wimbledon",carrera);
	GranPremio gp2 = new GranPremio(22,"Gran Premio Dubai",carrera);
	GranPremio gp3 = new GranPremio(23,"Gran Premio Nürburgring Nordschleife",carrera);
	
	Ludopatas a1 = new Ludopatas("Alfred",5000,0);
	Ludopatas a2 = new Ludopatas("Dorothy",5000,0);
	//Mostrar los datos del gran premio
	System.out.println();
		
		
	}
	
	public void mostrarDatos(GranPremio...granpremios){
		
		for (GranPremio granPremio : granpremios) {
			
		}
	}

	
	public void apuesta() {

		int apuestas;
		int saldo;
				
//			for (Apostante apostante : apostante) {
//				
//			}
		
		
		
		
		System.out.println("Buenas " );
	}
}
