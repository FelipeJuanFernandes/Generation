programa
{
	
	funcao inicio()
	{
		real indice

		escreva("Entre com o valor do índice de poluição: ")
		leia(indice)

		se(indice == 0.3)
		{	
			escreva("Grupo 1 com atividades suspensas")	
		}
		senao se(indice == 0.4)
		{
			escreva("Grupos 1 e 2 com atividades suspensas")	
		}
		senao se(indice == 0.5)
		{
			escreva("Todos os grupos estão com as atividades suspensas")
		}
		senao
		{
			escreva("Grupos com atividades liberadas")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 122; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */