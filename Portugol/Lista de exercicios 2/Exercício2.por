programa
{
	
	funcao inicio()
	{
		real c, n, salario, qtdeHoraExtra, horaExtra = 0.0

		escreva("Digite a quantidade de horas trabalhas: ")
		leia(n)

		se(n > 50)
		{
			qtdeHoraExtra = n - 50
			horaExtra = qtdeHoraExtra * 20
			salario = 50.0 * 10.0

			escreva("Salário normal: ", salario)
			escreva("\nSalário excedente: ", horaExtra)
			escreva("\nSalário total: ", (salario + horaExtra))
		}
		senao
		{
			qtdeHoraExtra = 0.0
			salario = n * 10.0
			escreva("Salário normal: ", salario)
			escreva("\nSalário excedente: ", horaExtra)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 361; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */