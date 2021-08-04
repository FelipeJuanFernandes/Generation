package br.comgeneration.lista3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int contPar = 0;
		int contImpar = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0 && numero > 0) {
				contPar++;
			} else if (numero % 2 != 0 && numero > 0) {
				contImpar++;
			} else {
				System.out.println("Número inválido\n");
			}
		}
		
		System.out.printf("%nTotal de números pares: %d%n", contPar);
		System.out.printf("Total de números ímpares: %d", contImpar);
		leia.close();
		}
	}


