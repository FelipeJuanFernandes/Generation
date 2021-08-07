package br.comgeneration.POO;

public class Patinete_5 {
	private String modelo;
	private String cor;
	private double velocidade;
	
	
	public Patinete_5 (String modelo, String cor, double velocidade) {
		this.modelo = modelo;
		this.cor = cor;
		this.velocidade = velocidade;
	}
	public void imprimirInfo(){
		System.out.println("Modelo: "+modelo+"\nCor: "+cor+"\nVelocidade atual: "+velocidade);
	}

	public void pararPatinete(){
		if (velocidade > 0){
			velocidade = 0;
			System.out.println("\nSeu patinete está parado agora!");
		}
	}
	
	public void andarPatinete(){
		if (velocidade == 0){
			velocidade = velocidade+1;
			System.out.println("\nVocê e seu patinete estão em movimento agora!");
		}
	}
	
	public String getModelo(){
		return modelo;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public String getCor(){
		return cor;
	}

	public void setCor(String cor){
		this.cor = cor;
	}
	
	public double getVelocidade(){
		return velocidade;
	}

	public void setVelocidade(double velocidade){
		this.velocidade = velocidade;
	}				
}
