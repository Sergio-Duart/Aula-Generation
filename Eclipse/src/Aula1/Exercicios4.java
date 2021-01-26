package Aula1;

import java.util.Scanner;

public class Exercicios4 {
	
	public static void main(String agrs[]) {
		
		Scanner Ler = new Scanner(System.in);
		double A,B,C,D,R,S;
		
		System.out.println("Pergunta 4:\nEscreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:\nD=(R+S)/2, onde R=(A+B)^2 e S=(B+C)^2");
		System.out.println("\nInsira o Valor de A");
		A = Ler.nextDouble();
		System.out.println("Insira o Valor de B");
		B = Ler.nextDouble();
		System.out.println("Insira o Valor de C");
		C = Ler.nextDouble();
		R=Math.pow(A+B, 2);
		S=Math.pow(B+C, 2);
		D=(R+S)/2;
		System.out.println("\nO Valor de D é: "+D);
	}
}
