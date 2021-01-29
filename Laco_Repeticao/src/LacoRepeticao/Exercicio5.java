package LacoRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		int C=0,num,total=0;

		System.out.println("Pergunta 5\n\nCrie um programa que leia um número do teclado até que encontre um número igual a zero.\nNo final, mostre a soma dos números digitados.(DO.. While)");
			do {
				System.out.println("Entre com um Numero");
				num = Ler.nextInt();
				C++;
				total = total + num;
			}while (num!=0);
		System.out.println("O valor total dos "+C+"Informados é de: "+total);
	}
}
