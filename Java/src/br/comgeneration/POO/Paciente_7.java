package br.comgeneration.POO;

public class Paciente_7{
	private String nome;
	private String cpf;
	private String email;
	private int idade;
	private int telefone;
	
	public Paciente_7(String nome, String cpf,String email,int idade, int telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.idade = idade;
		this.telefone = telefone;		
	}
	
	public void validarCpf() 
	{
		if (cpf.length()!=11) {
			System.out.println("--Cpf inválido!!");
		}else {
			System.out.println("--Cpf válido!");
		}
				
	}
	
	 public void imprimirInfo (){
		    System.out.println("Nome do(a) paciente: "+nome+"\nCpf: "+cpf+"\nIdade: "+idade+"\nTelefone: "+telefone+"\nE-mail: "+email);
	 }
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}