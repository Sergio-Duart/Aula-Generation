programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{


		inteiro num,idade,jovem,tiozao,avos,par,impar,N,fem,mas,out,cal,ner,agr,genero,estado,femner,masagr,outcal,nerv,calm,valor,total,media
		cadeia enter
		
//Pergunta 1		
		escreva("Pergunta1\n\nInformar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.(Para)")
		para (num=1000;num<=1999;num++){
			se ((num%11)==5){
				escreva("\n",num)	
			}
		}
		escreva("\n\nClique em Enter para o Proximo exercicio:")
		leia(enter)
		limpa()
		
//Pergunta 2		
		escreva("\nPergunta2\n\nLer 10 números e imprimir quantos são pares e quantos são ímpares.(Para)\n")
		par=0
		impar=0
		para (num=0;num<=9;num++){
			escreva("Entre com o Valor do Numero: ")
			leia(N)
			se ((N%2)==0){
				par++
			}
			senao {
				impar++
			}
		}
		escreva("\n Entre os ",num," que você digitou:\n ",par," São Numeros Pares, e ",impar," São numeros Impar.")
		escreva("\n\nClique em Enter para o Proximo exercicio:")
		leia(enter)
		limpa()		

//Pergunta 3		
		escreva("\nPergunta3\n\nSolicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.\nTotal de pessoas com mais de 50 anos. O programa termina quando idade for =-99.(Enquanto)\n")
		idade=0
		jovem=0
		tiozao=0
		avos=0
		enquanto (idade!=-99){
			escreva(" Entre com uma idade: ")
			leia(idade)
			se (idade<=0){
				escreva("\n Por favor, entre com uma idade real (Numeros positivos):")
			}			
			se (idade<21){
				jovem++
			}
			senao se (idade>=21 e idade<=50){
				tiozao++
			}	
			senao {
				avos++
			}
		}
		escreva("\n  Temos um total de: ",jovem," no grupo de Jovens Adultos (Abaixo de 21 anos)\n  Temos um total de: ",tiozao," na categoria de tios (entre 21-50 anos)\n  Temos um total de: ",avos," no grupo de '25 anos' (acima de 50 anos)\n\n Para encerrar a contagem, digite -99")
		escreva("\n\nClique em Enter para o Proximo exercicio:")
		leia(enter)
		limpa()
//Pergunta 4		
		escreva("\nPergunta4\n\nUma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.\nPara tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),\ne as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).\nPede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:\n\no número de pessoas calmas;\no número de mulheres nervosas;\no número de homens agressivos;\no número de outros calmos;\no número de pessoas nervosas com mais de 40 anos;\no número de pessoas calmas com menos de 18 anos.(Enquanto)")
		escreva("\n\n\n Por motivos de tempo e retrabalho, programei para as informações se preencherem automaticamente de forma aleatória\n obs: Para preencher de forma manual, Basta apagar as barras '//' no script")
		escreva("\n\n\n\nClique em Enter para o Proximo exercicio:")
		leia(enter)
		num=0
		idade=0
		fem=0
		mas=0
		out=0
		cal=0
		ner=0
		agr=0
		femner=0
		masagr=0
		outcal=0
		nerv=0
		calm=0
		enquanto (num<150){
//			escreva("\nQual a sua idade: ")
//			leia(idade)
			idade=Util.sorteia(1, 90)
//			escreva("Qual Genero você se identifica:\n 1-Feminino\n 2-Masculino\n 3-Outros")
//			leia(genero)
			genero=Util.sorteia(1, 3)
			escolha (genero){
				caso 1: fem++ pare		
				caso 2: mas++ pare
				caso 3: out++ pare	
			}
//			escreva("\nQual das opções você se identifica:\n 1-Calma\n 2-Nervoso\n 3-Agressivo")
//			leia(estado)
			estado=Util.sorteia(1, 3)
			escolha (estado){
				caso 1: cal++ pare
				caso 2: ner++ pare
				caso 3: agr++ pare
			}
			se (genero==1 e estado==2){
				femner++
			}
			se (genero==2 e estado==3){
				masagr++
			}
			se (genero==3 e estado==1){
				outcal++
			}
			se (idade>40 e estado==2){
				nerv++
			}		
			se (idade<18 e estado==1){
				calm++
			}										
			num++	
		}
		escreva("\n\n\n Conclusão:\n\n ",cal, "número de pessoas calmas;\n ",femner," número de mulheres nervosas;\n ",masagr," número de homens agressivos;\n ",outcal," número de outros calmos;\n ",nerv," número de pessoas nervosas com mais de 40 anos;\n ",calm," número de pessoas calmas com menos de 18 anos;")
		escreva("\n\nClique em Enter para o Proximo exercicio:")
		leia(enter)
		limpa()

//Pergunta 5		
		escreva("\nPergunta5\n\nCrie um programa que leia um número do teclado até que encontre um número igual a zero.\nNo final, mostre a soma dos números digitados.(faca-Enquanto)\n\n")
		num=0
		valor=0
		total=0
		faca {
			escreva(" Entre com um valor para somar com o proximo: ")
			leia(valor)
			num++
			total=total+valor		
		}
		enquanto (valor!=0)
		escreva("\n\n o Total de seus ",num," numeros preenchidos é de: ",total)

		escreva("\n\nClique em Enter para o Proximo exercicio:")
		leia(enter)
		limpa()
		
//Pergunta 6
		escreva("\nPergunta6\n\nEscrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3.\nPara sair digitar 0(zero).(faca-Enquanto)\n\n")
		num=0
		valor=0
		total=0
		media=0
		faca {
			escreva(" Entre com um valor: ")
			leia(valor)
			se (valor>0 e valor%3==0){
				num++
				total=total+valor			
			}
		}
		enquanto (valor!=0)
		escreva("\n\n Conclusão:\n\n Entre todos os valores inseridos, apenas ",num," são divisiveis por 3.\n Dando um total de ",total," e média de: ",media=total/num)
		escreva("\n\nClique em Enter finalizar o exercicio")
		leia(enter)
		limpa()
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1932; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */