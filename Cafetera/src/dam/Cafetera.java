package dam;

public class Cafetera {
	
	private double capacidadMax = 0;
	private double nivelActual = 0;
	
	Caja caja1 = new Caja ();
	
	public Cafetera() {
		this.capacidadMax = 1000;
		this.nivelActual = 0;
		
	}
	
	public Cafetera(double capacidadMax, double nivelActual) {
		this.capacidadMax = capacidadMax;
		this.nivelActual = nivelActual;
	}

	public double getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(double capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public double getNivelActual() {
		return nivelActual;
	}

	public void setNivelActual(double nivelActual) {
		this.nivelActual = nivelActual;
	}
	
	public double llenar() {
		double falta  = this.capacidadMax - this.nivelActual; 
		this.nivelActual = this.capacidadMax;
		return falta;
	}
	
	public double agregarCafe(double cantidad) {
		
		if(this.nivelActual+cantidad>this.capacidadMax) {
			this.nivelActual = this.capacidadMax;
		}else {
			this.nivelActual += cantidad;
		}
		
		return this.nivelActual;
	}

	public void vaciar() {
		this.nivelActual = 0;
		
	}
	
	public double servirTaza(double capacidad) {
		
		if(capacidad > this.nivelActual) {
			System.out.printf("Solo quedaba en la máquina %.2f",this.nivelActual);
			this.nivelActual = 0;
			
		}else {
			 this.nivelActual -= capacidad;
		}
		return this.nivelActual;
				
	}
	
	public double servirCorto() {
		caja1.cobrar(1, 0, 0);
		return this.servirTaza(0.05);
	}
	
	public double servirLargo() {
		caja1.cobrar(1, 0, 0);
		return this.servirTaza(0.125);
			
		
	}

	@Override
	public String toString() {
		return String.format("La cafetera tiene una capacidad de %.2fL y ahora mismo tiene %.2fL", capacidadMax, nivelActual);
	}
	
	
	

}
