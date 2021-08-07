package br.comgeneration.POO;

public class ContaBanc_6{
	private String nome;
	private String cpf;
	private String email;
	private int idade;
	private int telefone;
	private float saldo_atual;
	
	
	public ContaBanc_6(String nome, String cpf,String email, int idade, int telefone, float saldo_atual){
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.idade = idade;
		this.telefone = telefone;
		this.saldo_atual = saldo_atual;
	}
	
	public void validarCpf() 
	{
		if (cpf.length()!= 11){
			System.out.println("\n--Cpf inválido!!");
		}else{
			System.out.println("\n--Cpf válido!");
		}				
	}
	
	public void imprimirInfo (){
	    System.out.println("nome do(a) cliente: "+nome+"\nCpf: "+cpf+"\nIdade: "+idade+"\nTelefone: "+telefone+"\nE-mail: "+email+"\nSaldo atual da conta: "+saldo_atual);
	}
	
	public void verificarEstadoConta(){
		if (saldo_atual<0){
			System.out.println("\n--Sua conta está negativa!");
		}
		else{
			System.out.println("\n--Sua conta esta positiva!");
		}
	}

	public String getnome(){
		return nome;
	}


	public void setnome(String nome){
		this.nome = nome;
	}


	public String getcpf(){
		return cpf;
	}


	public void setcpf(String cpf){
		this.cpf = cpf;
	}

	public String getemail(){
		return email;
	}


	public void setemail(String email){
		this.email = email;
	}


	public int getidade(){
		return idade;
	}


	public void setidade(int idade){
		this.idade = idade;
	}


	public int gettelefone(){
		return telefone;
	}


	public void settelefone(int telefone){
		this.telefone = telefone;
	}


	public float getSaldo_atual(){
		return saldo_atual;
	}


	public void setSaldo_atual(float saldo_atual){
		this.saldo_atual = saldo_atual;
	}
}
