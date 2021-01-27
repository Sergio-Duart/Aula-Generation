package Laco_Condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		int num,maior = 0;
		
		System.out.println("Pergunta 1:\n\nFaça um programa que receba três inteiros e diga qual deles é o maior.");
		for (int C=0;C<3;C++) {
			System.out.printf("Entre com um numero: ");
			num = Ler.nextInt();
			if (num > maior) {
				maior = num;
			}
		}
		System.out.printf("O Maior numero digitado é: "+maior);
	}
}
