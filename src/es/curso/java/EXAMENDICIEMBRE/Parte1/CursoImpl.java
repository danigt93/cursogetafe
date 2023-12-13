package es.curso.java.EXAMENDICIEMBRE.Parte1;

	public class CursoImpl implements Curso {
	    private String nombre;
	    private int codigo;
	    private int cupo;

	    public CursoImpl(String nombre, int codigo, int cupo) {
	        this.nombre = nombre;
	        this.codigo = codigo;
	        this.cupo = cupo;
	    }

	    public String obtenerNombre() {
	        return nombre;
	    }

	    public int obtenerCodigo() {
	        return codigo;
	    }

	    public int obtenerCupo() {
	        return cupo;
	    }
	}

