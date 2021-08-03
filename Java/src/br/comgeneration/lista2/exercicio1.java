package br.comgeneration.lista2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O número 1" + num1 + " é o maior");
		}else if(num2 > num3) {
			System.out.println("O número " + num2 + " é o maior");
		}else {
			System.out.println("O número " + num3 + " é o maior");
		}
		leia.close();
		
	}

}
