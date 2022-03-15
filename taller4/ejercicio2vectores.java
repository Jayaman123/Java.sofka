

public class ejercicio2vectores {

	public static void main(String args[]) {
		int a;
		int b;
		int matriz[][];
		matriz = new int[5][5];
		matriz[0][0] = 0;
		for (a=0;a<=4;a++) {
			for (b=0;b<=4;b++) {
				matriz[a][b] = (int) Math.floor(Math.random()*100);
			}
		}
		for (a=0;a<=4;a++) {
			for (b=0;b<=4;b++) {
				System.out.print(matriz[a][b]+" ");
			}
			System.out.println(" ");
		}
	}


}



