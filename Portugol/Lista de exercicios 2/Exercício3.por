programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real n1, n2, n3, n4, q1, q2, q3, q4
		

		escreva("Digite o primeiro numero: ")
		leia(n1)

		escreva("Digite o segundo numero: ")
		leia(n2)

		escreva("Digite o terceiro numero: ")
		leia(n3)

		escreva("Digite o quarto numero: ")
		leia(n4)

		q1 = mat.potencia(n1,2)
		q2 = mat.potencia(n2,2)
		q3 = mat.potencia(n3,2)
		q4 = mat.potencia(n4,2)

		se(q3 >= 1000)
		{
			escreva("O quadrado do terceiro numero é: ", q3)	
		}
		senao
		{
			escreva("O quadrado do primeiro numero é: ", q1)	
			escreva("\nO quadrado do primeiro numero é: ", q2)	
			escreva("\nO quadrado do primeiro numero é: ", q3)	
			escreva("\nO quadrado do primeiro numero é: ", q4)	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 676; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */