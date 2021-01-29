package LacoRepeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Pergunta 1\n\nInformar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.(For)");
		for (int num=1000;num<=1999;num++) {
			if ((num%11)==5) {
				System.out.println(num);
			}
		}
	}
}
