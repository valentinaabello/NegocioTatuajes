package tatuajes;

public class Inventario {
	
	String tinta; //color de tinta
	int aguja; //medida
	int guantes;
	int alcohol;
	Local local;
	
	public Inventario(String tinta, int aguja, int guantes, int alcohol, Local local) {
		this.tinta = tinta;
		this.aguja = aguja;
		this.guantes = guantes;
		this.alcohol = alcohol;
		this.local = local;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
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
