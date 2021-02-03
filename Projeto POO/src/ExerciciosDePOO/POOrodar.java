package ExerciciosDePOO;

public class POOrodar {

	public static void main(String[] args) {
		
		
//Cliente		
		
		Cliente cli = new Cliente ("Bruce Wayne","Batman",42,"Heroi","Salvar Gotham City");
		System.out.printf("Cliente:\n\n\t"+cli.getNome()+"\n\t"+cli.getApelido()+"\n\t"+cli.getIdade()+"\n\t"+cli.getGenero()+"\n\t"+cli.getHobby());
		
//Aviao
		Aviao avi = new Aviao ("Foguete","Espacial","Prateado");
		System.out.printf("\n\nAviao:\n\t"+avi.getNome()+"\n\t"+avi.getClasse()+"\n\t"+avi.getCor());
		
//Produto Eletronico		
		Produto_Eletronico prod = new Produto_Eletronico ("Fogão","Cozinhar",550,"Marca Dá","Preto");
		System.out.printf("\n\nProduto Eletrônico:\n\t"+prod.getNome()+"\n\t"+prod.getFuncao()+"\n\t"+prod.getPreco()+"\n\t"+prod.getMarca()+"\n\t"+prod.getCor());
		
//Funcionario
		Funcionario func = new Funcionario ("Zé","homi","Construção",300);
		System.out.printf("\n\nFuncionario:\n\t"+func.getNome()+"\n\t"+func.getGenero()+"\n\t"+func.getSetor()+"\n\t"+func.getPreco());
		
//Patinete
		Patinete pat = new Patinete ("Turbostatic","Hotweels","Laranja");
		System.out.printf("\n\nPatinete:\n\t"+pat.getNome()+"\n\t"+pat.getMarca()+"\n\t"+pat.getCor());
		
//Conta Bancaria
		Conta_Bancaria cont = new Conta_Bancaria ("Itau",55223,"Belo Horizonte",1200);
		System.out.printf("\n\nConta Bancaria:\n\t"+cont.getNome()+"\n\t"+cont.getConta()+"\n\t"+cont.getCidade()+"\n\t"+cont.getPreco());
		
//Paciente
		Paciente pac = new Paciente ("Mrs Burns","Muito Velho","Todas","Milagrosamente Vivo");
		System.out.printf("\n\nPaciente:\n\t"+pac.getNome()+"\n\t"+pac.getGenero()+"\n\t"+pac.getSintoma()+"\n\t"+pac.getEstado());
		
	}
}
