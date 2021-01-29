package Vetor_Matrix;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
			int[][] N1 = new int [4][6];
			int[][] N2 = new int [4][6];
			int[][] M1 = new int [4][6];
			int[][] M2 = new int [4][6];
		
		System.out.println("Pergunta 3\n\nEscreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:\n\nA) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;\nB) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.");
		for (int A=0; A<4 ; A++) {
			for (int B=0 ; B<6 ; B++) {
//				System.out.println("\nEntre com os numeros das matrizes: ");
//				N1[A][B]= Ler.nextInt();
				N1[A][B]= 7;//(int)(1+Math.random()*30);
//				N2[A][B]= Ler.nextInt();
				N2[A][B]= 5;//(int)(1+Math.random()*30);
			}
		}
		System.out.println("\nResposta da A:\nSegue valores de M1 (N1 + N2)");
		for (int A=0; A<4 ; A++) {
			for (int B=0 ; B<6 ; B++) {
				M1[A][B]=N1[A][B]+N2[A][B];
				System.out.printf("\t%d\n",M1[A][B]);
			}
		}
		System.out.println("\nResposta da B:\nSegue valores de M2 (N1 - N2)");
		for (int A=0; A<4 ; A++) {
			for (int B=0 ; B<6 ; B++) {
				M2[A][B]=N1[A][B]-N2[A][B];
				System.out.printf("\t%d\n",M2[A][B]);
			}
		}
		
	}
}
