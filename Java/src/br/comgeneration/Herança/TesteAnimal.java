package br.comgeneration.Heran�a;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Dog",12);
		Cavalo cavalo = new Cavalo("Horse", 22);
		Pregui�a preguica = new Pregui�a("Pregui�a", 10);
		
		cachorro.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();

	}

}
