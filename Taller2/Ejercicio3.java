
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try (Scanner datos = new Scanner(System.in)) {

            // Variables
        String nombre = "";
        String apellido = "";
        int edad = 0;

        System.out.println("Digite su nombre: ");
        nombre = datos.nextLine();
        System.out.println("");

        System.out.println("Digite su apellido: ");
        apellido = datos.nextLine();
        System.out.println("");

        System.out.println("Digite su edad: ");
        edad = datos.nextInt();
        System.out.println("");
        
        if(edad > 18 ){
            System.out.println(nombre +" " + " "+ apellido+ " usted es mayor de edad, por lo tanto puede entrar a la fiesta");

        }else if(edad < 18){
            System.out.println(nombre +" " + " "+ apellido+ " usted es menor de edad, por lo tanto no puede entrar a la fiesta");

        }
        }

        


    }
}
