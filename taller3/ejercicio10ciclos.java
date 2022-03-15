import java.io.*;
public class ejercicio10ciclos {


	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		boolean clave;
		String cuenta_1;
		String cuenta_2;
		String cuenta_3;
		double ingreso;
		double nuevo_saldo;
		int opcion;
		int password;
		int pass_1;
		int pass_2;
		int pass_3;
		double retiro;
		double saldo_1;
		String usuariogeneral;
		String usuario_1;
		String usuario_2;
		String usuario_3;
		double valor_1;
		double valor_2;
		double valor_3;
		// ejercicio 10 su Banco Fiel
		// Base de datos de cuentas 
		// Espacio en variables 
		usuario_1 = "Marta";
		usuario_2 = "Javier123";
		usuario_3 = "Camilo123";
		pass_1 = 1234;
		pass_2 = 5678;
		pass_3 = 4567;
		valor_1 = 5000000;
		valor_2 = 4000000;
		valor_3 = 1850000;
		clave = false;
		cuenta_1 = "456 789 369 ";
		cuenta_2 = " 789 456 123";
		cuenta_3 = " 123 456 789";
		saldo_1 = 0;
		ingreso = 0;
		System.out.println(" ***** BIENVENIDO A SU BANCO AMIGO *****");
		// ingreso del usuario a su Cuenta
		System.out.println(" Por Favor ingrese su usuario");
		usuariogeneral = bufEntrada.readLine();
		if (usuariogeneral.equals(usuario_1)) {
			System.out.println(" clave personal");
			password = Integer.parseInt(bufEntrada.readLine());
			if (password==pass_1) {
				System.out.println(" Bienvenido a su cuenta: "+usuario_1+" "+cuenta_1);
				saldo_1 = valor_1;
				System.out.println(" Saldo: "+saldo_1+" PESOS");
			}
		}
		if (usuariogeneral.equals(usuario_2)) {
			System.out.println(" clave personal");
			password = Integer.parseInt(bufEntrada.readLine());
			if (password==pass_2) {
				System.out.println(" Bienvenido a su cuenta: "+usuario_2+" "+cuenta_2);
				saldo_1 = valor_2;
				System.out.println(" Saldo: "+saldo_1+" PESOS");
			}
		}
		if (usuariogeneral.equals(usuario_3)) {
			System.out.println(" clave personal");
			password = Integer.parseInt(bufEntrada.readLine());
			if (password==pass_3) {
				System.out.println(" Bienvenido a su cuenta: "+usuario_3+" "+cuenta_3);
				saldo_1 = valor_3;
				System.out.println(" Saldo: "+saldo_1+" PESOS");
			}
		}
		// Opciones de Banca
		System.out.println(" Seleccione su accion a realizar: ");
		System.out.println(" 1. Retiros");
		System.out.println(" 2. Ingresos");
		System.out.println(" 3. Consultas");
		System.out.println(" Marque su eleccion: ");
		opcion = Integer.parseInt(bufEntrada.readLine());
		switch (opcion) {
		case 1:
			System.out.println(" Ingrese por favor el saldo a retirar");
			retiro = Double.parseDouble(bufEntrada.readLine());
			if (retiro<saldo_1) {
				System.out.println(" Recoja su dinero ");
				saldo_1 = valor_1;
				nuevo_saldo = (saldo_1-retiro);
				System.out.println(" Nuevo saldo. "+nuevo_saldo);
				System.out.println(" Gracias por usar nuestros servicios");
			} else {
				System.out.println(" Fondos inusficientes"+" Gracias por usar nuestros servicios");
			}
			break;
		case 2:
			System.out.println(" Ingrese su saldo a ingresar:");
			ingreso = Double.parseDouble(bufEntrada.readLine());
			if (ingreso>0) {
				System.out.println(" este es el valor a consignar: "+ingreso);
				System.out.println(" desea continuar: ");
				System.out.println(" 1. SI");
				System.out.println(" 2. NO");
				opcion = Integer.parseInt(bufEntrada.readLine());
				switch (opcion) {
				case 1:
					System.out.println(" Accion exitosa");
					nuevo_saldo = (saldo_1+ingreso);
					System.out.println(" Nuevo saldo: "+nuevo_saldo);
					break;
				case 2:
					System.out.println(" Gracias por usar nuestros servicios");
					break;
				default:
					System.out.println(" la opcion marcada no existe");
				}
			} else {
				System.out.println(" Introduzca un saldo positivo");
			}
			break;
		case 3:
			System.out.println(" Datos de su consulta");
			if (usuariogeneral.equals(usuario_1)) {
				System.out.println(" Titular de la cuenta: "+usuario_1);
				System.out.println(" Numero de cuenta: "+cuenta_1);
				saldo_1 = valor_1;
				System.out.println(" Saldo: "+saldo_1);
			}
			if (usuariogeneral.equals(usuario_2)) {
				System.out.println(" Titular de la cuenta: "+usuario_2);
				System.out.println(" Numero de cuenta: "+cuenta_2);
				saldo_1 = valor_2;
				System.out.println(" Saldo: "+saldo_1);
			}
			if (usuariogeneral.equals(usuario_3)) {
				System.out.println(" Titular de la cuenta: "+usuario_3);
				System.out.println(" Numero de cuenta: "+cuenta_3);
				saldo_1 = valor_3;
				System.out.println(" Saldo: "+saldo_1);
			}
			break;
		default:
			System.out.println("Usuario no existe");
		}
	}

}
