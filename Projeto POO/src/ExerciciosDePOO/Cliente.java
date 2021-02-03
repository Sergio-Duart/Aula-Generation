package ExerciciosDePOO;

	public class Cliente {
		private String nome;
		private String apelido;
		private int idade;
		private String genero;
		private String hobby;
	
		
		public Cliente (String nome,String apelido,int idade,String genero,String hobby) {
			this.nome = nome;
			this.apelido = apelido;
			this.idade = idade;
			this.genero = genero;
			this.hobby = hobby;
			
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getApelido() {
			return apelido;
		}


		public void setApelido(String apelido) {
			this.apelido = apelido;
		}


		public int getIdade() {
			return idade;
		}


		public void setIdade(int idade) {
			this.idade = idade;
		}


		public String getGenero() {
			return genero;
		}


		public void setGenero(String genero) {
			this.genero = genero;
		}


		public String getHobby() {
			return hobby;
		}


		public void setHobby(String hobby) {
			this.hobby = hobby;
		}
	}
