programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	   inteiro dado[10],x, soma_num=0, cont=0
	   real media=0.0

	   para (x=0;x<10;x++)
	   {
	   	   escreva("Insira um valor correspondente ao que apareceu ao lançar o dado: ")
	   	   leia(dado[x])
	   	   se (dado[x]==6){
			cont++
		   }
		   soma_num = soma_num + dado[x]   	    
	   	      	      	   	   	   
	   }
	   limpa()
	   para (x=0;x<10;x++)
		{
			escreva("\nValor Posição ",x+1,":", dado[x])
		}
		media = soma_num/10
		escreva("\n\nA média aritmética entre os números de lançamento é igual a: ", mat.arredondar(media,2))
		escreva("\n\nO número de ocorrências da maior pontuação é igual a: ", cont, "\n\n")
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 694; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */