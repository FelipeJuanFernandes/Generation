programa
{
	
	funcao inicio()
	{
		inteiro numeroUsuario

		escreva("Digite um número: ")
		leia(numeroUsuario)
		limpa()
		

		enquanto (numeroUsuario < 100 ) {
			escreva(numeroUsuario + " ")
			numeroUsuario = numeroUsuario * 3
		} se (numeroUsuario > 100) {
			escreva(numeroUsuario + " ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 297; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */