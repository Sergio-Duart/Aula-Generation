package Aula1;

import java.util.Scanner;

public class Exercicios6 {
	public static void main(String agrs[]) {
		Scanner Ler = new Scanner(System.in);
		double x1,x2,y1,y2,D;
		
		System.out.println("Pergunta 6:\nConstrua um programa em que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2)\nescreva a distância entre eles. A fórmula que efetua tal cálculo é: D=raiz quadrada de (X2-X1)^2 + (Y2-Y1)^2");
		System.out.println("Insira o Valor de x1");
		x1=Ler.nextDouble();
		System.out.println("Insira o Valor de x2");
		x2=Ler.nextDouble();
		System.out.println("Insira o Valor de y1");
		y1=Ler.nextDouble();
		System.out.println("Insira o Valor de y2");
		y2=Ler.nextDouble();
		D = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.printf("A Distancia entre estes é de: %8.2f",D);
	}

}
