package ExerciciosDePOO;

public class Aviao {
	private String nome;
	private String classe;
	private String cor;		
	
	public Aviao (String nome,String classe, String cor) {
		this.nome = nome;
		this.classe = classe;
		this.cor = cor;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
