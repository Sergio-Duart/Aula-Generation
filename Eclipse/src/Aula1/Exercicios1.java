package Aula1;

import java.util.Scanner;

public class Exercicios1 {

	public static void main(String agrs[]) {
	Scanner Ler = new Scanner(System.in);
	int ano,mes,dia;
	

	System.out.println ("Pergunta 1:\nFaça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.");
	System.out.println ("\nEntre com a sua data de Nascimento (Dia): ");
	dia = Ler.nextInt();
	System.out.println ("\nEntre com a sua data de Nascimento (Mês): ");
	mes = Ler.nextInt();
	System.out.println ("\nEntre com a sua data de Nascimento (Ano): ");
	ano = Ler.nextInt();
	ano = 2020-ano;
	System.out.println("\nVoce esta respirando por conta própria a "+((ano*365)+(mes*30)+(dia*1))+" Dias");
	System.out.println("\n\n Clique em Enter para a proxima Pergunta");
		
	}
}
