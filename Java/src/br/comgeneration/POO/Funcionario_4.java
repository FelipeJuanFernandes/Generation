package br.comgeneration.POO;

import java.util.Scanner;

public class Funcionario_4{
	private String nome;
	private String cpf;
	private int idade;
	private int tel;
	private String email;	
	private int cod;
	
	Scanner ler = new Scanner(System.in);
	
	public Funcionario_4 (String nome, String cpf, int idade, int tel, String email, int cod){
		this.nome = nome;
	    this.cpf = cpf;
	    this.idade = idade;
	    this.tel = tel;
	    this.email = email;  	
	    this.cod=cod;
	}
	
	public void  validarCpf() 
	{
		System.out.println("Nos informe seu cpf: ");
		cpf = ler.nextLine();
		if(cpf.length()!= 11){
			System.out.println("\n--Cpf inválido!!");
		}else{
			System.out.println("\n--Cpf válido!");
		}
				
	}
	
	public void verificarCodigo(){
		if(cod < 0){
			System.out.println("--Código inválido!\n");
		}else {
			System.out.println("--Código válido!\n");
		}
		
	}
	
	public void imprimirInfo(){
	    System.out.println("Nome do(a) funcionário(a): "+nome+"\n"+"Cpf: "+cpf+"\n"+"Idade: "+idade+"\n"+"Telefone: "+tel+"\n"+"E-mail: "+email+"\n"+"Código: "+cod);
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getCpf(){
		return cpf;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public int getIdade(){
		return idade;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public int getTelefone(){
		return tel;
	}

	public void setTelefone(int telefone){
		this.tel = telefone;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public int getCodigo(){
		return cod;
	}

	public void setCodigo(int codigo){
		this.cod = codigo;
	}	
}