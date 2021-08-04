package br.comgeneration.lista3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		int	totalMenos = 0;
		int	totalMais = 0;
		
		while(idade != -99) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade >= 0 && idade <= 21) {
				totalMenos++;
			}else if(idade > 50) {
				totalMais++;
			}
		}
		System.out.printf("%nTotal de menores de 21 anos: %d%n", totalMenos);
		System.out.printf("Total de maiores de 50 anos: %d", totalMais);
		leia.close();
	}
}
