package br.comgeneration.javacina;

import java.util.Scanner;

public class TestePacienteNew {
	
	 public static void main(String [] args) {
		 
		 Scanner leia = new Scanner(System.in);
		 
		 String nome;
		 int idade;
		 String telefone;
		 String email;
		 int regiao = 0;
		 
		 System.out.println("Digite nome: ");
		 nome = leia.next();
		 
		 System.out.println("Digite idade: ");
		 idade = leia.nextInt();
		 
		 if(idade <= 30) {
			 System.out.println("Possui comorbidade ?(SIM/NÃO)");
			 String comorbidade = leia.next();
			 if(comorbidade == "Sim") {
				 System.out.println("Faça o cadastro: ");
			 }else {
				 System.out.println("Digite telefone: ");
				 telefone = leia.next();
			 }
		 }
		 
		
		 
	}
	
	
}
