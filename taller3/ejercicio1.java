
    import java.io.*;

public class ejercicio1 {
   
        public static void main(String args[]) throws IOException {
            try (BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in))) {
                int contador;
                int control;
                int i;
                String signo;
                String tab;
                // ejercicio 1 taller ciclos
                i = 0;
                System.out.println("Digite un numero para obtener la grafica");
                i = Integer.parseInt(bufEntrada.readLine());
                signo = "*";
                contador = 0;
                tab = " ";
                for (control=1;control<=i;control++) {
                    System.out.println(signo);
                    for (control=1;control<=i;control++) {
                        signo = signo.concat("*");
                        contador = contador+1;
                        System.out.println(signo);
                    }
                    
                }
            } catch (NumberFormatException e) {
               
                e.printStackTrace();
        }
    }
}
        
    