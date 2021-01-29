package LacoRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		int A=0,C=0,num,total=0,media=0;

		System.out.println("Pergunta 6\n\nEscrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3.\nPara sair digitar 0(zero).(DO.. While)");
			do {
				System.out.println("Insira um numero");
				num = Ler.nextInt();
				C++;
				if (num%3==0){
					total=total+num;
					A++;
				}
			}while (num!=0);
		media = total/3;	
		System.out.println("Entre todos os "+C+" numeros que você informou..   apenas "+A+" São divisiveis por 3..\ndando uma média de "+media);
	}
}
