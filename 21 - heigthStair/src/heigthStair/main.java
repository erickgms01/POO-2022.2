package heigthStair;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Create a Scanner
		
		double X, Y, Z;
		int prossiga = 1;
		
		while (prossiga == 1) {
			System.out.print("Me forneça o tamanho da escada: ");
			Z = sc.nextDouble();
			System.out.print("Me forneça a altura que deseja o quadro: ");
			X = sc.nextDouble();
			
			if (X < Z) {
				Y = Math.sqrt(Math.pow(Z, 2) - Math.pow(X, 2)); 
				System.out.format("A distância da escada até a parede tem que ser de: %.2f",Y);	
				break;
			}
			else {
				System.out.println("Error!\n a altura do quadro tem que ser menor que a altura da escada!");
				System.out.println("Voltar para o Inicio?\n"
						+ "[1] Sim\n"
						+ "[0] Não");
				prossiga = sc.nextInt();
			}
		}
	}
}