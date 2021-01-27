package LacoCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		int pri=0,seg=0,ter=0,num=0;
		
		System.out.println("Pergunta2\n\nFaça um programa que entre com três números e coloque em ordem crescente.");
		for (int C=0;C<3;C++) {
			System.out.printf("Entre com um numero: ");
			num = Ler.nextInt();
			if (pri<num) {
				ter=seg;
				seg=pri;
				pri=num;
			}
			else if (seg<num) {
				ter=seg;
				seg=num;
			}
			else {
				ter=num;
			}
		}
		System.out.println("\nSegue os numeros informados em ordem Crescente: \n"+pri+"\n"+seg+"\n"+ter);
	}
}
