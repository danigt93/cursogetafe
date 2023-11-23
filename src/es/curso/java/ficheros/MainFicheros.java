package es.curso.java.ficheros;

import java.io.File;

public class MainFicheros {
	
	public void mostrarContenidoDirectorio(String directorio) {
    	File dir = new File(directorio);							//esto ya se considera un constructor
//    	File file1 = new File(directorio, "fichero1.txt");
//    	File file2 = new File(dir,"fichero1.txt");
    	
    	
        if(dir.isDirectory()) {
        	String[] ficheros = dir.list();							//dir.list = esta pasando la lista de Arrays de tipo String (en este caso)
        	for (String nombreFichero : ficheros) {
				System.out.println(nombreFichero + " ");
				String nuevoFichero = directorio+ "\\" +nombreFichero;
				File file = new File(nuevoFichero);
				
				
				
				if(file.isDirectory()) {
					System.out.println("Es un directorio");
				}else {
					//System.out.println("Es un fichero");
					if(file.getName().endsWith(".jpg")) {
//						System.out.println("Se puede leer"+ file.canRead());
//						System.out.println("Tamaño"+ file.length());
						System.out.println("Es un fichero jpg");
					} 
				}
					
			}
        }else {
        	System.err.println("No es un directorio");
        }
    }
	
	
	public void mostrarCarpetas(String directorio) {
		
		File arc1 = new File(directorio);
		String [] listaElementos = arc1.list();
		
		int contador = 0;
		for (String elemento : listaElementos) {
			if(elemento.endsWith(".jpg")) {
				contador++;
				System.out.println(elemento);
			}
//			System.out.println("Hay " + contador + " archivos jpg");
		}
		System.out.println("Hay " + contador + " archivos jpg");
		
		
		File arc2 = new File("");
		ArchivoServicio uno = new ArchivoServicio();
		ArchivoServicio dos = new ArchivoServicio();
		
		
		}
	
}
