package br.comgeneration.POO;

public class TesteProduElec{
	public static void main(String args[]) {
			
		ProdutoElec_3 p1 = new ProdutoElec_3 ("Notebook","DVD Dell", 600 , 15, 10 );
		
		p1.imprimirInfo();
		p1.verificaDisponibilidade();
		
	
		p1.setTipo("Dvd");
		p1.setQuantidade_atual(8);
		p1.setEstoque(12);
		
		System.out.println("\n");
		System.out.println("Novo produto: ");
		
		p1.imprimirInfo();
		p1.verificaDisponibilidade();
	}
}
