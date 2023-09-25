package es.curso.java.poo.ejercicios.maniqui;

public class Escaparate {

	public static void main(String[] args) {
		
		Boton bp = new Boton(1,"redondo","Blanco","S");
		Boton b1 = new Boton(2,"redondo","Marrón","S"); //Siemrpe que veas NEW es porque se esta creando un objeto
		Boton b2 = new Boton(3,"redondo","Verde","S");

		//Meto todos los alumnos en un array
		Boton [] botones = {b1,b2};
		
		Pantalon p1 = new Pantalon(1,"L","AZUL",30.50,bp);
		Camisa c1 = new Camisa(11,"L","Blanca",23.50,botones);
		Vestido v1 = new Vestido(22,"M","VERDE",30.20);
		
		Maniqui maniquiDesnudo = new Maniqui(0);
		
		Maniqui maniquiPantalonCamisa = new Maniqui(1,p1,c1);
		maniquiPantalonCamisa.vestir(p1, c1);
		Maniqui maniquiVestido = new Maniqui(2,v1);
		maniquiVestido.vestir(v1);
		
		
		Escaparate escaparate = new Escaparate();
		escaparate.mostrarEscaparate(maniquiPantalonCamisa, maniquiVestido);
		
		
	}
	
	public void mostrarEscaparate (Maniqui...maniquis) {
			for (Maniqui maniqui : maniquis) {
				
				System.out.println(maniqui.getId());
				if (maniqui.getCamisa() != null) {
					System.out.println("Datos de la camisa");
					System.out.println(maniqui.getCamisa().getColor());
					System.out.println(maniqui.getCamisa().getTalla());
					System.out.println(maniqui.getCamisa().getPrecio());
					
					Boton [] Botones = maniqui.getCamisa().getBoton();
					for (Boton boton : Botones) {
						System.out.println(boton.getColor());
						System.out.println(boton.getForma());
					}
					
				}
				
				
				if (maniqui.getPantalon() != null) {
					System.out.println("Datos del pantalon");
					System.out.println(maniqui.getPantalon().getColor());
					System.out.println(maniqui.getPantalon().getTalla());
					System.out.println(maniqui.getPantalon().getPrecio());
					
					Boton botonPantalon = maniqui.getPantalon().getBoton();
					System.out.println(botonPantalon.getColor());
					System.out.println(botonPantalon.getForma());
				}
				
				if (maniqui.getVestido() != null) {
					System.out.println("Datos del vestido");
					System.out.println(maniqui.getVestido().getColor());
					System.out.println(maniqui.getVestido().getTalla());
					System.out.println(maniqui.getVestido().getPrecio());

				}
				
				
			}
		}

		public void mostrarPrecionManiquis (Maniqui [] maniquis) {
			double precioTotal = 0;
			for (Maniqui  maniqui: maniquis) {
				precioTotal = 0;
				if (maniqui.getVestido() != null) {
					double precioVestido = maniqui.getVestido().getPrecio();
					precioTotal += precioVestido;
				}
				if (maniqui.getPantalon() != null) {
					precioTotal += maniqui.getPantalon().getPrecio();
				}
				if (maniqui.getCamisa() != null) {
					precioTotal += maniqui.getCamisa().getPrecio();
				}
				System.out.println("El precio total es de "+precioTotal);
			}
			
			
		}
	}

