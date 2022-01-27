package tatuajes;

public class Insumo {
	
	String tinta; //color de tinta
	int aguja; //medida
	int guantes;
	int alcohol; //cc
	Cliente cliente;
	
	public Insumo(String tinta, int aguja, int guantes, int alcohol, Cliente cliente) {
		this.tinta = tinta;
		this.aguja = aguja;
		this.guantes = guantes;
		this.alcohol = alcohol;
		this.cliente = cliente;		
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getTinta() {
		return tinta;
	}

	public void setTinta(String tinta) {
		this.tinta = tinta;
	}

	public int getAguja() {
		return aguja;
	}

	public void setAguja(int aguja) {
		this.aguja = aguja;
	}

	public int getGuantes() {
		return guantes;
	}

	public void setGuantes(int guantes) {
		this.guantes = guantes;
	}

	public int getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(int alcohol) {
		this.alcohol = alcohol;
	}
	
	
	
}
