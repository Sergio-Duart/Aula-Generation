package ExerciciosDePOO;

public class Paciente {
	private String nome;
	private String genero;			
	private String sintoma;
	private String estado;		
	
	
	public Paciente (String nome,String genero,String sintoma,String estado) {
		this.nome = nome;
		this.genero = genero;
		this.sintoma = sintoma;
		this.estado = estado;
		
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


	public String getSintoma() {
		return sintoma;
	}


	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
}
