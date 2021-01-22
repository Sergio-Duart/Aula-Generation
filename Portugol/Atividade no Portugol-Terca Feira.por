programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{

		inteiro num1,num2,num3,num4,quad1,quad2,quad3,quad4,num,idade,Numero
		real P,E,M,N,ind,TA,TB,TH
		cadeia enter,C

//Pergunta 1		
		escreva("Pergunta 1:\nJoão Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.\nToda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos)\ndeve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates)\ne verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar.\nCaso contrário mostrar tais variáveis com o conteúdo ZERO.")
		escreva("\n\n Entre com o total de quilos de tomates: ")
		leia(P)
		M=4.00
		E=P-50
		se (P>50){
			escreva("\n\nLimite de peso excedido,Será gerado Multa de: ",E*M,"Reais")
		}
		senao {
			escreva("Peso dentro do estabelecido, Pode prosseguir.")
		}
		escreva("\n\nClique Enter para a proxima pergunta")
		leia(enter)
		
//Pergunta 2
		escreva("\nPergunta 2:\nElabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário.\nE calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso de\npagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00.\nNo final do processamento imprimir o salário total e o salário excedente.")
	 	escreva("\n\n Nome do Colaborador: ")
		leia(C)
		escreva("\nHoras trabalhadas deste colaborador: ")
		leia(N)
		E=N-50
		se (N>50){
			escreva("\n\n O salario do operário ",C," será de: ",(50*10)+(E*20)," Reais")
		}
		senao {
			escreva("\n\n O salario do operário ",C," será de: ",N*10," Reais")
		}
		escreva("\n\nClique Enter para a proxima pergunta")
		leia(enter)

//Pergunta 3
		escreva("\nPergunta 3:\nDesenvolva um sistema em que:\n Leia 4 (quatro) números;\n Calcule o quadrado de cada um;\n Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;\n Caso contrário, imprima os valores lidos e seus respectivos quadrados.")
		escreva("\n Insira o Primeiro numero: ")
		leia(num1)
		escreva(" Insira o Segundo numero: ")
		leia(num2)
		escreva(" Insira o Terceiro numero: ")
		leia(num3)
		escreva(" Insira o Quarto numero: ")
		leia(num4)
		quad1=Matematica.potencia(num1, 2)
		quad2=Matematica.potencia(num2, 2)
		quad3=Matematica.potencia(num3, 2)
		quad4=Matematica.potencia(num4, 2)
		se (quad3>=1000){
			escreva("\nO valor final do terceiro numero é: ",quad3,".")
		}
		senao {
			escreva("\n O Valor do Primeiro Numero é: ",quad1,".\n O Valor do Segundo Numero é: ",quad2,".\n O Valor do Terceiro Numero é: ",quad3,".\n O Valor do Quarto Numero é: ",quad4,".")
		}
		escreva("\n\nClique Enter para a proxima pergunta")
		leia(enter)

//Pergunta 4
		escreva("\nPergunta 4:\nFaça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.")
		escreva("\n\n Entre com um numero: ")
		leia(num)
		se (num<0){
			num=(num-num)-num
			escreva("\n Seu numero é Negativo")		
		}
		senao {
			escreva("\n Seu numero é Positivo")
		}
		se ((num%2)>0){
			escreva("\n Seu numero inserido: é IMPAR")
		}
		senao {
			escreva("\n Seu numero inserido: é PAR")			
		}
		escreva("\n\nClique Enter para a proxima pergunta")
		leia(enter)
		
//Pergunta 5
		escreva("\nPergunta 5:\nA Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são altamente poluentes\ndo meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo\nsão intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas\na suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.\nFaça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.")
		escreva("\n\n Escreva qual o índice de Poluição atual:\n Índices de 0.05 até 0.5\n")
		leia(ind)
		se (ind<0.05){
			escreva("\nParece que nem tem poluição indústrial acontecendo.")
		}
		senao se (ind>=0.05 e ind<0.3){
			escreva("\nÍndice de poluição aceitavel, sem restrições")
		}
		senao se (ind>=0.3 e ind<0.4){
			escreva("\nÍndice de poluição acima do esperado, Indústrias do 1º grupo deverão ser suspensas das atividades.")
		}
		senao se (ind>=0.4 e ind<0.5){
			escreva("\nÍndice de poluição acima do esperado, Indústrias do 1º e 2º grupo deverão ser suspensas das atividades.")
		}
		senao se (ind>0.5){
			escreva("\nÍndice de poluição acima do esperado, Todas as Indústrias deverão ser suspensas das atividades.")
		}
		escreva("\n\nClique Enter para a proxima pergunta")
		leia(enter)

//Pergunta 6
		escreva("\nPergunta 6:\nElabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:\n Infantil A = 5 a 7 anos\n Infantil B = 8 a 11 anos\n Juvenil A = 12 a 13 anos\n Juvenil B = 14 a 17 anos\n Adultos = Maiores de 18 anos")
		escreva("Digite aqui a sua Idade: ")
		leia(idade)
		se (idade<5){
			escreva("\n Volte para o berço")
		}
		se (idade>=5 e idade<=7){
			escreva("\n Você esta no grupo Infantil-A")
		}
		se (idade>=8 e idade<=11){
			escreva("\n Você esta no grupo Infantil-B")
		}
		se (idade>=12 e idade<=13){
			escreva("\n Você esta no grupo Juvenil-A")
		}
		se (idade>=14 e idade<=17){
			escreva("\n Você esta no grupo Juvenil-B")
		}
		se (idade>=18){
			escreva("\n Você esta no grupo dos 'tiozoes' adultos")
		}
		escreva("\n\nClique Enter para a proxima pergunta")
		leia(enter)
		
//Pergunta 7
		escreva("\nPergunta 7:\nReceber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero).\nEm caso afirmativo, calcular a área do triângulo.")
		escreva("\n Entre com o valor de Base do triangulo: ")
		leia(TB)
		escreva("\n Entre com o valor de Altura do triangulo: ")
		leia(TH)
		se (TH>0 e TB>0){
			escreva("\n A area do Triangulo é de :",TA=(TB*TH)/2)
		}
		senao se (TB<=0){
			escreva("\n Corrigir o Valor da Base.")
		}
		senao {
			escreva("\n Corrigir o valor da Altura.")
		}
		escreva("\n\nClique Enter para a proxima pergunta")
		leia(enter)

//Pergunta 8
		escreva("\nPergunta 8:\nConstrua um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100,\ncaso contrário imprimi-la com o valor zero.")
		escreva("\n\n Entre com um valor: ")
		leia(Numero)
		se (Numero>100){
			escreva("\n Seu numero é maior de 100, -----seu Numero é -- ",Numero)
		}
		senao {
			escreva("\n Seu numero é menor de 100,   ------estou zerando seu numero -- ",0)
		}
		escreva("\n\nClique Enter para a proxima pergunta")
		leia(enter)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5263; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 8, 54, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */