package br.comgeneration.VetoresMatriz;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dado[] = new int[10];
		int x;
		int soma_num = 0;
		int cont = 0;
		double media = 0;
		
		for(x = 0; x < 10; x++) {
			System.out.println("Insira um valor correspondete ao que apareceu ao lan�ar dado: ");
			dado[x] = leia.nextInt();
			if(dado[x] == 6) {
				cont++;
			}soma_num += dado[x];
		}
		
		for(x = 0; x < 10; x++) {
			System.out.println("\nValor da posi��o " + (x+1) + " � " + dado[x]);
		}
		
		media = soma_num/10;
		
		System.out.println("\n\nA m�dia aritm�tica entre os n�meros de lan�amento � igual a: " + media);
		System.out.println("\n\nO n�mero de ocorr�ncias da maior pontua��o � igual a: " + cont);
	}
}
