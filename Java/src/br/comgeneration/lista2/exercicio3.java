package br.comgeneration.lista2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Categoria infantil");
		}else if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria Juvenil");
		}else if(idade >= 18 && idade <= 25) {
			System.out.println("categoria Adulta");
		}else {
			System.out.println("Não há categoria para essa idade");
		}
		leia.close();
	}

}
