package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise10Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();

		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
			nome[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		double media = 0.0;

		System.out.println("Alunos aprovados: ");
		

	    for (int i=0; i<n; i++) {
	        media = (nota1[i] + nota2[i]) / 2;

	        if(media >= 6.0) {
	            System.out.printf("%s\n", nome[i]);
	        }
	    }
		

		sc.close();
	}

}
