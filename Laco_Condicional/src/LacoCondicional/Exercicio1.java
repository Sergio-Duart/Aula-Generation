package LacoCondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		int num,maior = 0;
		
		System.out.println("Pergunta 1:\n\nFa�a um programa que receba tr�s inteiros e diga qual deles � o maior.");
		for (int C=0;C<3;C++) {
			System.out.printf("Entre com um numero: ");
			num = Ler.nextInt();
			if (num > maior) {
				maior = num;
			}
		}
		System.out.printf("O Maior numero digitado �: "+maior);
	}
}
