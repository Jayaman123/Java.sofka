import java.io.*;
public class ejercicio6ciclos {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String apellido = "";
		String contacto1 = "Javier";
		String contacto2= "Viviana";
		String contacto3= "Jose";
		int indice;
		String nombre;
		int op;
		int posicion;
		String telefono;
		String tel_1;
		String tel_2;
		String tel_3;
		tel_1 = "3143507209";
		tel_2 = "3233272961";
		tel_3 = "3203237984";
		do {
			op = 0;
			// Menu para la aplicacion
			System.out.println("==============================");
			System.out.println(" Seleccione para opcion");
			System.out.println(" 1. Ingresar contacto");
			System.out.println(" 2. Buscar contacto");
			System.out.println(" 3. Salir");
			op = Integer.parseInt(bufEntrada.readLine());
			switch (op) {
			case 1:
				for (posicion=0;posicion<=3;posicion++) {
					System.out.println(" Ingrese nombre de contacto");
					nombre = bufEntrada.readLine();
					System.out.println(" Ingrese apellido");
					apellido = bufEntrada.readLine();
					System.out.println(" Ingrese telefono de contacto");
					telefono = bufEntrada.readLine();
					if (telefono.equals(tel_1)) {
						System.out.println(" El telefono ya esta registrado, Cambie de numero");
					}
					if (telefono.equals(tel_2)) {
						System.out.println(" El telefono ya esta registrado, Cambie de numero");
						if (telefono.equals(tel_3)) {
							System.out.println(" El telefono ya esta registrado, Cambie de numero");
						}
					}
					if (posicion>=3) {
						System.out.println(""); // no hay forma directa de borrar la consola en Java
					}
				}
				break;
			case 2:
				contacto1 = "Javier";
				contacto2 = "Marilu";
				contacto3 = "Viviana";
				System.out.println(" Digite su contacto");
				nombre = bufEntrada.readLine();
				if (nombre.equals(contacto1)) {
					System.out.println(" Dato encontrado");
					System.out.println(" Contacto: "+contacto1);
					System.out.println(" Telefono: "+tel_1);
					System.out.println("1. SI");
					System.out.println("2. NO");
					System.out.println(" desea borrar el contacto");
					op = Integer.parseInt(bufEntrada.readLine());
					switch (op) {
					case 1:
						System.out.println("El usuario fue borrado");
						break;
					case 2:
						System.out.println(" Salir");
						break;
					}
				} else {
					if (nombre.equals(contacto2)) {
						System.out.println(" Dato encontrado");
						System.out.println(" Contacto: "+contacto2);
						System.out.println(" Telefono: "+tel_2);
						System.out.println("1. SI");
						System.out.println("2. NO");
						System.out.println(" desea borrar el contacto");
						op = Integer.parseInt(bufEntrada.readLine());
						switch (op) {
						case 1:
							System.out.println("El usuario fue borrado");
							break;
						case 2:
							System.out.println(" Salir");
							break;
						}
					} else {
						if (nombre.equals(contacto3)) {
							System.out.println(" Dato encontrado");
							System.out.println(" Contacto: "+contacto3);
							System.out.println(" Telefono: "+tel_3);
							System.out.println("1. SI");
							System.out.println("2. NO");
							System.out.println(" desea borrar el contacto");
							op = Integer.parseInt(bufEntrada.readLine());
							switch (op) {
							case 1:
								System.out.println("El usuario fue borrado");
								break;
							case 2:
								System.out.println(" Salir");
								break;
							}
						}
					}
				}
				break;
			}
		} while (op!=3);
	}


}



