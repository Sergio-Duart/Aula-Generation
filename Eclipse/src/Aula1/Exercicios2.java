package Aula1;

import java.util.Scanner;

public class Exercicios2 {

	public static void main(String agrs[]) {
	Scanner Ler = new Scanner(System.in);
	int dia;
	
		System.out.println("Pergunta 2:\nFaça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.\n\nDigite uma quantidade de dias: ");
		dia=0;
		dia = Ler.nextInt();
		System.out.println("\n\nIsso vai dar "+(dia/365)+" Anos "+((dia%365)/30)+" Meses "+(dia%365%30)+" Dias.");
	
	}
}
