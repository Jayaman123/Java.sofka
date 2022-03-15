import java.io.*;
public class ejercicio1vectores {
 
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int i;
		int num[];
		num = new int[5];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		for (i=0;i<=4;i++) {
			System.out.println(" Numero entero");
			num[i] = Integer.parseInt(bufEntrada.readLine());
		}
		System.out.println(" Presione una tecla para ver el vector");
		System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		for (i=0;i<=4;i++) {
			System.out.println("num"+" ["+i+"]"+" = "+num[i]);
		}
	}


}


    

