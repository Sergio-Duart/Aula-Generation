package Exercicio1;

public class Vendedor extends Pessoa {
	
	private float ValVen, AtrCom;
	
	public Vendedor (String nome,int idade,float ValVen,float AtrCom) {
		
		super (nome,idade);
		this.ValVen = ValVen;
		this.AtrCom = ValVen*AtrCom;
	}
	public float getValVen() {
		return ValVen;
	}

	public void setValVen(float valVen) {
		ValVen = valVen;
	}

	public float getAtrCom() {
		return AtrCom;
	}

	public void setAtrCom(float atrCom) {
		AtrCom = atrCom;
	}
}
