programa
{
	
	funcao inicio()
	{
		inteiro numero, parOuImpar

		escreva("Digite um número inteiro: ")
		leia(numero)
		limpa()

		se(numero > 0) {
			se(numero % 2 == 0) {
				escreva("O número " + numero + " é positivo e par")
			}
			senao {
				escreva("O número " + numero + " é positivo e ímpar")
			}
		}
		senao se(numero < 0) {
			se(numero % 2 == 0) {
				escreva("O número " + numero + " é negativo e par")
			}
			senao {
				escreva("O número " + numero + " é negativo e ímpar")
			}
		}
		senao {
			escreva("Zero é um valor neutro")
		}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 559; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */