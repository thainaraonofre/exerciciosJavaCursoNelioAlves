package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Minutos {
	
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int minutos = sc.nextInt();
	double valor = 50.00;
	
	if (minutos <= 100) {
		System.out.printf("Valor a pagar R$ %.2f", valor);
	}
	
	else {
		valor += (minutos - 100) * 2.0;
		System.out.printf("Valor a pagar R$ %.2f", valor);
	}
	
	sc.close();
	
	}
}
	

	

