package Laco_Condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		double num,par,impar;
		
		System.out.println("Pergunta 4\n\nFa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar.\nSe for par exiba tamb�m a raiz quadrada do mesmo.\nse for �mpar exiba o n�mero elevado ao quadrado.");
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
