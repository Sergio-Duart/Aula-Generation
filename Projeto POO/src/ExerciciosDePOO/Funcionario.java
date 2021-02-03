package ExerciciosDePOO;

public class Funcionario {
	private String nome;
	private String genero;
	private String setor;
	private float preco;

	
	public Funcionario (String nome,String genero, String setor,float preco) {
		this.nome = nome;
		this.genero = genero;
		this.setor = setor;
		this.preco = preco;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getSetor() {
		return setor;
	}


	public void setSetor(String setor) {
		this.setor = setor;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}
}
