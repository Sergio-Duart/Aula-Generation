package Exercicio1;

public class Geral {

	public static void main(String[] args) {

		Pessoa sergio = new Pessoa ("Sérgio",29);
		Fornecedor Forn = new Fornecedor ("Bruce",42,500,10);
		Empregado empr = new Empregado ("Alfred",75,"Mordomo",1000,(float)0.05);
		Administrador admin = new Administrador ("BatCave",55,300);
		Operario oper = new Operario ("SuperShock",16,200,(float) 0.1);
		Vendedor vend = new Vendedor ("Clark",40,500,(float) 0.05);
		
		System.out.printf("Pessoa: "+sergio.getNome()+" - "+sergio.getIdade()+" Anos");
		System.out.printf("\n\nFornecedor: "+Forn.getNome()+" - "+Forn.getIdade()+" Anos\n\tSaldo Anterior "+Forn.getValCre()+"\n\tSaldo Devedor "+Forn.getValDiv()+"\n\tValor Atual "+Forn.getObtSal());
		System.out.printf("\n\nEmpregado: "+empr.getNome()+" - "+empr.getIdade()+" Anos\n\tSetor: "+empr.getCodSet()+"\n\tTem Sálario de: "+empr.getSalBas()+"\n\tCom impostos de "+empr.getImp()+"\n\tRecebendo no final um total de: "+empr.getCalSal());
		System.out.printf("\n\nAdministrador: "+admin.getNome()+"\n\tAjuda de custo: "+admin.getAjuDCus());
		System.out.printf("\n\nOperario: "+oper.getNome()+" - "+oper.getIdade()+"\n\tProduzio um total de: "+oper.getValPro()+"\n\tE o seu Ganho de comissão foi de: "+oper.getCom());
		System.out.printf("\n\nVendedor: "+vend.getNome()+" - "+vend.getIdade()+"\n\tProduzio um total de: "+vend.getValVen()+"\n\tE o seu Ganho de comissão foi de: "+vend.getAtrCom());
	}
}
