package br.comgeneration.POO;

public class Cliente_1 {
	private String nome;
	private String cpf;
	private int idade;
	private int telefone;
	
	public Cliente_1 (String nome, String cpf, int idade, int telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.telefone = telefone;
	}
	
	public void validaCpf() {
		if(cpf.length()!=11) {
			System.out.println("Cpf inválido");
		}else {
			System.out.println("Cpf válido");
		}
	}
	
	public void imprimeInfo() {
		System.out.println("Nome " + nome + "\n" + "Cpf " + cpf + "\n" + "Idade " + "\n" + "telefone " + telefone);
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
