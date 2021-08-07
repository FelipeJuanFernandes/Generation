package br.comgeneration.POO;

public class TesteFuncionario{
	public static void main (String args []){
		Funcionario_4 f1 = new Funcionario_4 ("Sabrina", "00011122233", 22, 944444444,"sabrina@outlook.com", 1256);
	      f1.imprimirInfo();
	      f1.validarCpf();
	      f1.verificarCodigo();  
	}
}