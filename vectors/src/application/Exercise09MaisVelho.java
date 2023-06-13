package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise09MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitadar? ");
		int n = sc.nextInt();

		String[] name = new String[n];
		int[] idade = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			name[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}

		int maiorIdade = idade[0];
		int posicaoMaior = 0;

		for (int i = 0; i < n; i++) {
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				posicaoMaior = i;
			}
		}
		
		

		System.out.println("Nome da pessoa mais velha " + name[posicaoMaior]);

		sc.close();
	}

}
