package ExerciciosDePOO;

public class Produto_Eletronico {
	private String nome;
	private String funcao;
	private float preco;
	private String marca;
	private String cor;

	
	public Produto_Eletronico (String nome,String funcao,float preco,String marca,String cor) {
		this.nome = nome;
		this.funcao = funcao;
		this.preco = preco;
		this.marca = marca;
		this.cor = cor;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getFuncao() {
		return funcao;
	}


	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}
}
