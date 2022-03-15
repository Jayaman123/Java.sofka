import java.io.*;
public class ejercicio7ciclos {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int i;
		String mar1;
		String mar2;
		String mar3;
		String marca;
		String nom;
		int opcion;
		String placa;
		String tel;
		String v1;
		String v2;
		String v3;
		// Ejercicio 7 taller 3 ciclos
		i = 0;
		v1 = "XDF-035";
		v2 = "FGH-036";
		v3 = "JHT-345";
		mar1 = "Chery";
		mar2 = "Chevrolet";
		mar3 = "Honda";
		// Opciones 
		System.out.println("1. Ingreso");
		System.out.println("2. Salida");
		System.out.println("3. consulta");
		System.out.println("4. Salir del sistema");
		// ingreso 
		System.out.println(" Digite una opcion");
		opcion = Integer.parseInt(bufEntrada.readLine());
		switch (opcion) {
		case 1:
			while (i<=4) {
				System.out.println("Digite la marca del vehiculo");
				marca = bufEntrada.readLine();
				System.out.println(" Digite placa");
				placa = bufEntrada.readLine();
				System.out.println(" Digite nombre propietario");
				nom = bufEntrada.readLine();
				System.out.println(" Telefono: ");
				tel = bufEntrada.readLine();
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				System.out.println("======================================");
				System.out.println(" Datos del ultimo vehiculo ingresado");
				System.out.println("marca:     Placa:    Nombre:,  Tel:");
				System.out.println(marca+"     "+placa+"      "+nom+"    "+tel);
				i = i+1;
			}
			break;
		case 2:
			while (i<=4) {
				System.out.println(" Digite placa");
				placa = bufEntrada.readLine();
				if (placa.equals(v1)) {
					System.out.println("Placa: "+v1+" MARCA: "+mar1);
				} else {
					if (placa.equals(v2)) {
						System.out.println(v2+mar2);
					} else {
						if (placa.equals(v3)) {
							System.out.println(v3+mar3);
						} else {
							System.out.println(" El vehiculo no esta en el parqueadero");
						}
					}
				}
			}
			break;
		case 3:
			while (i<=4) {
				System.out.println(" Digite placa");
				placa = bufEntrada.readLine();
				if (placa.equals(v1)) {
					System.out.println("Placa: "+v1+" MARCA: "+mar1);
					System.out.println(" vehiculo se encuentra en el parqueadero");
				} else {
					if (placa.equals(v2)) {
						System.out.println(v2+mar2);
						System.out.println(" vehiculo se encuentra en el parqueadero");
					} else {
						if (placa.equals(v3)) {
							System.out.println(v3+mar3);
							System.out.println(" vehiculo se encuentra en el parqueadero");
						} else {
							System.out.println(" El vehiculo no esta en el parqueadero");
						}
					}
				}
			}
			break;
		case 4:
			if (opcion==4) {
				System.out.println(" Hasta luego ");
			}
			break;
		}
		if (opcion>=5) {
			System.out.println(" No existe");
		}
	}


}
