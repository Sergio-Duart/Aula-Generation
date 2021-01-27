package LacoCondicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		double nume,par,impar;
		
		System.out.println("Pergunta 4\n\nFaça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.\nSe for par exiba também a raiz quadrada do mesmo.\nse for ímpar exiba o número elevado ao quadrado.");
		System.out.println("\nEntre com um numero:");
		nume=Ler.nextDouble();
		if (nume%2==0) {
			par=Math.sqrt(nume);
			System.out.printf("A Raiz quadrada do seu numero é: %2.2f",par);		
		}
		else {
			impar=Math.pow(nume, 2);
			System.out.printf("O numero elevado do seu numero é: %2.2f",impar);		
		}
	}
}
