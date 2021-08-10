package br.comgeneration.javacina;

import java.util.Scanner;

public class testaPaciente {
	
	 public static void main(String [] args) {
	
		 Scanner leia = new Scanner(System.in);
		 
		 String nome;
		 int idade;
		 String telefone;
		 String email;
		 int regiao = 0;
		 int comorbidade = 0;

		 System.out.println("Digite nome: ");
		 nome = leia.next();
		 
		 System.out.println("\nOlá " + nome + "!! ");
		 
		 System.out.println("\nDigite sua idade, por favor: ");
		 idade = leia.nextInt();
		 
		 if(idade <= 30) {
			 System.out.println("\nSua idade é inferior ao liberado para vacina");
			 System.out.println("Você faz parte de algum grupo especial ou com comorbidade?: (1- Sim | 2- Não) ");
			 comorbidade = leia.nextInt();
			 
			 if(comorbidade == 1) {
				 
				 System.out.println("\nVocê está dentro do grupo de pessoas que podem tomar a vacina!!");
				 System.out.println("\nSiga com o seu cadastro\n");
				 
			 }else if(comorbidade == 2){
				 
				 System.out.println("\nVocê ainda não se encontra no grupo de pessoas que podem tomar a vacina");
				 System.out.println("Deixei seu numero e avisamos quando estiver liberado: ");
				 telefone = leia.next();
				 
				 while(telefone.length() < 9 || telefone.length() > 9){
					 
					 System.out.println("Numero inválido, digite novamente:");
					 telefone = leia.next();
					 
				 }System.out.println("Obrigado, agora é só aguardar o nosso contato !!");
 				  System.exit(0);
			 }
		 
		 }
		 
		 System.out.println("Digite seu telefone, por favor: ");
		 telefone = leia.next();

		 while(telefone.length() < 9 || telefone.length() > 9 ){
			 System.out.println("Numero inválido, digite novamente:");
			 telefone = leia.next();
		 }
		 
		 System.out.println("Digite email: ");
		 email = leia.next();

		 do {
			 System.out.println("\nPor favor, escolha uma das regiões abaixo\n ");
			 System.out.println(" 1 - Zona norte\n 2 - Zona leste\n 3 - Zona sul\n 4 - Zona oeste\n");
			 System.out.println("Digite a região:");
			 regiao = leia.nextInt();
			 
			 if(regiao < 1 || regiao > 4) {
				 
				 System.out.println("Voce digitou um numero inválido!! ");
				 System.out.println("Tente novamente");
				 
			 }else {
				 switch(regiao) {
				 case 1:
					 System.out.println("\nNesta região, você tem as seguintes OBS: \n");
					 System.out.println("UBS1\nUBS2\nUBS3");
					 break;
				 case 2:
					 System.out.println("\nNesta região, você tem as seguintes OBS: \n");
					 System.out.println("UBS6\nUBS7\nUBS8");
					 break;
				 case 3:
					 System.out.println("\nNesta região, você tem as seguintes OBS: \n");
					 System.out.println("UBS9\nUBS10\nUBS11");
					 break;
				 case 4:
					 System.out.println("\nNesta região, você tem as seguintes OBS: \n");
					 System.out.println("UBS12\nUBS13\nUBS14");
					 break;
				 }
			 }
			
		 }while(regiao < 1 || regiao > 4);
		 
		 
		 System.out.println("\nAbaixo segue informações do cadastro: ");
		 
		 Paciente paciente = new Paciente(nome,idade,telefone,email,regiao);
		 
		 System.out.println("Nome: " + paciente.getNome());
		 System.out.println("Sua idade é: " + paciente.getIdade() + " anos");
		 System.out.println("Seu número para contato é: " + paciente.getTelefone());
		 System.out.println("Seu email para contato é: " + paciente.getEmail());
		 if(regiao == 1) {
		 System.out.println("Sua região de escolha: Zona Norte");
		 }else if(regiao == 2) {
			 System.out.println("Sua região de escolha: Zona Leste");
		 }else if(regiao == 3) {
			 System.out.println("Sua região de escolha: Zona Sul");
		 }else if(regiao == 4) {
			 System.out.println("Sua região de escolha: Zona Oeste");
		 }
		 
		 leia.close();
	}	
}
