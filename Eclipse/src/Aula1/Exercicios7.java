package Aula1;

import java.util.Scanner;

public class Exercicios7 {
	public static void main(String agrs[]) {
		Scanner Ler = new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Pergunta 7:\nUm sistema de equações lineares do tipo: AX+BY=C, DX+EY=F, pode ser resolvido segundo mostrado abaixo:\nX=(CE-BF)/(AE-BD) Y=(AF-CD)/(AE-BD)\nEscreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.");
		System.out.println("Digite o valor de A:");
		a = Ler.nextDouble();
		System.out.println("Digite o valor de B:");
		b = Ler.nextDouble();
		System.out.println("Digite o valor de C:");
		c = Ler.nextDouble();
		System.out.println("Digite o valor de D:");
		d = Ler.nextDouble();
		System.out.println("Digite o valor de E:");
		e = Ler.nextDouble();
		System.out.println("Digite o valor de F:");
		f = Ler.nextDouble();
		x=((c*e)-(b*f))/((a*e)-(b*d));
		y=((a*f)-(c*d))/((a*e)-(b*d));
		System.out.println("O Valor de X é: "+x+"\nO Valor de Y é: "+y);
	}

}
