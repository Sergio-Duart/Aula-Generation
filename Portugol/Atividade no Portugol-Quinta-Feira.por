programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro A[6],soma,N,par,impar,spar,simpar,M[3][3],l,c,Mi[2][2],Ma[2][2],Me[2][2],li,ci,la,ca,le,ce
		cadeia enter
		
//Pergunta 1		
		escreva("Pergunta 1:\n\nFaça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos:\n (A) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7\n (B) Armazene em uma variável inteira a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma.\n (C) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.\n (D) Mostre na tela cada valor do vetor A, um em cada linha.")
		soma=0
		A[0]=1
		A[1]=0
		A[2]=5
		A[3]=-2
		A[4]=-5
		A[5]=7
		escreva("\n\n As somas das posições 0, 1 e 5 são: ",soma=A[0]+A[1]+A[5])
		A[4]=100
		escreva("\n\n Os valores de cada Vetor A são:\n 0: ",A[0]," \n 1: ",A[1]," \n 2: ",A[2]," \n 3: ",A[3]," \n 4: ",A[4]," \n 5: ",A[5])
		escreva("\n\nClique em Enter para o Próximo exercicio.")
		leia(enter)
		limpa()
		
//Pergunta 2		
		escreva("\nPergunta 2:\n\nFaça um programa que receba 6 números inteiros e mostre:\n * Os números pares digitados;\n * A soma dos números pares digitados;\n * Os números ímpares digitados;\n * A quantidade de números ímpares digitados.")
		soma=0
		par=0
		impar=0
		spar=0
		simpar=0
		escreva("\n\n Para evitar ficar preenchendo manualmente, estarei utilizando a Biblioteca Util Sorteia.\n Para mudar para o Manual, basta tirar as barras de comentario no Script do Programa. E Comentar a linha do Util Sorteia\n")
		para (N=0;N<6;N++){
//			escreva("\n\nEntre com um número: ")
//			leia(A[N])
			A[N]=Util.sorteia(0, 10)
			se (A[N]%2==0){
				spar=spar+A[N]
				escreva("\n Este Valor ",A[N]," é Par")
			}
			senao {
				simpar++
				escreva("\n Este Valor ",A[N]," é Impar")
			}
		}
		escreva("\n\nClique em Enter para o Próximo exercicio.")
		leia(enter)
		limpa()

//Pergunta 3		
		escreva("\nPergunta 3:\n\nLeia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.")
		soma=0
		N=0
		escreva("\n\n Para evitar ficar preenchendo manualmente, estarei utilizando a Biblioteca Util Sorteia.\n Para mudar para o Manual, basta tirar as barras de comentario no Script do Programa. E Comentar a linha do Util Sorteia")
		para (l=0;l<3;l++){
			para (c=0;c<3;c++){
//				escreva("\n\nEntre com um valor entre 0 a 20")
//				leia(M[l][c])
				M[l][c]=Util.sorteia(0, 20)
				se (M[l][c]>10){
					soma=soma+M[l][c]
					N++
				}
			}
		}
		escreva("\n\nResposta:\nEntre os 9 valores digitador na Matriz, ",N," São maiores de 10. Totalizando ",soma," no total")
		escreva("\n\nClique em Enter para o Próximo exercicio.")
		leia(enter)
		limpa()

//Pergunta 4
//		escreva("\nPergunta 4:\n\nFaça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:\n (1) somar as duas matrizes\n (2) subtrair a primeira matriz da segunda \n (3) adicionar uma constante as duas matrizes\n (4) imprimir as matrizes \nNas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido\ne o resultado da adição da constante deve ser armazenado na própria matriz.")
//		escreva("\n\n Para evitar ficar preenchendo manualmente, estarei utilizando a Biblioteca Util Sorteia.\n Para mudar para o Manual, basta tirar as barras de comentario no Script do Programa. E Comentar a linha do Util Sorteia")
//		para (li=0;li<2;li++){
//			para (ci=0;ci<2;ci++){
//				escreva("\n\nEntre com um valor:")
//				leia(Mi[li][ci])
//				Mi[li][ci]=Util.sorteia(0, 10)				
//			}
//		}
//		para (la=0;la<2;la++){
//			para (ca=0;ca<2;ca++){
//				escreva("\n\nEntre com um valor:")
//				leia(Ma[la][ca])
//				Ma[la][ca]=Util.sorteia(0, 10)				
//			}
//		}


		
//		escreva("\n\nClique em Enter para finalizar.")
//		leia(enter)
//		limpa()
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2443; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */