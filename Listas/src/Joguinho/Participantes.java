package Joguinho;

public class Participantes {

	private String nome;
	private int pontos,total,dado1,dado2,totalGeral;
	
	public Participantes (String nome,int total) {
		this.nome = nome;
		
	}
	
	public void Pontos (int dado1,int dado2) {
		this.dado1 = dado1;
		this.dado2 = dado2;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getDado1() {
		return dado1;
	}

	public void setDado1(int dado1) {
		this.dado1 = dado1;
	}

	public int getDado2() {
		return dado2;
	}

	public void setDado2(int dado2) {
		this.dado2 = dado2;
	}

	public int getTotalGeral() {
		return totalGeral;
	}

	public void setTotalGeral(int totalGeral) {
		this.totalGeral = totalGeral;
	}
	
	
}
