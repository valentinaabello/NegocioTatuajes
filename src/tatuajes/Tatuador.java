package tatuajes;

public class Tatuador {
	
	String nombre;
	int rut;
	
	public Tatuador(String nombre, int rut) {
		this.nombre = nombre;
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

}
