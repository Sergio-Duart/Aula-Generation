package LacoRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		int num=0,agr=0,ner=0,idade=0,cal=0,femner=0,masagr=0,outcal=0,nerv=0,infcal=0,fem=0,mas=0,out=0,gen=0,estad=0;
		
		while (num<150) {
			System.out.println("Pergunta 4\n\nUma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado:\nidade, sexo (1-feminino / 2-masculino / 3-Outros),e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).\nPede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:\n\no n�mero de pessoas calmas;\no n�mero de mulheres nervosas;\no n�mero de homens agressivos;\no n�mero de outros calmos;\no n�mero de pessoas nervosas com mais de 40 anos;\no n�mero de pessoas calmas com menos de 18 anos.(Enquanto)");
			System.out.printf("\nEntre com sua idade: ");
//			idade = Ler.nextInt();
			idade = (int) (1+Math.random()*80);			
			System.out.println("\nQual Genero voc� se identifica?\n 1 - Feminino\n 2 - Masculino\n 3 - Outros");
//			gen = Ler.nextInt();
			gen = (int) (1+Math.random()*3);
			switch (gen) {
			case 1:fem++; break;
			case 2:mas++;break;
			case 3:out++;break;
			default: System.out.printf("Entre com um valor v�lido");
//			gen = Ler.nextInt();
			gen = (int) (1+Math.random()*3);
			}
			System.out.println("\nQual estado emocional voc� se encontra?\n 1 - Calma\n 2 - Nervoso\n 3 - Agressivo");
//			estad = Ler.nextInt();
			estad = (int) (1+Math.random()*3);
			switch (estad) {
			case 1:cal++;break;
			case 2:ner++;break;
			case 3:agr++;break;
			default: System.out.printf("Entre com um valor v�lido");
//			estad = Ler.nextInt();
			estad = (int) (1+Math.random()*3);
			}
				if (gen == 1 && estad == 2) {
					femner++;
				}
				if (gen == 2 && estad == 3) {
					masagr++;
				}
				if (gen == 3 && estad == 1) {
					outcal++;
				}
				if (idade>40 && estad == 2) {
					nerv++;
				}
				if (idade<18 && estad == 1) {
					infcal++;
				}
		num++;
		}
		System.out.println("N�mero de pessoas calmas: "+cal);
		System.out.println("N�mero de mulheres nervosas: "+femner);
		System.out.println("N�mero de homens agressivos: "+masagr);
		System.out.println("N�mero de outros calmos: "+outcal);
		System.out.println("N�mero de pessoas nervosas com mais de 40 Anos: "+nerv);
		System.out.println("N�mero de pessoas calmas com menos de 18 Anos: "+infcal);
	}
}
