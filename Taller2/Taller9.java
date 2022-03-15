import java.io.*;
public class Taller9 {
    
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double area;
		double b;
		double h;
		int opcion;
		// ejercicio 9 profesor de geometria
		// variables 
		b = 0;
		h = 0;
		a = 0;
		// Figuras geometricas 
		System.out.println(" Figuras geometricas");
		System.out.println(" 1. Triangulo");
		System.out.println(" 2. Rectangulo");
		System.out.println(" 3. Trapecio");
		System.out.println(" Seleccione la figura geometrica a encontrar el area");
		opcion = Integer.parseInt(bufEntrada.readLine());
		switch (opcion) {
		case 1:
			System.out.println(" Figura geometrica Triangulo");
			System.out.println(" La base del triangulo es (m): ");
			b = Double.parseDouble(bufEntrada.readLine());
			System.out.println(" La altura del triangulo es (m): ");
			h = Double.parseDouble(bufEntrada.readLine());
			area = ((b*h)/2);
			System.out.println(" El area del triangulo es de: "+area+" (cm^2)");
			break;
		case 2:
			System.out.println(" Figura geometrica Rectangulo");
			System.out.println(" La base del rectangulo es (cm): ");
			b = Double.parseDouble(bufEntrada.readLine());
			System.out.println(" La altura del rectangulo es (m): ");
			a = Double.parseDouble(bufEntrada.readLine());
			area = (b*a);
			System.out.println(" El area del Rectangulo  es de: "+area+" (cm^2)");
			break;
		case 3:
			System.out.println(" Figura geometrica Trapecio");
			System.out.println(" La base mayor del Trapecio es (cm): ");
			a = Double.parseDouble(bufEntrada.readLine());
			System.out.println(" La base menor del trapecio es (cm): ");
			b = Double.parseDouble(bufEntrada.readLine());
			System.out.println(" La altura del trapecio es (m): ");
			h = Double.parseDouble(bufEntrada.readLine());
			area = (((a+b)/2)*h);
			System.out.println(" El area del Trapecio  es de: "+area+" (cm^2)");
			break;
		}
	}


}


