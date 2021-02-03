package Exercicio1;

public class Fornecedor extends Pessoa {

	private float ValCre,ValDiv,ObtSal;
	
	public Fornecedor (String nome, int idade, float ValCre, float ValDiv) {
		super(nome,idade);
		this.ValCre = ValCre;
		this.ValDiv = ValDiv;
		this.ObtSal = ValCre - ValDiv;
	}

	public float getValCre() {
		return ValCre;
	}

	public void setValCre(float valCre) {
		ValCre = valCre;
	}

	public float getValDiv() {
		return ValDiv;
	}

	public void setValDiv(float valDiv) {
		ValDiv = valDiv;
	}

	public float getObtSal() {
		return ObtSal;
	}

	public void setObtSal(float obtSal) {
		ObtSal = ObtSal;
	}
	
}
