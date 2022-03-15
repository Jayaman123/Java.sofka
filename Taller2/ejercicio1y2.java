import java.util.Scanner;
public class ejercicio1y2 {
    public static void main(String[] args) {
        try (Scanner dato = new Scanner(System.in)) {
            // variables
            int edad = 0;

            System.out.println("Por Favor digite su edad: ");
            edad = dato.nextInt();
            System.out.println("");

            if( edad < 18 ){
                System.out.println(" Usted es menor de edad");

            }else if(edad > 18){
                System.out.println(" Usted es mayor de edad");
            }
        }
           


    }

}