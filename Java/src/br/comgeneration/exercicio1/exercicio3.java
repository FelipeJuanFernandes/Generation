package br.comgeneration.exercicio1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args){
		int tempoSegundos, horas,minutos, segundos;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o Total de segundos do evento: ");
		tempoSegundos = entrada.nextInt();
		horas = tempoSegundos/(60*60);
		minutos = tempoSegundos%(60*60)/60;
		segundos = tempoSegundos%(60*60)%60;

		System.out.println("o tempo do evento é "+horas+":"+minutos+":"+segundos);
		entrada.close();
		
	}

}
