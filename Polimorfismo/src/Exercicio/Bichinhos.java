package Exercicio;

public class Bichinhos {

	public static void main(String[] args) {
		
		
		Cachorro dog = new Cachorro();
		dog.setNome("Bebe");
		dog.setIdade(16);
		dog.setWalk("Rasteja, pois esta muito velho");
		dog.setSom("faz Au Au (E chora muuito por atenção)");
		Cavalo poney = new Cavalo();
		poney.setNome("Spirit");
		poney.setIdade(30);
		poney.setWalk("Galopa muito rapido");
		poney.setSom("da uns berros bem alto");
		Preguica fofin = new Preguica();
		fofin.setNome("Tina");
		fofin.setIdade(7);
		fofin.setWalk("Sobe em todos lugares possiveis (Bem devagar)");
		fofin.setSom("fala igual bebezinho");
	
		Animal[] bixinhos = new Animal[3];
		bixinhos[0]=dog;
		bixinhos[1]=poney;
		bixinhos[2]=fofin;
		
		for (Animal X:bixinhos) {
			System.out.println(X.getNome()+"\nTem total de: "+X.getIdade()+" Anos\nE ele "+X.getWalk()+"\nE "+X.getSom()+"\n");
		}
	}
}
