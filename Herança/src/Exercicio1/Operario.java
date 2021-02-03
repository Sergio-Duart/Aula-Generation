package Exercicio1;

public class Operario extends Pessoa{

	private float ValPro,Com;
	
	public Operario (String nome, int idade, float ValPro, float Com) {
		
		super (nome,idade);
		this.ValPro = ValPro;
		this.Com = ValPro*Com;		
	}

	public float getValPro() {
		return ValPro;
	}

	public void setValPro(float valPro) {
		ValPro = valPro;
	}

	public float getCom() {
		return Com;
	}

	public void setCom(float com) {
		Com = com;
	}
}
