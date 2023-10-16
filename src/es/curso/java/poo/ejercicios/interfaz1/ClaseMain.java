package es.curso.java.poo.ejercicios.interfaz1;

public class ClaseMain{

	public static void main (String [] args) {
		
		ClaseMain concesionario = new ClaseMain();
		
		
		Coche c1 = new Coche(69,"6969JDM","HONDA CIVIC EG6",3);
		Moto m1 = new Moto(123,"1314JVD","Suzuki GSX R1000 con escape Leo Vince", 2);
		Movil m11 = new Movil(124,150.40,"Samsung S23 Ultra","Android");
		Televisor tv1 = new Televisor(15, 1500.70, "LG C1", "HDMI 8K");
		
		InterfezSistemaEncendido [] nave = {c1,m1,m11,tv1};
		
		
		Usuario u1 = new Usuario();
		u1.getCoche();
		u1.getMoto();
		u1.getMovil();
		u1.getTv();
		
		concesionario.encenderObjeto(nave);
	
	}

	
	private void encenderObjeto(InterfezSistemaEncendido...encendidos) {
		
		for (InterfezSistemaEncendido cosa : encendidos) {
			
			cosa.encender();
			
		}
		
	}
}
