package br.comgeneration.POO;

public class TestePaciente {
	public static void main(String  args[]) {
		Paciente_7 p1 = new Paciente_7 ("Sabrina", "40240240240","sabrina@outlook.com",26, 944448888);
		p1.imprimirInfo();
		p1.validarCpf();
		
	}
}