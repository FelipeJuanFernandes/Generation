package br.comgeneration.VetoresMatriz;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int [][] ma = new int[3][3];
		int somaM = 0;
		int somaDi = 0;
		int l,c;
		
		System.out.println("Entre com o valor da matriz: ");
			for(l = 0; l < ma.length; l++) {
				for(c = 0; c < ma[l].length; c++) {
					ma[l][c] = leia.nextInt();
					somaM += ma[l][c];
					if(l == c) {
						somaDi += ma[l][c];
					}
				}
			}
			System.out.println("Total de elementos: " + somaM);
			System.out.println("\nSoma da diagonal: " + somaDi);
			
	}

}
