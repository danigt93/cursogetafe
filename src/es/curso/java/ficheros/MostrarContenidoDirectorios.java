package es.curso.java.ficheros;

public class MostrarContenidoDirectorios {
	
	
	public static void main(String[] args) {
	
		MainFicheros servicio = new MainFicheros();
		
		servicio.mostrarContenidoDirectorio("./directorios2");
		System.out.println("================================================================");
		servicio.mostrarCarpetas("./directorios2/dir1");
		System.out.println("================================enunciado 1================================");
		servicio.mostrarCarpetas("./directorios2/dir2");
		servicio.mostrarCarpetas("./directorios2/dir2/dir3");
		servicio.mostrarCarpetas("./directorios2/dir2/dir4");
	}
	
	
	
}
