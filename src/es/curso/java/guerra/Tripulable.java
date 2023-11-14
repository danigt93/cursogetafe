package es.curso.java.guerra;

public interface Tripulable {
	
	int PUNTOS_VIDA = 1000;
	
	/**
	 * Método para generar los puntos de ataque de manera aleatoria
	 * @return puntos de ataque generados
	 */
	double atacar();
	
	/**
	 * Método que devuelve la diferencia entre el ataque recibido y la defensa generada de manera aleatoria
	 * Si la diferencia es negativa el resultado será 0
	 * @param ataque valor de ataque generado por el atacante 
	 * @return diferencia entre ataque y defensa
	 */
	double defender(double ataqueEnemigo);
	
}
