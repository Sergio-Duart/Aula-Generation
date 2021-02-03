package ExerciciosDePOO;

public class Conta_Bancaria {
	private String nome;
	private int conta;
	private String cidade;
	private float preco;

	
	public Conta_Bancaria (String nome,int conta,String cidade,float preco) {
		this.nome = nome;
		this.conta = conta;
		this.cidade = cidade;
		this.preco = preco;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getConta() {
		return conta;
	}


	public void setConta(int conta) {
		this.conta = conta;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}
}
