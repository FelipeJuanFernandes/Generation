package br.comgeneration.POO;

public class TesteConta{
		public static void main(String args[]){
			
			ContaBanc_6 c1 = new ContaBanc_6("Samanta","80060090033","samanta@outlook.com", 30, 988888888, 400);
			c1.imprimirInfo();
			c1.validarCpf();
			c1.verificarEstadoConta();		
		}
}