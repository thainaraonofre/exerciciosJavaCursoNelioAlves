package estruturaFor;

import java.util.Scanner;

public class Div {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o valor de n:");

		int n = scan.nextInt();
		double x1, x2;
		
		for (int i = 1; i <= n; i++) {

			x1 = scan.nextDouble();
			x2 = scan.nextDouble();

	 		if (x2 == 0) {
				System.out.println("Divisão impossível");
			} else {
				double div = x1 / x2;
				System.out.println(div);
			}
		}

		scan.close();

	}

}
