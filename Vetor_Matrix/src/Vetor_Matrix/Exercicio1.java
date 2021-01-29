package Vetor_Matrix;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		int Alunos,Cont,maior=0,vet=0,C;

		System.out.println("Pergunta 1\n\nFaça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.");
		System.out.printf("\nInsira a quantidade de Alunos a serem pontuados: ");
		Alunos = Ler.nextInt();
		Cont=Alunos;
		vet=Alunos;
		int pont[] = new int [vet];
		for (C=0;C<Cont;C++) {
//			System.out.println("\nInsira o valor da Pontuação:");
//			pont[C] = Ler.nextInt();
			pont[C] = (int) (Math.random()*10);
			if (pont[C]>maior) {
				maior=pont[C];
			}
		}
		for (C=0;C<Cont;C++) {
			if (pont[C]==maior) {
				System.out.println("A Pontuação deste aluno é de: "+pont[C]+"-----  Esta é a maior pontuação");
			}
			else {
				System.out.println("A Pontuação deste aluno é de: "+pont[C]);
			}
		}
	}
}
