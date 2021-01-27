package Laco_Condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		double num,par,impar;
		
		System.out.println("Pergunta 4\n\nFaça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.\nSe for par exiba também a raiz quadrada do mesmo.\nse for ímpar exiba o número elevado ao quadrado.");
		System.out.println("\nEntre com um numero:");
		num=Ler.nextDouble();
		if (num%2==0) {
			par=Math.sqrt(num);
			System.out.println(par);		
		}
		else {
			impar=Math.pow(num, 2);
			System.out.println(impar);		
		}
	}
}
