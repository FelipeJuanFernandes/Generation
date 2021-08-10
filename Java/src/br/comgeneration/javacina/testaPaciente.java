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
		 
		 System.out.println("\nOl� " + nome + "!! ");
		 
		 System.out.println("\nDigite sua idade, por favor: ");
		 idade = leia.nextInt();
		 
		 if(idade <= 30) {
			 System.out.println("\nSua idade � inferior ao liberado para vacina");
			 System.out.println("Voc� faz parte de algum grupo especial ou com comorbidade?: (1- Sim | 2- N�o) ");
			 comorbidade = leia.nextInt();
			 
			 if(comorbidade == 1) {
				 
				 System.out.println("\nVoc� est� dentro do grupo de pessoas que podem tomar a vacina!!");
				 System.out.println("\nSiga com o seu cadastro\n");
				 
			 }else if(comorbidade == 2){
				 
				 System.out.println("\nVoc� ainda n�o se encontra no grupo de pessoas que podem tomar a vacina");
				 System.out.println("Deixei seu numero e avisamos quando estiver liberado: ");
				 telefone = leia.next();
				 
				 while(telefone.length() < 9 || telefone.length() > 9){
					 
					 System.out.println("Numero inv�lido, digite novamente:");
					 telefone = leia.next();
					 
				 }System.out.println("Obrigado, agora � s� aguardar o nosso contato !!");
 				  System.exit(0);
			 }
		 
		 }
		 
		 System.out.println("Digite seu telefone, por favor: ");
		 telefone = leia.next();

		 while(telefone.length() < 9 || telefone.length() > 9 ){
			 System.out.println("Numero inv�lido, digite novamente:");
			 telefone = leia.next();
		 }
		 
		 System.out.println("Digite email: ");
		 email = leia.next();

		 do {
			 System.out.println("\nPor favor, escolha uma das regi�es abaixo\n ");
			 System.out.println(" 1 - Zona norte\n 2 - Zona leste\n 3 - Zona sul\n 4 - Zona oeste\n");
			 System.out.println("Digite a regi�o:");
			 regiao = leia.nextInt();
			 
			 if(regiao < 1 || regiao > 4) {
				 
				 System.out.println("Voce digitou um numero inv�lido!! ");
				 System.out.println("Tente novamente");
				 
			 }else {
				 switch(regiao) {
				 case 1:
					 System.out.println("\nNesta regi�o, voc� tem as seguintes OBS: \n");
					 System.out.println("UBS1\nUBS2\nUBS3");
					 break;
				 case 2:
					 System.out.println("\nNesta regi�o, voc� tem as seguintes OBS: \n");
					 System.out.println("UBS6\nUBS7\nUBS8");
					 break;
				 case 3:
					 System.out.println("\nNesta regi�o, voc� tem as seguintes OBS: \n");
					 System.out.println("UBS9\nUBS10\nUBS11");
					 break;
				 case 4:
					 System.out.println("\nNesta regi�o, voc� tem as seguintes OBS: \n");
					 System.out.println("UBS12\nUBS13\nUBS14");
					 break;
				 }
			 }
			
		 }while(regiao < 1 || regiao > 4);
		 
		 
		 System.out.println("\nAbaixo segue informa��es do cadastro: ");
		 
		 Paciente paciente = new Paciente(nome,idade,telefone,email,regiao);
		 
		 System.out.println("Nome: " + paciente.getNome());
		 System.out.println("Sua idade �: " + paciente.getIdade() + " anos");
		 System.out.println("Seu n�mero para contato �: " + paciente.getTelefone());
		 System.out.println("Seu email para contato �: " + paciente.getEmail());
		 if(regiao == 1) {
		 System.out.println("Sua regi�o de escolha: Zona Norte");
		 }else if(regiao == 2) {
			 System.out.println("Sua regi�o de escolha: Zona Leste");
		 }else if(regiao == 3) {
			 System.out.println("Sua regi�o de escolha: Zona Sul");
		 }else if(regiao == 4) {
			 System.out.println("Sua regi�o de escolha: Zona Oeste");
		 }
		 
		 leia.close();
	}	
}
