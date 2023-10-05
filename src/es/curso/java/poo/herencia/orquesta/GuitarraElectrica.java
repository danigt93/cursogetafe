package es.curso.java.poo.herencia.orquesta;

public class GuitarraElectrica extends Guitarra {
	
	double potencia;
	
	
	public GuitarraElectrica(String nombre, String tipo, int numCuerdas, double potencia) {
		super(nombre, "cuerda", numCuerdas);
		this.potencia = potencia;
	}


	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	@Override
	public void tocar(){
		super.tocar();
		System.out.println("Esta tocando muy alto!!!");
	}


	@Override
	public String toString() {
		return "GuitarraElectrica [potencia=" + potencia + "]";
	}
}
