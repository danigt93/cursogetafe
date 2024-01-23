package es.curso.java.enumm;

public class Main {

	public static void main (String[] Args) {
	
	TornilloEnum t1 = new TornilloEnum(1, "Gris", 15, 20.5,0.5);
	TornilloEnum t2 = new TornilloEnum(1, "Gris", 15, 20.5,0.5);
	TornilloEnum t3 = new TornilloEnum(1, "Gris", 15, 20.5,0.5);
	
	TornilloEnum [] tornillos = {t1, t2, t3};
	
	FerreteriaEnum ferreteria = new FerreteriaEnum(1, "Ferretería Los Franceses", "Avnd. A droite, 12", tornillos);
	
	}
	
}