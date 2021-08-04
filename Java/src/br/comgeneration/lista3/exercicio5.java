package br.comgeneration.lista3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double num;
		double soma = 0;
		
		do {
			System.out.println("digite um número: ");
			num = ler.nextDouble();
			soma += num;
			
		}while(num != 0);
		
		System.out.println("Soma: " + soma);
		ler.close();
	}
}
