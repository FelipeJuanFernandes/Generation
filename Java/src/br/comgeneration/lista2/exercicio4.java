package br.comgeneration.lista2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero inteiro: ");
		num = leia.nextInt();
		
		if(num % 2 == 0 && num > 0) {
			double aux = Math.sqrt(num);
			System.out.println("O numero " + num + " � par e sua raiz quadrada �: " + aux);
		}else if(num % 2 != 0 && num > 0) {
			double aux = Math.pow(num, 2);
			System.out.println("O numero " + num + " � impar e elevado ao quadrado: " + aux);
		}else {
			System.out.println("N�mero inv�lido");
		}
		leia.close();

	}

}
