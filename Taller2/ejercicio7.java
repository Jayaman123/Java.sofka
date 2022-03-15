
import java.util.Scanner;

public class ejercicio7 {
    

	public static void main(String args[]) {
		try (Scanner in = new Scanner(System.in)) {
            double estatura=0;
            double imc= 0;
            double peso= 0;
            String apellido = "";

            // ejercicio 7 secretaria de salud Indice de masa corporal
            peso = 0;
            estatura = 0;
            // solicitar datos del paciente
            System.out.println(" ***Informacion del paciente***");
            System.out.println(" Nombre ");
            in.nextLine();

            System.out.println(" Apellido");
            apellido = in.nextLine();

            System.out.println(" Estatura");
            estatura = in.nextInt();

            System.out.println(" peso");
            peso = in.nextInt();

            // calculo de IMC
            imc = (peso/(estatura*estatura));
            System.out.println(" su indice de masa corporal es: "+imc);
            // Si su IMC es menos de 18.5, se encuentra dentro del rango de peso insuficiente. 
            // Si su IMC es entre 18.5 y 24.9, se encuentra dentro del rango de peso normal o saludable. 
            // Si su IMC es entre 25.0 y 29.9, se encuentra dentro del rango de sobrepeso. 
            // Si su IMC es 30.0 o superior, se encuentra dentro del rango de obesidad.
            if (imc<=18.5) {
            	System.out.println(" Usted se encuentra bajo de peso");
            }
            if ((18.6<=imc && imc<=24.9)) {
            	System.out.println(" Usted se encuetra en un peso adecuado");
            }
            if ((25<=imc && imc<=29.9)) {
            	System.out.println(" Usted se encuetra en sobre-peso");
            }
            if ((imc>=30)) {
            	System.out.println(" Usted se encuetra Obreso");
            }
        }
    } 
    
}





