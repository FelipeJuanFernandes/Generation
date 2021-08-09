package br.comgeneration.Herança;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Dog",12);
		Cavalo cavalo = new Cavalo("Horse", 22);
		Preguiça preguica = new Preguiça("Preguiça", 10);
		
		cachorro.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();

	}

}
