package tatuajes;

public class Venta {
	
	int tama�o;
	int precio; //precio tatuaje
	int costo;
	int ganancia;
//	int tatuaje; // valor del tatuaje
	int tiempo; //horas
	Local local; //
	Cliente cliente; //
	
	public Venta(int tama�o, int precio, int costo, int ganancia, int tiempo, Local local, Cliente cliente) {
		this.tama�o = tama�o;
		this.precio = precio;
		this.costo = costo;
		this.ganancia = ganancia;
	//	this.tatuaje = tatuaje;
		this.tiempo = tiempo;
		this.local = local;
		this.cliente = cliente;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getGanancia() {
		return ganancia;
	}

	public void setGanancia(int ganancia) {
		this.ganancia = ganancia;
	}

	/*
	public int getTatuaje() {
		return tatuaje;
	}

	public void setTatuaje(int tatuaje) {
		this.tatuaje = tatuaje;
	} */

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	

}
