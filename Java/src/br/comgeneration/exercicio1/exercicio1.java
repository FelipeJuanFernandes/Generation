package br.comgeneration.exercicio1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int idade,mes,dia;
		Scanner entrada = new Scanner(System.in);
		
		int diasVida;
		System.out.println("digite sua idade: ");
		idade = entrada.nextInt();
		
		System.out.println("digite quantos meses: ");
		mes = entrada.nextInt();
		
		System.out.println("digite os dias: ");
		dia = entrada.nextInt();

		diasVida=((idade*365)+(mes*30)+dia);
		
		System.out.println("Você tem "+diasVida+" dias vividos");
		entrada.close();

	}

}
