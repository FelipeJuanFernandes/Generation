package br.comgeneration.POO;

public class ProdutoElec_3 {
	private String tipo;	
	private String desc;
	private float preco;
	private int  qtdAtual;
	private int  estoque;
	
	public ProdutoElec_3 (String tipo, String descricao, float preco,int qtdAtual, int estoque){
		this.tipo = tipo;
		this.desc = descricao;
		this.preco = preco;
		this.qtdAtual = qtdAtual;
		this.estoque = estoque;
	}
	
	public void imprimirInfo(){
		System.out.println("Produto: "+tipo+"\nPreço: "+preco+"\nDescrição: "+desc+"\nQuantidade desejada do produto: "+qtdAtual+"\nQuantidade disponível em estoque: "+estoque);
	}
	
	public void verificaDisponibilidade(){
		if(qtdAtual <= estoque){
			System.out.println("\nHá disponibilidade desse produto no estoque");
			float preco_final = qtdAtual*preco;
			System.out.println("O valor a ser pago é de: "+preco_final+"\n");
		}else{
			System.out.println("\nNão há disponibilidade desse produto no estoque. Escolha outro, por gentileza.");
		}
		
					
	}
	
	public String getTipo(){
		return tipo;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public float getPreco(){
		return preco;
	}

	public void setPreco(float preco){
		this.preco = preco;
	}

	public String getDescricao(){
		return desc;
	}

	public void setDescricao(String descricao){
		this.desc = descricao;
	}

	public int getQuantidade_atual(){
		return qtdAtual;
	}

	public void setQuantidade_atual(int qtdAtual){
		this.qtdAtual = qtdAtual;
	}

	public int getEstoque(){
		return estoque;
	}

	public void setEstoque(int estoque){
		this.estoque = estoque;
	}
}