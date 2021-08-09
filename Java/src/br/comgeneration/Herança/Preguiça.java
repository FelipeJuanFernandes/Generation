package br.comgeneration.Herança;

public class Preguiça extends Animal {
	
	public Preguiça(String nome, int idade) {
		super(nome, idade);
	}
	
	public void subirArvore() {
		System.out.println("Subir árvore");
	}
}
