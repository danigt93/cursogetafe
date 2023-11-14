package es.curso.java.competicion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class EquiposMain {

	public static void main(String[] args) {
		EquiposMain equipo = new EquiposMain();
		equipo.iniciarMapasEquipos();
		
	}
	
	public void iniciarMapasEquipos() {
		Map<EquipoCompeticion, List<JugadoresCompeticion>> equipo = new HashMap<EquipoCompeticion, List<JugadoresCompeticion>>();
		
		// Crear un equipo
		EquipoCompeticion hrc = new EquipoCompeticion("Honda HRC", 800, 60);
		EquipoCompeticion tgr = new EquipoCompeticion("Toyota GR", 463, 25);
		
		// Crear jugadores
		JugadoresCompeticion spain = new JugadoresCompeticion("Fernando Alonso", 42, "1º");
		JugadoresCompeticion germ = new JugadoresCompeticion("Michael Schumacher", 54, "2º");
		JugadoresCompeticion find = new JugadoresCompeticion("Tommi Mäkinen", 59, "5º");
		JugadoresCompeticion swit = new JugadoresCompeticion("Ralph Boschung", 43, "7º");
		JugadoresCompeticion spain1 = new JugadoresCompeticion("Carlos Sainz Jr", 29, "3º");
		JugadoresCompeticion spain2 = new JugadoresCompeticion("Carlos Sainz", 61, "6º");
		
		
		 // Crear una lista de jugadores
        List<JugadoresCompeticion> jugadores1 = new ArrayList<JugadoresCompeticion>();
        
        // Agregar jugadores a la lista
        jugadores1.add(spain);
        jugadores1.add(germ);
        jugadores1.add(find);
        
        
        equipo.put(hrc, jugadores1);
        equipo.put(tgr, Arrays.asList(swit,spain1,spain2));
        
        
        Collection<List<JugadoresCompeticion>> todosJugadores = equipo.values();
        
		for (List<JugadoresCompeticion> listaJugadores : todosJugadores) {
			for (JugadoresCompeticion jugador : listaJugadores) {
				System.out.println(jugador.getNombre());
			}
		}
		
		
		//Fácil
		Set<EquipoCompeticion> equipos = equipo.keySet();
		for (EquipoCompeticion equipoCompeticion : equipos) {
			System.out.println(equipoCompeticion);
			equipo.get(equipos);
		}
		
	}
	
	}
