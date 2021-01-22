programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		
		inteiro dia,mes,ano,tdias,dia1,mes1,ano1,seg,min,hrs,tseg,A4,B4,C4,R4,S4,D4,not1,not2,not3
		real media,X1,X2,Y1,Y2,A,B,C,D,EE,F,X7,Y7,custfa,custco,percdi,imp
		cadeia enter
		
//Pergunta 1
		escreva("\nPergunta 1:\nFaça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.")
		escreva("\nEntre com a sua data de Nascimento (Dia): ")
		leia(dia)
		escreva("\nEntre com a sua data de Nascimento (Mês): ")
		leia(mes)
		escreva("\nEntre com a sua data de Nascimento (Ano): ")
		leia(ano)
		escreva("\nVoce esta respirando por conta própria a ",(ano*365)+(mes*30)+(dia*1)," Dias")
		escreva("\n\n Clique em enter para prosseguir")
		leia(enter)
		
//Pergunta 2
		escreva("\n\nPergunta 2:\nFaça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.")
		escreva("\nDigite uma quantidade de dias: ")
		leia(tdias)
		escreva("\n\nIsso vai dar "+tdias/365+" Anos "+tdias%365+" Meses "+tdias%365%30+" Dias.")
		escreva("\n\n Clique em enter para prosseguir")
		leia(enter)
			
//Pergunta 3
		escreva("\n\nPergunta 3:\nFaça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o\nexpresso em horas, minutos e segundos.")
		escreva("\nDigite aqui o tempo do evento em Segundos: ")
		leia(tseg)
		escreva("\n\nIsso daria um total de "+(tseg/60)/60+" Horas "+(tseg/60)%60+" Minutos "+(tseg%60)%60+" Segundos.")
		escreva("\n\n Clique em enter para prosseguir")
		leia(enter)
		
//Pergunta 4
		escreva("\n\nPergunta 4:\nEscreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:\nD4=(R+S)/2, onde R=(A+B)^2 e S=(B+C)^2")
		escreva("\nValor de A: ")
		leia(A4)
		escreva("Valor de B: ")
		leia(B4)
		escreva("Valor de C: ")
		leia(C4)
		escreva("\nO valor de R é: ",R4=(Matematica.potencia(A4+B4, 2)))
		escreva("\nO Valor de S é: ",S4=(Matematica.potencia(B4+C4, 2)))
		escreva("\n\nConclusão, o valor de D é: ",D4=(Matematica.potencia(R4+S4, 2)))
		escreva("\n\n Clique em enter para prosseguir")
		leia(enter)

//Pergunta 5
		escreva("\n\nPergunta 5:\nFaça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é\nponderada e que o peso das notas é: 2,3 e 5, respectivamente.")
		escreva("\nDigite a nota da prova de peso 2: ")
		leia(not1)
		escreva("Digite a nota da prova de peso 3: ")
		leia(not2)
		escreva("Digite a nota da prova de peso 5: ")
		leia(not3)
		escreva("\nA Média deste aluno é de: ",media=((2*not1)+(3*not2)+(5*not3))/(2+3+5))
		escreva("\n\n Clique em enter para prosseguir")
		leia(enter)

//Pergunta 6
		escreva("\n\nPergunta 6:\nConstrua um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2)\nescreva a distância entre eles. A fórmula que efetua tal cálculo é: D=raiz quadrada de (X2-X1)^2 + (Y2-Y1)^2")
		escreva("\nDigite aqui o Valor de X1: ")
		leia(X1)
		escreva("Digite aqui o Valor de X2: ")
		leia(X2)
		escreva("Digite aqui o Valor de Y1: ")
		leia(Y1)
		escreva("Digite aqui o Valor de Y2: ")
		leia(Y2)
		escreva("\n\nA distancia entre estes pontos é: ",Matematica.arredondar(Matematica.raiz(Matematica.potencia(X2-X1, 2)+Matematica.potencia(Y2-Y1, 2), 2.0), 2))
		escreva("\n\n Clique em enter para prosseguir")
		leia(enter)

//Pergunta 7
		escreva("\n\nPergunta 7:\nUm sistema de equações lineares do tipo: AX+BY=C, DX+EY=F, pode ser resolvido segundo mostrado abaixo:\nX=(CE-BF)/(AE-BD) Y=(AF-CD)/(AE-BD)\nEscreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.")
		escreva("\nDigite o Valor de A: ")
		leia(A)
		escreva("Digite o Valor de B: ")
		leia(B)
		escreva("Digite o Valor de C: ")
		leia(C)
		escreva("Digite o Valor de D: ")
		leia(D)
		escreva("Digite o Valor de E: ")
		leia(EE)
		escreva("Digite o Valor de F: ")
		leia(F)
		escreva("\nValor de X é: ",Matematica.arredondar(X7=((C*EE)-(B*F))/((A*EE)-(B*D)), 2))
		escreva("\nValor de Y é: ",Matematica.arredondar(Y7=((A*F)-(C*D))/((A*EE)-(B*D)), 2))
		escreva("\n\n Clique em enter para prosseguir")
		leia(enter)

//Pergunta 8
		escreva("\n\nPergunta 8:\nO custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos\nimpostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%\nescrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.")
		escreva("\nQual seria o custo de Fábrica do veiculo: ")
		leia(custfa)
		escreva("\nOs custos adicionais são o Percentual do distribuidor: ",percdi=0.28," E o imposto: ",imp=0.45)
		escreva("\nO Custo ao consumidor deste veiculo sairia em: ",custco=(custfa+(custfa*percdi)+(custfa*imp)))

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4223; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */