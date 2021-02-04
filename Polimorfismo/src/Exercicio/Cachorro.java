package Exercicio;

public class Cachorro extends Animal {

	public String getNome() {
		return "Cachorrinho chamado: "+super.getNome();
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
