
import java.io.*;
public class ejercicio4ciclos {
  
  
        public static void main(String args[]) throws IOException {
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
            int num;
            int resul;
            int x;
            // Tabla de multiplicar
            x = 1;
            num = 0;
            System.out.println(" Que tabla de multiplicar desea ver");
            num = Integer.parseInt(bufEntrada.readLine());
            System.out.println(" La tabla del"+" "+num+" "+"es: ");
            for (x=1;x<=10;x++) {
                resul = (x*num);
                System.out.println(x+" x "+num+" = "+resul);
            }
        }
    
    
    }
      

