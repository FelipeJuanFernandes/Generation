package br.comgeneration.POO;

public class Aviao_2 {
	private String porte;
	private String empresa;
	private int numeroLugares;
	private int combustivelAtual;
	private int combustivelNecessario;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	
	
	public Aviao_2 (String porte, String empresa, int numeroLugares, int combustivelAtual,int combustivelNecessario, double velocidadeAtual,double velocidadeMaxima ) {
		this.porte = porte;
		this.empresa = empresa;
		this.numeroLugares = numeroLugares;
		this.combustivelAtual = combustivelAtual;
		this.combustivelNecessario = combustivelNecessario;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	 public void imprimirInfo (){
		 System.out.println("Porte do avião: "+porte+"\n"+"Empresa: "+empresa+"\n"+"Número de lugares:  "+numeroLugares+"\n"+"Combustível atual: "+combustivelAtual+"\n"+"Quantidade de combustível necessária: "+combustivelNecessario+"\n"+"Velocidade atual: "+velocidadeAtual+"\n"+"Velocidade máxima: "+velocidadeMaxima+"\n");	 }
	 public void imprimirNovaInfo (){
		    System.out.println("Velocidade atual: "+velocidadeAtual);
	 }
	
	int verificarVelocidade() 
	{
		if (this.velocidadeAtual>velocidadeMaxima) {
			double velocidadeExcedida= velocidadeAtual-velocidadeMaxima;
			System.out.println("Diminua a velocidade, pois está ultrapassando os limites aceitáveis em "+velocidadeExcedida+"km/h.");
		}else {
			System.out.println("A velocidade está dentro do limite aceitável.");
		}
		return 1;		
	}
	int verificarCombustivel() 
	{
		if (this.combustivelAtual<combustivelNecessario) {
			System.out.println("Urgente!! Faça uma parada para encher o tanque deste avião no nível necessário!");
		}else {
			System.out.println("O combustível está dentro do nível aceitável \n");
		}
		return 1;		
	}
	

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getNumeroLugares() {
		return numeroLugares;
	}

	public void setNumeroLugares(int numeroLugares) {
		this.numeroLugares = numeroLugares;
	}

	public int getCombustivelAtual() {
		return combustivelAtual;
	}

	public void setCombustivelAtual(int combustivelAtual) {
		this.combustivelAtual = combustivelAtual;
	}

	public int getCombustivelNecessario() {
		return combustivelNecessario;
	}

	public void setCombustivelNecessario(int combustivelNecessario) {
		this.combustivelNecessario = combustivelNecessario;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	
	
	
	
}
