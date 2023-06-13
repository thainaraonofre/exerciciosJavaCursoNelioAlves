package application;
import java.util.Locale;
import java.util.Scanner;

public class Exercise07AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		System.out.println();

		double media = 0;
		
		for (int i = 0; i < n; i++) {
			media += vetor[i] / n;	
		}
	
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);

		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

		for (int i = 0; i < n; i++) {
			if (media > vetor[i]) {
				System.out.println(vetor[i]);
			}		
		}
				
sc.close();
	}

}
