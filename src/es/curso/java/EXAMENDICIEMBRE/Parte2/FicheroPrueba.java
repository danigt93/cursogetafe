package es.curso.java.EXAMENDICIEMBRE.Parte2;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.HashMap;
	import java.util.Map;

	public class FicheroPrueba {
	    public static void main(String[] args) {
	    
	        String rutaArchivo = "C:\\\\Users\\\\Tardes\\\\git\\\\ProyectoDani\\\\FICHEROSTXT\\\\FicheroEjercicio2.txt"; 
	        
	        Map<Integer, String> lineasConJava = new HashMap<>();

	        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
	            String linea;
	            int numeroLinea = 0;

	            while ((linea = br.readLine()) != null) {
	                numeroLinea++;

	                // Vamos a verificar si contiene la palabra "java"
	                if (linea.toLowerCase().contains("java")) {
	                    lineasConJava.put(numeroLinea, linea);
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Mostrar el número de línea donde aparece la palabra "java"
	        System.out.println("Número de línea donde aparece la palabra 'java':");
	        for (Map.Entry<Integer, String> entry : lineasConJava.entrySet()) {
	            System.out.println(entry.getKey());
	        }

	        // Mostrar la suma de la clave con el total de caracteres en el valor
	        System.out.println("\nSuma de la clave con el total de caracteres en el valor:");
	        for (Map.Entry<Integer, String> entry : lineasConJava.entrySet()) {
	            int suma = entry.getKey() + entry.getValue().length();
	            System.out.println("Para la línea " + entry.getKey() + ", la suma solicitada es " + suma + ".");
	        }
	    }
	}


