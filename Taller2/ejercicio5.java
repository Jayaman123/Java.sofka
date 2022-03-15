import java.io.*;

public class ejercicio5 {

 	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int comprar;
		double costototal;
		double iva;
		int opcion;
		double precio1;
		double precio2;
		double precio3;
		precio1 = 1200;
		precio2 = 6000;
		precio3 = 3600;
		iva = 0.19;
		do {
			// lista de productos
			System.out.println("Lista de productos");
			System.out.println("1. Acetaminofen");
			System.out.println("2. Viagra");
			System.out.println("3. Ibuprofeno");
			System.out.println("por favor seleccione el producto que desea");
			opcion = Integer.parseInt(bufEntrada.readLine());
			// opcion para mirar caracteristicas
			switch (opcion) {
			case 1:
				System.out.println("Acetaminofen");
				System.out.println(" Unidades /producto : Caja de 12 und");
				System.out.println(" cant. 500 mg ");
				System.out.println(" Precio: Caja = 1200 COP  Unidad: 100 COP)");
				break;
			case 2:
				System.out.println("Viagra");
				System.out.println(" Unidades/ producto : Caja de 2 und");
				System.out.println(" cant. 250 mg ");
				System.out.println(" Precio: Caja = 6000 COP ");
				break;
			case 3:
				System.out.println("Ibuprofeno");
				System.out.println(" Unidades producto : Caja de 10 und");
				System.out.println(" cant. 800 mg ");
				System.out.println(" Precio: Caja = 3600 COP  Unidad: 360 COP)");
				break;
			}
			System.out.println(" Desea comprar el producto ?");
			System.out.println(" 1. si");
			System.out.println(" 2. No");
			comprar = Integer.parseInt(bufEntrada.readLine());
		} while (comprar!=1);
		if (comprar==1) {
			System.out.println(" Producto: "+opcion);
			if (opcion==1) {
				System.out.println("Acetaminofen");
				System.out.println(" Unidades /producto : Caja de 12 und");
				System.out.println(" cant. 500 mg ");
				System.out.println(" Precio: Caja = 1200 COP  Unidad: 100 COP)");
			}
			if (opcion==2) {
				System.out.println("Viagra");
				System.out.println(" Unidades/ producto : Caja de 2 und");
				System.out.println(" cant. 250 mg ");
				System.out.println(" Precio: Caja = 6000 COP ");
			}
			if (opcion==3) {
				System.out.println("Ibuprofeno");
				System.out.println(" Unidades producto : Caja de 10 und");
				System.out.println(" cant. 800 mg ");
				System.out.println(" Precio: Caja = 3600 COP  Unidad: 360 COP)");
			}
		}
		// facturación
		System.out.println(" ***Faturación a pagar***");
		if (opcion==1) {
			costototal = ((precio1*iva)+(precio1));
			System.out.println(" Costo directo : "+precio1);
			System.out.println(" Iva : "+iva);
			System.out.println(" costo Total: "+costototal+" "+"Pesos");
		}
		if (opcion==2) {
			costototal = ((precio2*iva)+(precio2));
			System.out.println(" Costo directo: "+precio2);
			System.out.println(" Iva: "+iva);
			System.out.println(" costo Total: "+costototal+" "+"Pesos");
		}
		if (opcion==3) {
			costototal = ((precio3*iva)+(precio3));
			System.out.println(" Costo directo: "+precio3);
			System.out.println(" Iva: "+iva);
			System.out.println(" costo Total: "+costototal+" "+"Pesos");
		}
		System.out.println(" ***Muchas gracias por sus compra***");
		System.out.println(" ***Vuelva pronto***");
	}


}

    

