
public class ejercicio3 {

	public static void main(String args[]) {
		
		String signo = "*";
		int contador = 0;
		int i = 10;
		String tab = " ";
		int c_espacios = 1;
		int espacios = 12;
		System.out.println(" Ingrese un valor para i");
		System.out.println("             *");
		
		for (i=0;i<=12;i++) {
			while (contador<=i) {
				signo = signo.concat("*");
				contador = contador+1;
			}
			while (c_espacios<=espacios) {
				tab = tab.concat(" ");
				c_espacios = c_espacios+1;
			}
			System.out.println(tab+signo);
			contador = contador-1;
			espacios = espacios-1;
			c_espacios = 1;
			tab = " ";
		}
		System.out.println("            |  |");
		System.out.println("            |  |");
	}



}
