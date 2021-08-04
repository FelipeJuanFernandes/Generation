package br.comgeneration.lista3;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num;
		int cont = 0;
		int total = 0;
		double med;
		
		do {
			System.out.println("Entre com número: ");
			num = ler.nextInt();
			if(num % 3 == 0) {
				total += num;
				cont++;
			}
		}while(num != 0);
		
		med = (double)total / (cont - 1);
		
		System.out.println("A média dos multiplos de 3 é: " + med);
		ler.close();
	}

}
