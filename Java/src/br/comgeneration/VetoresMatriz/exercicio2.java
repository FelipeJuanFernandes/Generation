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
			System.out.println("Insira um valor correspondete ao que apareceu ao lançar dado: ");
			dado[x] = leia.nextInt();
			if(dado[x] == 6) {
				cont++;
			}soma_num += dado[x];
		}
		
		for(x = 0; x < 10; x++) {
			System.out.println("\nValor da posição " + (x+1) + " é " + dado[x]);
		}
		
		media = soma_num/10;
		
		System.out.println("\n\nA média aritmética entre os números de lançamento é igual a: " + media);
		System.out.println("\n\nO número de ocorrências da maior pontuação é igual a: " + cont);
	}
}
