package dam;

public class Caja {

	private double total = 0;
	private double corto = 1.2;
	private double largo = 2;
	private double galleta = 2;
	private double recaudado = 0;
	
	public Caja() {
	
	}

	public double getTotal() {
		this.recaudado+=this.total;
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getCorto() {
		return corto;
	}

	public void setCorto(double corto) {
		this.corto = corto;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getGalleta() {
		return galleta;
	}

	public void setGalleta(double galleta) {
		this.galleta = galleta;
	}

	public double getRecaudado() {
		return recaudado;
	}

	public void setRecaudado(double recaudado) {
		this.recaudado = recaudado;
	} 
	
	public void nuevoCliente() {
		this.total=0;
		
	}
	
	public double cobrar(double cantcorto, double cantlargo, double cantgalleta) {
		this.total+= cantcorto*this.corto + cantlargo*this.largo + cantgalleta*this.galleta;
		return this.total;
	}
	
	
	
}
