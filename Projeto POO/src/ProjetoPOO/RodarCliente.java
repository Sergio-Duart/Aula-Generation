package ProjetoPOO;

import java.util.Scanner;

public class RodarCliente {

	public static void main(String[] args) {
		Scanner Ler = new Scanner (System.in);
		
		Cliente Cobaia = new Cliente ();
		System.out.println("Digite seu nome");
		Cobaia.setNome(Ler.next());
		System.out.println("Digite sua idade");
		Cobaia.setIdade(Ler.nextInt());
		System.out.println("Qual Genero voc� se identifica?");
		Cobaia.setGenero(Ler.next());
		System.out.println("Prefere filmes ou esportes?");
		Cobaia.setHobby(Ler.next());
		System.out.println("\n\n\nMeus parabens "+Cobaia.getNome()+".\n\nVoc� tem "+Cobaia.getIdade()+" anos.\nVoc� se identifica como "+Cobaia.getGenero()+".\nE sua preferencia � de "+Cobaia.getHobby()+".\n\nMeus parabens.");
			
	}
}
