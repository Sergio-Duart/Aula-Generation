package Laco_Condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		int idade;
		
		System.out.println("PErgunta 3\n\nFa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:");
		idade = Ler.nextInt();
		if  (idade>=10&&idade<=14) {
			System.out.println("Voc� esta na Categoria Infantil.");
		}
		else if  (idade>=15&&idade<=17) {
			System.out.println("Voc� esta na Categoria Juvenil.");
		}
		else if  (idade>=18&&idade<=25) {
			System.out.println("Voc� esta na Categoria Adulto.");
		}
		else {
			System.out.println("Voc� n�o faz parte de nossas categorias.");
		}
	}
}
