package dam;

public class Galletas {

	private int pedidas = 0;
	private int almacen = 0;
	private int horno = 0;
	private int recienHechas = 0;
	private Caja caja1 = new Caja();
	
	public Galletas() {
		this.pedidas = 0;
		this.almacen = 500;
		this.horno = 0;
		this.recienHechas = 10;
	}
	
	public Galletas(int pedidas, int almacen, int horno, int recienHechas) {
		
		this.pedidas = pedidas;
		this.almacen = almacen;
		this.horno = horno;
		this.recienHechas = recienHechas;
		
	}
	
	public int getPedidas() {
		return pedidas;
	}

	public void setPedidas(int pedidas) {
		this.pedidas = pedidas;
	}

	public int getAlmacen() {
		return almacen;
	}

	public void setAlmacen(int almacen) {
		this.almacen = almacen;
	}

	public int getHorno() {
		return horno;
	}

	public void setHorno(int horno) {
		this.horno = horno;
	}

	public int getRecienHechas() {
		return recienHechas;
	}

	public void setRecienHechas(int recienHechas) {
		this.recienHechas = recienHechas;
	}

	@Override
	public String toString() {
		return String.format("En el almacen hay %d galletas, %d están en el horno y para servir hay %d. Se han pedido %d ", almacen, horno, recienHechas, pedidas);
	}
	
	public void meterHorno(int cantidad) {
		if(this.almacen>=cantidad) {
			this.almacen -= cantidad;
			this.horno += cantidad;
		}else {
			System.out.println("No hay suficientes gallletas en el inventario, debes pedir");
		}
	
	}
	
	public void sacarHorno() {
		if(this.horno>0) {
			this.recienHechas += this.horno;
			this.horno = 0;
		}else {
			System.out.println("No quedan galletas en el horno");
		}
		
	}
	
	public void pedir(int cantidad) {
		this.pedidas += cantidad;
	}
	
	public void recogerPedido(){
		this.almacen += this.pedidas;
		this.pedidas=0;
	}
	
	public double venderGalleta(int cantidad){
		if(this.recienHechas>=cantidad) {
			this.recienHechas -=cantidad;
			
		}else {
			System.out.printf("\nSolo me quedan %d\n",this.recienHechas);
			cantidad = this.recienHechas;
			this.recienHechas=0;
			
		}
		return cantidad;
	}
	
	
	
	
	
	
}
