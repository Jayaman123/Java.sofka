import java.io.*;
public class ejercicio8ciclos {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String est_1;
		String est_2;
		String est_3;
		String fecha_ingreso;
		String fecha_nacimiento;
		int i;
		int inscripcion;
		String nombre;
		double nota_1;
		double nota_2;
		double nota_3;
		int op;
		// ejercicio 8 ciclos
		est_1 = "Camilo";
		est_2 = "Juan";
		est_3 = "Ricardo";
		nota_1 = 3.1;
		nota_2 = 5.8;
		nota_3 = 2.4;
		i = 0;
		// registrar estudiantes
		do {
			System.out.println(" Registrese en el curso: ");
			System.out.println("1. Curso de manejo de automovil");
			System.out.println("2. Curso de manejo de Camion");
			System.out.println("3. Consultar aprobados");
			System.out.println("4. Salir");
			op = Integer.parseInt(bufEntrada.readLine());
			switch (op) {
			case 1:
				System.out.println("precios: 2300 "+" tiempo: 2 semanas");
				System.out.println(" desea registrarse en el curso");
				System.out.println(" 1. SI");
				System.out.println(" 2. NO");
				inscripcion = Integer.parseInt(bufEntrada.readLine());
				if (inscripcion==1) {
					while (i<=7) {
						System.out.println(" =======================================");
						System.out.println(" Curso de manejo de Automovil");
						System.out.println(" Digite nombre competo de la persona");
						nombre = bufEntrada.readLine();
						System.out.println(" Fecha de nacimiento");
						fecha_nacimiento = bufEntrada.readLine();
						System.out.println(" fecha de ingreso:");
						fecha_ingreso = bufEntrada.readLine();
						System.out.println(" Ud ha sido registrado con exito");
						i = i+1;
					}
				} else {
					System.out.println("Gracias por visitarnos");
				}
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				break;
			case 2:
				System.out.println(" desea registrarse en el curso");
				System.out.println(" 1. SI");
				System.out.println(" 2. NO");
				inscripcion = Integer.parseInt(bufEntrada.readLine());
				if (inscripcion==1) {
					while (i<=7) {
						System.out.println(" =======================================");
						System.out.println(" Curso de manejo de Camion");
						System.out.println(" Digite nombre competo de la persona");
						nombre = bufEntrada.readLine();
						System.out.println(" Fecha de nacimiento");
						fecha_nacimiento = bufEntrada.readLine();
						System.out.println(" fecha de ingreso:");
						fecha_ingreso = bufEntrada.readLine();
						System.out.println(" Ud ha sido registrado con exito");
						i = i+1;
					}
				} else {
					System.out.println("Gracias por visitarnos");
				}
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				break;
			case 3:
				System.out.println(" Digite el nombre del estudiante");
				nombre = bufEntrada.readLine();
				if (nombre.equals(est_1)) {
					System.out.println(" Nota: "+nota_1);
					if (nota_1>=3.0) {
						System.out.println(" Aprobado");
					} else {
						System.out.println(" Reprobado");
					}
				} else {
					if (nombre.equals(est_2)) {
						System.out.println(" Nota: "+nota_2);
						if (nota_1>=3.0) {
							System.out.println(" Aprobado");
						} else {
							System.out.println(" Reprobado");
						}
					} else {
						if (nombre.equals(est_3)) {
							System.out.println(" Nota: "+nota_3);
							if (nota_3>=3.0) {
								System.out.println(" Aprobado");
							} else {
								System.out.println(" Reprobado");
							}
						}
					}
				}
				break;
			}
			if (op>=5) {
				System.out.println(" Esta opcion no existe");
			}
		} while (op!=4);
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("Gracias por visitarnos");
	}


    
}

