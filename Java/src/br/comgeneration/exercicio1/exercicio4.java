package br.comgeneration.exercicio1;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		double a,b,c,d,r,s;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = entrada.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = entrada.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = entrada.nextDouble();
		
		r = Math.pow((a+b),2);
		s = Math.pow((b+c),2);
		d = (r+s)/2;
		System.out.println("valor de R: "+r);
		System.out.println("valor de S: "+s);
		System.out.println("valor de D: "+d);
		entrada.close();

	}

}
