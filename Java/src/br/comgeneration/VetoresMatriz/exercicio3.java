package br.comgeneration.VetoresMatriz;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[][] mN1 = new int[2][3];
		int[][] mN2 = new int[2][3]; 
		int[][] mM1 = new int[2][3];
		int[][] mM2 = new int[2][3];
				
		
		for(int i=0;i < 2 ; i++){  
			for(int j=0;j<3;j++){
				System.out.println("Entre com o valor da matriz N1" + i + j);
				mN1[i][j] = leia.nextInt();
				System.out.println("Entre com o valor da matriz N2" + i + j);
				mN2[i][j] = leia.nextInt();
				mM1[i][j] = mN1[i][j] + mN2[i][j];
				mM2[i][j] = mN1[i][j] - mN2[i][j];
			}
		}

		System.out.println("Imprimindo a matriz N1: \n");  
		for(int i=0;i < 2 ; i++){ 
			for(int j=0;j<3;j++){				
				System.out.print(mN1[i][j] + " ");
			}
			System.out.println(" ");
		}

		System.out.println("Imprimindo a matriz N2: \n");   
		for(int i=0;i < 2 ; i++){ 
			for(int j=0;j<3;j++){				
				System.out.print(mN2[i][j] + " ");
			}
			System.out.println(" ");
		}

		System.out.println("Imprimindo a matriz SOMA N1 + N2: \n");     
		for(int i=0;i < 2 ; i++){
			for(int j=0;j<3;j++){				
				System.out.print(mM1[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("Imprimindo a matriz SUBTRACAO N1 - N2: \n");        
		for(int i=0;i < 2 ; i++){
			for(int j=0;j<3;j++){				
				System.out.print(mM2[i][j] + " ");
			}
		}
	}
}




