package Aula1;

import java.util.Scanner;

public class Exercicios8 {
	public static void main(String agrs[]) {
		Scanner Ler = new Scanner(System.in);
		double fabr,distr,imp,custo;
		
		System.out.println("Pergunta 8:\nO custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).\nSupondo que a percentagem do distribuidor seja de 28% e os impostos de 45%\nescrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.");
		System.out.println("Escreva qual o custo de fabrica do Veiculo:");
		fabr = Ler.nextDouble();
		distr=0.28;
		imp=0.45;
		custo=(fabr+(fabr*distr)+(fabr*imp));
		System.out.println("O custo ao consumidor deste veiculo ser� de:"+custo);
	}

}
