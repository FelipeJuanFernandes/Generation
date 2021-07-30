programa
{
	inclua biblioteca Matematica --
	
	funcao inicio()
	{
		real p, ex, m

		escreva("Digite o peso do tomate: ")
		leia(p)

		se(p >= 50.00)
		{
			ex = p - 50.00
			m = ex * 4.00
			escreva("O peso excedido é: ", ex, " e a multa sera: ", m, " R$")	
		}
		senao
		{
			escreva("Peso ",p," não excedido", ", não havera multa")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 44; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */