package es.curso.java.poo.herencia.orquesta;

public class BandaDeMusica {

	public static void main(String[] args) {
		BandaDeMusica banda = new BandaDeMusica();
		banda.empezarConcierto();
		
	}

	
	private void empezarConcierto() {
		Guitarra g1 = new Guitarra("Alhambra","De cuerda",6);
		GuitarraElectrica ge1 = new GuitarraElectrica("Thunder", "De cuerda", 6, 200);
		Piano p1 = new Piano("Steinway","De cuerda",7,"De cola");
		Tambor t1 = new Tambor("Tambor", "Percusion", "De madera y piel");
		
		Instrumento [] orquesta = {g1,ge1,p1,t1};
		afinarInstrumentos(orquesta);
		tocarInstrumentos(orquesta);
		
	}
	
	private void afinarInstrumentos(Instrumento [] orquesta) {
		
		for (Instrumento instrumento : orquesta) {
			instrumento.afinar();
		}
	}
	
	private void tocarInstrumentos(Instrumento...instrumentos) {
		
		for (Instrumento instrumento : instrumentos) {
			if (instrumento instanceof Tambor) {
				//Se hace el cast para decirle que Instrumento que me pase es un Tambor "((Tambor)instrumento)" 
				//ESTO ES HACER CAST 
				((Tambor)instrumento).aporrear();
			}else {
			instrumento.tocar();
			}
		}
		
	}
}
