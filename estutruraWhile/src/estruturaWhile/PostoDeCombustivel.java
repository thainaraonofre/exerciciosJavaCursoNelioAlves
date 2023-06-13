package estruturaWhile;

import java.util.Scanner;

public class PostoDeCombustivel {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;
		int contador = 1;
		
		System.out.println("Insira seu favorito:");
		int opcao = sc.nextInt();
		
		while(opcao != 4) {
			if(opcao == 1) {
				gasolina += contador;
			} else if(opcao == 2) {
				diesel += contador;
			} else if(opcao == 3) {
				alcool += contador;
			}
			opcao = sc.nextInt();
		}
		
		System.out.println("Gasolina" + gasolina +"\n" 
		+"Diesel" + diesel +"\n" + "Alcool" + alcool);

		sc.close();	
	}

}
