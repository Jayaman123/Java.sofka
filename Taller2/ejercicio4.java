import java.util.Scanner;


public class ejercicio4 {
    // menu 
	
    
   
    public static void main(String args[])  {
		try (Scanner Entrada = new Scanner(System.in)) {
            String contrasena= "Popeye";
            int opcion= 0;
            int opcion2= 0;
            String usuario= "Javier123";
            // punto 4 tienda de alquiler de peliculas
            // Espacio de usuairos (para este caso solo definimos un solo usuario)
            
            
            
            System.out.println("Por favor ingrese su usuario");
            usuario = Entrada.nextLine();
            
            System.out.println(" digite su contraseña");
            contrasena = Entrada.nextLine();
            if(usuario.equals("Javier123")) {
            	System.out.println(" BIENVENIDO");
            } else {
            	System.out.println(" contraseña incorrecta");
            }
            if (contrasena.equals("Popeye")) {
            	// lista de peliculas
            	System.out.println("Listado de peliculas disponibles");
            	System.out.println(" 1. Terminator 5");
            	System.out.println(" 2. Spiderman sin camino a casa");
            	System.out.println(" 3. Civil war");
            	System.out.println(" Seleccione la pelicula de su gusto");
            	opcion= Entrada.nextInt();

            	switch (opcion) {
            	case 1:
            		System.out.println(" Usted a seleccionado Terminator 5");
            		System.out.println(" Ha recibido con satisfaccion la pelicula?");
            		// opciones de seleccion 
            		System.out.println("1. si");
            		System.out.println("2. No");
            		opcion2 = Entrada.nextInt();
            		switch (opcion2) {
            		case 1:
            			System.out.println("Usted desea hacer alguna anotacion?");
                            break;
            		case 2:
            			System.out.println("Usted desea hacer alguna anotacion?");
                            break;
            		}
            		break;
            	case 2:
            		System.out.println(" Usted a seleccionado Spiderman sin camino a casa");
            		System.out.println(" Ha recibido con satisfaccion la pelicula?");
            		// opciones de seleccion 
            		System.out.println("1. si");
            		System.out.println("2. No");
            		opcion2 = Entrada.nextInt();
            		switch (opcion2) {
            		case 1:
            			System.out.println("Usted desea hacer alguna anotacion?");
                            break;
            		case 2:
            			System.out.println("Usted desea hacer alguna anotacion?");
                            break;
            		}
            		break;
            	case 3:
            		System.out.println(" Usted a seleccionado Civil war");
            		System.out.println(" Ha recibido con satisfaccion la pelicula?");
            		// opciones de seleccion 
            		System.out.println("1. si");
            		System.out.println("2. No");
            		opcion2 = Entrada.nextInt();
            		switch (opcion2) {
            		case 1:
            			System.out.println("Usted desea hacer alguna anotacion?");
                            break;
            		case 2:
            			System.out.println("Usted desea hacer alguna anotacion?");
                            break;
            		}
            		break;
            	}
            } else {
            	System.out.println(" ha marcado una opcion no disponible");
            }
        }
		System.out.println("Gracias por usar nuestros servicios, regrese pronto!!!");
	}




}
