package Exercicio1;

public class Empregado extends Pessoa {
	
	private String CodSet;
	private float SalBas,Imp,CalSal;
	
	public Empregado (String nome,int idade,String CodSet,float SalBas,float Imp) {
		super(nome,idade);
		this.CodSet = CodSet;
		this.SalBas = SalBas;
		this.Imp = Imp;
		this.CalSal = SalBas-(SalBas*Imp);
	}

	public String getCodSet() {
		return CodSet;
	}

	public void setCodSet(String codSet) {
		CodSet = codSet;
	}

	public float getSalBas() {
		return SalBas;
	}

	public void setSalBas(float salBas) {
		SalBas = salBas;
	}

	public float getImp() {
		return Imp;
	}

	public void setImp(float imp) {
		Imp = imp;
	}

	public float getCalSal() {
		return CalSal;
	}

	public void setCalSal(float calSal) {
		CalSal = calSal;
	}
}