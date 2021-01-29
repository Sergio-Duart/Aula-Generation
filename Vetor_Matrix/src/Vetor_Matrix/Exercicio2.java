package Vetor_Matrix;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		int vezes=0,C,maior=0,quant=0,menor=8,qt=0,media,toval=0;
		
		System.out.println("Pergunta 2\n\nUm dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.\rA seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.");
		System.out.println("\rDigite quantas vezes o dado deve ser jogado:");
		vezes = Ler.nextInt();
		int dado[] = new int [vezes];
				
		for (C=0;C<vezes;C++) {
//			System.out.println("Entre com o valor do dado:");
//			dado[C] = Ler.nextInt();
			dado[C] = (int) (1+Math.random()*6);
				while (dado[C]<1 || dado[C]>6) {
					System.out.println("Isso era para ser um dado..    digite um valor entre 1 e 6");
					dado[C] = Ler.nextInt();
				}
				if (dado[C]>maior) {
					maior = dado[C];
				}
				if (dado[C]<menor) {
					menor = dado[C];
				}
			}
		for (C=0;C<vezes;C++) {
			if(dado[C]==maior) {
				quant++;
			}
			if(dado[C]==menor) {
				qt++;
			}
			System.out.println("Segue os valores sorteados:"+dado[C]);
			toval = toval + dado[C];
		}
		if (quant==1){
			System.out.println("\nO maior numero sorteado foi de: "+maior+", que foi sorteado "+quant+" vez");			
			System.out.println("O maior numero sorteado foi de: "+menor+", que foi sorteado "+qt+" vez");			
		}
		else {
		System.out.println("\nO maior numero sorteado foi de: "+maior+", que foi sorteado "+quant+" vezes");		
		System.out.println("O maior numero sorteado foi de: "+menor+", que foi sorteado "+qt+" vezes");		
		}
		media = toval/vezes;
		System.out.println("\nA média de todos os valores informados é de "+media);
	}
}
