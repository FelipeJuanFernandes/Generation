package br.comgeneration.VetoresMatriz;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num[] = new int[5];
		int x;
		int maior = 0;
		
		for(x = 0; x < 5; x++) {
			System.out.println("Entre com um número: ");
			num[x] = leia.nextInt();
			if(num[x] > maior) {
				maior = num[x];
			}
		}
		for(x = 0; x < 5; x++) {
			System.out.println("Valor posição: " + x + " : " + num[x]);
		}
		System.out.println("\nA maior pontuação " + maior);
	}
}
