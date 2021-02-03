package Exercicio1;

public class Administrador extends Pessoa {
	
	private float AjuDCus;
	
	public Administrador (String nome, int idade, float AjuDCus) {
		super(nome,idade);
		this.AjuDCus = AjuDCus;
	}

	public float getAjuDCus() {
		return AjuDCus;
	}

	public void setAjuDCus(float ajuDCus) {
		AjuDCus = ajuDCus;
	}
}
