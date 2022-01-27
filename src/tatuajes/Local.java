package tatuajes;

public class Local {
	
	String direccion;
	String comuna;
	String region;
	int telefono;
	Tatuador tatuador;
	int valorArriendo;
	
	public Local(String direccion, String comuna, String region, int telefono, Tatuador tatuador, int valorArriendo) {
		this.direccion = direccion;
		this.comuna = comuna;
		this.region = region;
		this.telefono = telefono;
		this.tatuador = tatuador;
		this.valorArriendo = valorArriendo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Tatuador getTatuador() {
		return tatuador;
	}

	public void setTatuador(Tatuador tatuador) {
		this.tatuador = tatuador;
	}

	public int getValorArriendo() {
		return valorArriendo;
	}

	public void setValorArriendo(int valorArriendo) {
		this.valorArriendo = valorArriendo;
	}
	
	

}
