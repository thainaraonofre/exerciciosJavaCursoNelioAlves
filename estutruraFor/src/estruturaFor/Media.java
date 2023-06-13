package estruturaFor;


import java.util.Scanner;

public class Media {

	public static void main(String[] args) {


	        Scanner scan = new Scanner(System.in);

	        System.out.println("Insira o valor de n");

	        int n = scan.nextInt();

	        double notas;
	        double media = 0;

	        for (int i = 1; i <= n; i++) {
	            System.out.println("Insira a nota:");

	            notas = scan.nextDouble();

	            if (i == 1) {
	                media += notas * 2;
	            } else if (i == 2) {
	                media += notas * 3;
	            } else {
	                media += notas * 5;
	            }
	        }
	        double notaFinal = media / 10;

	        System.out.println("Media final:" + notaFinal);

	        scan.close();
	    }
}
