package es.curso.java.EXAMENDICIEMBRE.Parte1;

import java.util.HashMap;
import java.util.Map;

public class Master extends CursoImpl {
		
	    private boolean oficial;

	    public Master(String nombre, int codigo, int cupo, boolean oficial) {
	        super(nombre, codigo, cupo);
	        this.oficial = oficial;
	    }

	    public boolean esOficial() {
	        return oficial;
	    }
	    
	    public static void main(String[] args) {
	    	
	    	//Creación de los 3 masters
	    	Master master1 = new Master("Master en Ciencias de Datos", 101, 25, true);
	        Master master2 = new Master("Master en Inteligencia Artificial", 102, 20, true);
	        Master master3 = new Master("Master en Desarrollo Web", 103, 30, false);

	        Map<Integer, Master> mapaMasters = new HashMap<>();

	        mapaMasters.put(master1.obtenerCodigo(), master1);
	        mapaMasters.put(master2.obtenerCodigo(), master2);
	        mapaMasters.put(master3.obtenerCodigo(), master3);

	            
	        for (Map.Entry<Integer, Master> entry : mapaMasters.entrySet()) {
	        	
	        	int codigo = entry.getKey();
	        	Master master = entry.getValue();

	        	System.out.println("Código del curso: " + codigo);
	        	System.out.println("Nombre del curso: " + master.obtenerNombre());
	        	System.out.println("Cupo disponible: " + master.obtenerCupo());
	        	System.out.println("Es oficial: " + master.esOficial());
	        	System.out.println();
	        	
	        }

	        System.out.println("====================================PARA ELIMINAR=======================================================");
	        
	        //Para eliminar
	                imprimirInformacion(mapaMasters);

	                int codigoEliminar = 102;
	                mapaMasters.remove(codigoEliminar);

	                System.out.println("Después de eliminar el curso con código " + codigoEliminar + " quedarían:");
	                imprimirInformacion(mapaMasters);
	                
	                
	            }

	            // Método para imprimir la información de los Masters dentro del mapa
	            private static void imprimirInformacion(Map<Integer, Master> mapaMasters) {
	                for (Map.Entry<Integer, Master> entry : mapaMasters.entrySet()) {
	                    int codigo = entry.getKey();
	                    Master master = entry.getValue();
	                    System.out.println("Código del curso: " + codigo);
	                    System.out.println("Nombre del curso: " + master.obtenerNombre());
	                    System.out.println("Cupo disponible: " + master.obtenerCupo());
	                    System.out.println("Es oficial: " + master.esOficial());
	                    System.out.println();  
	                    
	                }
	            }
	            
	            
	            private static void imprimirListadeMasterDispo(Map<Integer, Master> mapaMasters) {
	            	 System.out.println("====================================MOSTRAMOS TODOS LOS MASTER DISPONIBLES====================================================");
	            	
	                for (Map.Entry<Integer, Master> entry : mapaMasters.entrySet()) {
	                    int codigo = entry.getKey();
	                    Master master = entry.getValue();
	                    if(master.esOficial()==true) {
	                    System.out.println("Código del curso: " + codigo);
	                    System.out.println("Nombre del curso: " + master.obtenerNombre());
	                    System.out.println("Cupo disponible: " + master.obtenerCupo());
	                    System.out.println("Es oficial: " + master.esOficial());
	                    System.out.println();
	                    }
	            }
	            
	            
}}
