package br.comgeneration.POO;

public class TesteAviao {

public static void main(String args[]) {
		
	Aviao_2 a1 = new Aviao_2 ("Grande porte", "Gol", 400, 800, 800, 500, 400);
		a1.imprimirInfo();
		a1.verificarVelocidade();
		a1.verificarCombustivel();
		
		System.out.println("Verificação nova de velocidade: ");
		a1.setVelocidadeAtual(300);
		a1.imprimirNovaInfo();
		a1.verificarVelocidade();
	}
}
