
import java.io.*;
public class ejercicio6 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String ano;
		String contrasena;
		String manmecanico;
		String modelo;
		String nombre;
		int opcion;
		String placa;
		double precio1;
		String repuestos;
		String usuario;
		// punto 6 taller de motos
		System.out.println(" Taller de Motos El Maquinista");
		nombre = " ";
		placa = " ";
		modelo = " ";
		ano = " ";
		usuario = " ";
		contrasena = " ";
		precio1 = 0;
		manmecanico = " ";
		// se podria realizar un inventario con listas para con condicionales ir generando un inventario automatizado, pero se sale del dejerciocio
		// Ingreso de usuario del taller
		System.out.println(" Digite su usuario");
		usuario = bufEntrada.readLine();
		System.out.println(" Digite su contrasena");
		contrasena = bufEntrada.readLine();
		if (contrasena.equals("Maquinista")) {
			System.out.println(" Bienvenido"+usuario);
		} else {
			System.out.println("usuario y/o contraseña invalidos");
		}
		if (contrasena.equals("Maquinista")) {
			System.out.println(" Nombre completo del cliente");
			nombre = bufEntrada.readLine();
			System.out.println(" Digite la placa del vehiculo");
			placa = bufEntrada.readLine();
			System.out.println(" año del vehiculo");
			ano = bufEntrada.readLine();
			System.out.println(" modelo");
			System.out.println(" fecha de ingreso");
			System.out.println(" Condiciones generales del daño");
			// Mecanicos de taller
			System.out.println(" Asignar mecanico");
			System.out.println("1.Juan Gonzalez ");
			System.out.println("2. Carlos Mira");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println(" Mecanico asignado Juan Gonzalez");
				break;
			case 2:
				System.out.println(" Mecanico asignado Carlos Mira");
				break;
			}
			if (opcion>=3) {
				System.out.println(" la opcion marcada no existe");
			}
			// Usuario selecciona las actividades de mantenimiento
			System.out.println("Tipo de mantenimiento realizado");
			System.out.println("1. Mecanico");
			System.out.println("2. electrico");
			System.out.println("3. latoneria y pintura");
			System.out.println(" Digite el numero de actividad a realizar");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("******** Mantenimiento realizado******");
				System.out.println("Fecha de salida :");
                    System.out.println("  Describa el Mantenimiento mecanico: ");
				manmecanico = bufEntrada.readLine();
				System.out.println(" Repuestos cambiados: ");
				repuestos = bufEntrada.readLine();
				System.out.println(" escribir valor a cancelar por el cliente");
				precio1 = Double.parseDouble(bufEntrada.readLine());
				// Reporte para imprimir al cliente
				System.out.println(" *******Reporte********");
				System.out.println("Propietario: "+nombre);
				System.out.println("Placa: "+placa);
				System.out.println("Año: "+ano);
				System.out.println("Modelo de motocicleta:"+modelo);
				System.out.println(" Descripcion del Mantenimiento realizado: "+manmecanico);
				System.out.println(" Repuestos cambiados: "+repuestos);
				System.out.println(" Su valor a pagar en caja  es de: "+precio1);
				break;
			case 2:
				// Datos de Mantenimiento realizado
				System.out.println("******** Mantenimiento realizado******");
				System.out.println("Fecha de salida :");
                    System.out.println(" Descreiba el mantenimiento electrico");
                    System.out.println(" Repuestos cambiados: ");
				repuestos = bufEntrada.readLine();
				System.out.println(" escribir valor a cancelar por el cliente");
				precio1 = Double.parseDouble(bufEntrada.readLine());
				// Reporte para imprimir al cliente
				System.out.println(" *******Reporte********");
				System.out.println("Propietario: "+nombre);
				System.out.println("Placa: "+placa);
				System.out.println("Año: "+ano);
				System.out.println("Modelo de motocicleta:"+modelo);
				System.out.println(" Descripcion del Mantenimiento realizado: "+manmecanico);
				System.out.println(" Repuestos cambiados: "+repuestos);
				System.out.println(" Su valor a pagar en caja es de: "+precio1);
				break;
			case 3:
				// Datos de Mantenimiento realizado
				System.out.println("******** Mantenimiento realizado******");
				System.out.println("Fecha de salida :");
                    System.out.println(" Describa el Mantenimiento latoneria y pintura");
                    System.out.println(" Repuestos cambiados: ");
				repuestos = bufEntrada.readLine();
				System.out.println(" escribir valor a cancelar por el cliente");
				precio1 = Double.parseDouble(bufEntrada.readLine());
				// Reporte para imprimir al cliente
				System.out.println(" *******Reporte********");
				System.out.println("Propietario: "+nombre);
				System.out.println("Placa: "+placa);
				System.out.println("Año: "+ano);
				System.out.println("Modelo de motocicleta:"+modelo);
				System.out.println(" Descripcion del Mantenimiento realizado: "+manmecanico);
				System.out.println(" Repuestos cambiados: "+repuestos);
				System.out.println(" Su valor a pagar en caja es de: "+precio1);
				break;
			}
		}
		System.out.println(" Vuela pronto su taller EL MAQUINISTA");
    }
}




    
