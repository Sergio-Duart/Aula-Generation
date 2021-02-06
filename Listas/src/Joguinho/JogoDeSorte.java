package Joguinho;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JogoDeSorte {
	

	public static void main(String[] args) {
		int P=0,X=0,J=0;
		Scanner Ler = new Scanner(System.in);
		
		Set<Participantes> Jogador = new HashSet<Participantes>();
//		Participantes J1 = new Participantes ("serginho",10);
//		Participantes J2 = new Participantes ("ana",5);
		String J1 = "sergio";
		String J2 = "ana";
		Jogador.add(J1);
		Jogador.add(J2);
		
		
		System.out.println(Jogador);

/*		while (X!=0) {
			
		switch (P) {
		
		case 1: 
		
			
			
		
		}
		}*/
		
	}

}
