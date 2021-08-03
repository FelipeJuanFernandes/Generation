package br.comgeneration.lista2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);	

		double n1, n2, n3;
		
		double media = 0.0;		
		
		System.out.println("Digite três números: ");
		n1 = ler.nextInt();
		n2 = ler.nextInt();
		n3 = ler.nextInt();
		
		if(n1 <= n2 && n2 <= n3) {
			System.out.println("A ordem crescente: \n" + n1 + n2 + n3);
		}
		else if(n1 <= n3 && n3 <= n2) {
			System.out.println("A ordem crescente: \n" + n1 + n3 + n2);
		}
		else if(n2 <= n1 && n1 <= n3) {
			System.out.println("A ordem crescente: \n" + n2 + n1 + n3);
		}
		else if(n2 <= n3 && n3 <= n1) {
			System.out.println("A ordem crescente: \n" + n2 + n3 + n1);
		}
		else if(n3 <= n1 && n1 <= n2) {
			System.out.println("A ordem crescente: \n" + n3 + n1 + n2);
		}
		else {
			System.out.println("A ordem crescente: \n" + n3 + n2 + n1);
		}
		
		media = (n1 + n2 + n3) / 3;
		System.out.println(media);
		ler.close();
	}

}
