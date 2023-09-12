package es.curso.java.ejercicio;

public class Dado {
	public static void main(String[] args) {

		
		int contador = 0;
		int tiradas = 0;
		
		do {
			int dado = (int)(Math.random()*6)+1;
			System.out.println(dado);
			
			
			
			if (dado==6) {
				contador++;
				continue;				
				}
			
			if (dado==6) {
				dado++;
				contador++;
				continue;				
				}else { contador=0;
				}
			
			
			if (contador == 3) {				
				System.out.println("El 6 ha salido " + contador + " veces");
				break;
				}
			}while(true);	
		
			
		

		
		
		}
		
	}

	
	
//tiramos un dado indeterminadas veces, cuando el numero que sale es:
//sale es el 6
//sale 3 veces el 6 --> cuantas tiradas se han necesitado


/*
 * partimos de un importe 1000$
 * indica cuanto quieres apostar, si el dinero
 * apostado > importe, nos dira "importe insuficiente"
 * Preguntamos por el numero a apostar (1-6)
 * 
 * tiramos el dado -> Si el nuemro es el valor apostado va amultiplicar *3 y se suma el valor que hemos apostado al reso del importe
 * 
 * Deseas seguir jugando?
 */