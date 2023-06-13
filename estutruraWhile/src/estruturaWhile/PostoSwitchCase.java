package estruturaWhile;

import java.util.Scanner;

public class PostoSwitchCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu voto, 1 para alcool, 2 para gasolina e 3 para diesesl.");

        int opcaoVoto = scan.nextInt();
        
            int votoGasolina = 0;
            int votoAlcol = 0;
            int votoDiesel = 0;
            int contador = 1;

        while (opcaoVoto != 4) {

            switch (opcaoVoto) {
                case 1:
                    votoGasolina += contador;
                    System.out.println(" + 1 voto para gasolina");
                    break;
                case 2:
                    votoAlcol += contador;
                    System.out.println(" + 1 voto para alcool");
                    break;
                case 3:
                    votoDiesel += contador;
                    System.out.println(" + 1 voto para diesel");
                    break;
            }
                opcaoVoto = scan.nextInt();
        }

        System.out.println("Gasolina teve: " + votoGasolina);
        System.out.println("Alcol teve: " + votoAlcol);
        System.out.println("Diesel teve: " + votoDiesel);

        scan.close();
    }
	}

