package LacoRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		int C,num,par=0,impar=0;

		System.out.println("Pergunta 2\n\nLer 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.(FOR)");
		for (C=0;C<10;C++) {
			System.out.printf("Entre com um numero: ");
			num=Ler.nextInt();
			if ((num%2)==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("Entre os 10 numeros informados, "+par+" S�o pares e "+impar+" S�o impar");
	}
}
