
import java.io.*;
public class ejercicio5ciclos {
   
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String nombre;
		int opcion;
		// Mejercicio 5 de ciclos
		nombre = " ";
		opcion = 0;
		do {
			System.out.println(" ****Menu****");
			System.out.println(" 1. capture nombre");
			System.out.println(" 2. Saludar persona");
			System.out.println(" 3. Salir del sistema");
			System.out.println(" Porfavor digite la opcion");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println(""); 
				System.out.println(" Por favor digite su nombre completo");
				nombre = bufEntrada.readLine();
				System.out.println(" Guardado exitoso");
				break;
			case 2:
				System.out.println(" Bienvenido a este su software");
				System.out.println(" Digite su nombre: ");
				nombre = bufEntrada.readLine();
				System.out.println(" Hola "+nombre);
				break;
			case 3:
				System.out.println(""); 
				System.out.println(" hasta luego , gracias por visitarnos");
				break;
			}
			if (opcion>3) {
				System.out.println(" opcion equivocada");
			}
		} while (opcion!=3);
	}


}
