//Programa que solicite nombres y apellidos

import java.util.Scanner;
public class taller1{
    public static void main(String[] args) {
        
        //solicitar al uduario los datos de padres, madres, y propios
        System.out.println("***********************");
        System.out.println("RELLENA LOS CAMPOS");
        System.out.println(" ");

        String nombre = "";
        String Apellido = "";
        String nomPadre = "";
        String nomMadre = "";
        int edad = 0;
        String mascota = "";
        
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Digite su Nombre completo: ");
            nombre = in.nextLine();
            System.out.print("");
            System.out.print("Digite su Apellido: ");
            Apellido = in.nextLine();
            System.out.print("");
            System.out.print("Digite El nombre de su Padre : ");
            nomPadre = in.nextLine();
            System.out.print("");
            System.out.print("Digite el nombre de su madre: ");
            nomMadre = in.nextLine();
            System.out.print("");
            System.out.print("Digite su edad: ");
            edad = in.nextInt();
            System.out.print("");
            System.out.println("Digite tipo de mascota que tiene : ");
            mascota = in.nextLine();
            System.out.print("");

            System.out.println("Confirme sus datos: ");
            System.out.print("Nombre : "+ nombre);
            System.out.print(" Apellido : "+ Apellido);
            System.out.println("Edad : "+ edad);
            System.out.println("Tu Padre: "+ nomPadre +", "+  "Tu Madre:  "+ nomMadre);
            System.out.println("Tu mascota es un: "+ mascota);
        }

        

        

    }
    
}