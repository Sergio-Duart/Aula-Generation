package Aula1;

import java.util.Scanner;

public class Exercicios3 {

	public static void main(String agrs[]) {
	
		Scanner Ler = new Scanner(System.in);
		int seg;
		
		System.out.println("Pergunta 3:\nFaça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.\n\nDigite aqui o tempo do evento em Segundos: ");
		seg = Ler.nextInt();
		System.out.println("\n\nIsso daria um total de "+((seg/60)/60)+" Horas "+((seg/60)%60)+" Minutos "+((seg%60)%60)+" Segundos.");
		
	}	
}
