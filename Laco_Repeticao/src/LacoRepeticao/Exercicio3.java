package LacoRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		int idade=0,jov=0,vel=0;

		System.out.println("Pergunta 3\n\nSolicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos.\nO programa termina quando idade for =(-99).(Enquanto)");
		while (idade != -99) {
			System.out.println("\nEntre com uma idade:");
			idade = Ler.nextInt();
			if (idade<=0) {
				System.out.println("\nPlease...    entre com uma idade real...");
			}
			else if (idade>0 && idade<22) {
				jov++;
				System.out.println("\nÉs ainda um pequeno padawan em treinamento...");
			}
			else if (idade>49 && idade<=100) {
				vel++;
				System.out.println("\nBem vindo ao grupo.. Mestre Jedi...");
			}
			else if (idade>100) {
				vel++;
				System.out.println("\nParabens..  Você esta no grupo de '25' anos...");
			}
			else {
				System.out.println("\nMuito velho para ser um Padawan..  e muita pouca esperiencia de vida para ser Jedi..\nApenas continue seu caminho...");
			}
		}
		System.out.println("\n\nPesquisa encerrada..   segue resultados:\nTotal de pessoas com menos de 21 Anos: "+jov+"\nTotal de pessoas com mais de 50 anos :"+vel);
	}
}
