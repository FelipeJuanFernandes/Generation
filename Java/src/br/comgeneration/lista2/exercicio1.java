package br.comgeneration.lista2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O n�mero 1" + num1 + " � o maior");
		}else if(num2 > num3) {
			System.out.println("O n�mero " + num2 + " � o maior");
		}else {
			System.out.println("O n�mero " + num3 + " � o maior");
		}
		leia.close();
		
	}

}
