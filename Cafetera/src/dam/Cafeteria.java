package dam;

import java.util.Scanner;

public class Cafeteria {
 
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Hola! Vamos a poner en marcha la cafetería!");		
		System.out.println();
		int almacen= 0, horno = 0, recien = 0, pedidas=0;
		int capMax = 2; int nivAct=1;
		/*System.out.println("¿De qué capacidad es su cafetera? ");
		double capMax = Double.parseDouble(teclado.nextLine());
		
		System.out.println("¿Cuánto la ha llenado?");
		double nivAct = Double.parseDouble(teclado.nextLine());
		
		System.out.println("¿Tienes galletas preparadas?");
		char ans = teclado.nextLine().trim().toLowerCase().charAt(0);
		
		if(ans=='s') {
			System.out.println("¿Cuántas están en el almacén?");
			almacen = Integer.parseInt(teclado.nextLine());
			System.out.println("¿Cuántas en el horno?");
			horno = Integer.parseInt(teclado.nextLine());
			System.out.println("¿Cuántas recién hechas?");
			recien = Integer.parseInt(teclado.nextLine());
			System.out.println("¿Cuántas deseas pedir para el inventario?");
			pedidas = Integer.parseInt(teclado.nextLine());
		}*/
		
		System.out.println("------------------------------------");
		
		Galletas g1 = new Galletas(pedidas, almacen, horno, recien);
		
		Cafetera c1 = new Cafetera (capMax,nivAct);
		
		Caja caja1 = new Caja();
		
		char resp = '0';
		
		do {
		System.out.println();
		System.out.println("¿Qué desea hacer?");
		System.out.println("-------------------");	
		System.out.println("1.- Servir largo");
		System.out.println("2.- Servir corto");
		System.out.println("3.- Servir galleta");
		System.out.println("C.- Cobrar");
		System.out.println("D.- Nuevo cliente");
		System.out.println("S.- SALIR");
		System.out.println();
		System.out.println("Operaciones de servicio");
		System.out.println("-------------------------");
		System.out.println("4.- Ver estado de la cafetera");
		System.out.println("5.- Llenar");
		System.out.println("6.- Agregar cafe");
		System.out.println("7.- Vaciar cafetera");
		System.out.println("8.- Ver estado de las galletas");
		System.out.println("9.- Meter galletas al horno");
		System.out.println("A.- Sacar galletas del horno");
		System.out.println("B.- Pedir galletas");
		System.out.println("E.- Recoger pedido");
		System.out.println("F.- Consultar estado de la caja");
		System.out.println();
		
		
		resp= teclado.nextLine().trim().toLowerCase().charAt(0);
		switch(resp) {
		
			case '1':
				System.out.printf("\n Queda en la máquina %.2f", c1.servirLargo());
				System.out.println();
				caja1.cobrar(0, 1, 0);
				break;
				
				
			case '2':
				System.out.printf("\n Queda en la máquina %.2f", c1.servirCorto());
				System.out.println();
				caja1.cobrar(1,0,0);
				break;
				
			case '3':
				System.out.println("¿Cuántas galletas desea?");
				int cantgalleta = Integer.parseInt(teclado.nextLine()); 
				caja1.cobrar(0, 0, g1.venderGalleta(cantgalleta));
				break;
				
			case '4':
				System.out.println(c1);
				System.out.println();
				break;
			
			case '5':
				c1.llenar();
				System.out.println(c1);
				System.out.println();
				break;
				
			case '6':
				System.out.println("¿Cúanto desea añadir a la cafetera?");
				double cant = Double.parseDouble(teclado.nextLine());
				System.out.printf("\n> En este momento la cafetera lleva %.2fL\n",c1.agregarCafe(cant));
				
				if(c1.getNivelActual()==c1.getCapacidadMax()) {
					System.out.println("Su cafetera está llena");
				}
				System.out.println();
				break;
				
			case '7':
				c1.vaciar();
				System.out.println(c1);
				System.out.println();
				break;
				
			case '8':
				System.out.println(g1);
				System.out.println();
				break;
				
			case '9':
				System.out.println("¿Cuántas galletas quieres meter al horno?");
				int cantidad = Integer.parseInt(teclado.nextLine());
				g1.meterHorno(cantidad);
				break;
				
			case 'a':
				g1.sacarHorno();
				break;
				
			case 'b':
				System.out.println("¿Cuántas galletas deseas pedir?");
				cantidad= Integer.parseInt(teclado.nextLine());
				g1.pedir(cantidad);
				break;
				
			case 'c':
				System.out.printf("\nSerán %.2f\n", caja1.getTotal());
				System.out.println();
				break;
				
			case 'd':
				System.out.println("Siguiente cliente");
				caja1.nuevoCliente();
				System.out.println("------------------");
				break;
				
			case 'e':
				g1.recogerPedido();
				break;
				
			case 'f':
				System.out.printf("\nSe ha recaudado %.2f\n",caja1.getRecaudado());
				System.out.println("");
				break;
		
		}
		}while(resp!='s');

	}

}
