package Aula1;

import java.util.Scanner;

public class Exercicios5 {
	
	public static void main(String agrs[]) {
		
		Scanner Ler = new Scanner(System.in);
		float n1,n2,n3,media;
		
		System.out.println("Pergunta 5: Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,\nrespectivamente.");
		System.out.println("Insira a Primeira Nota: ");
		n1=Ler.nextFloat();
		System.out.println("Insira a Segunda Nota: ");
		n2=Ler.nextFloat();
		System.out.println("Insira a Terceira Nota: ");
		n3=Ler.nextFloat();
		System.out.println("\n A M�dia final deste aluno � de: "+(media=((2*n1)+(3*n2)+(5*n3))/(2+3+5)));
		
		
	}

}
