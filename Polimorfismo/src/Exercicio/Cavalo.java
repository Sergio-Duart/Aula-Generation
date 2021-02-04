package Exercicio;

public class Cavalo extends Animal {

	public String getNome() {
		return "Corcel chamado: "+super.getNome();
	}
	public String getSom() {
		return super.getSom();
	}
	public String getWalk() {
		return super.getWalk();
	}
	public int getIdade() {
		return super.getIdade();
	}
}
