programa
{
	
	funcao inicio()
	{
		real sal, 
		     somaSal = 0.0, 
		     somaNf = 0.0, 
		     mediaSal,
		     mediaNf, 
		     maiorSal = 0.0,
		     perc100, 
		     cont100 = 0.0
	  
	  inteiro nf, hab = 5, x

		para(x=1; x <= hab; x++)
		{
			escreva("Digite po salário: ")	
			leia(sal)

			escreva("Digite o número de filhos: ")
			leia(nf)

			somaSal = somaSal + sal
			somaNf = somaNf + nf

			se(sal > maiorSal)
			{
				maiorSal = sal
			}

			se(sal <= 100)
			{
				cont100++
			}
		}

		mediaSal = somaSal / hab
		mediaNf = somaNf / hab
		perc100 = (cont100*100) / hab

		escreva("\nMédia salarial da cidade: ", mediaSal)
		escreva("\nMédia de filhos dos habitantes: ", mediaNf)
		escreva("\nO maior salário da cidade: ", maiorSal)
		escreva("\nO percentual de pessoas com salario até R$100,00: ", perc100,"%")
		escreva("\nQuantidade de pessoas com salario até R$100,00: ", cont100)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 905; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */