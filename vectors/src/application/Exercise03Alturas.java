package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise03Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
	
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			name[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();			
		}
		
		double altMedia = 0;
		
		for (int i = 0; i < n; i++) {
			altMedia += altura[i] / n;
		}
		
		System.out.printf("Altura média: %.2f", altMedia);
		System.out.println();
		
		int soma = 0;
		
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				soma = soma + 1;
			}
		}
		
		double menores = (soma * 100.0) / n;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", menores);
		
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println("Nome: " + name[i]);
			}
		}

sc.close();
	}

}
