package jogo_da_velha;

import java.util.Scanner;

public class JodoDaVelha {

	public static void main(String[] args) {

		/*
	
			JOGO DA VELHA
			
			Contruir um jogo da velha, onde o jogador poder optar por escolher entre [X] ou [O] como sua peca,
			apos realizar sua escolha eles seram submetidos ao tabuleiro que sera atualizado sempre a cada 
			rodada com as pesicoes preenchidas de acordo com suas determinadas escolhas. Para informar a 
			posicao de uma determinada peca, o jogador devera escolher entre linha e coluna a posicao corregata
			de alocacao da peca.
			
		*/

		String pecaJogador;
		int rodada = 9;
		boolean ganhou = false;

		// tabuleiro[linha][coluna]
		char[][] tabuleiro = new char[3][3];
		
		Scanner entradaChar = new Scanner(System.in);
		Scanner entradaInt = new Scanner(System.in);

		// determinando jogador, quem for o jogador [X] sempre inicializara a jogada
		System.out.println("REGRA: Quem escolhe o [X], sempre inicializa as jogadas");
		
		System.out.print("Pessoa 1, escolha sua peca [X] ou [O]: ");
		pecaJogador = entradaChar.nextLine();

		if(pecaJogador.equals("X")){
			System.out.println("Pessoa 2, voce ficou com a peca [O] ");
			
		}else{
			System.out.println("Pessoa 2, voce ficou com a peca [X] ");

		}
		
		for(int i = 0; i < rodada; i++){
			System.out.println("|============================|");
			System.out.println("  JOGA DA VELHA - RODADA "+ (i + 1));
			System.out.println("|============================|");

			System.out.println("\nTABULEIRO");
			
			for(int linha = 0; linha < tabuleiro.length; linha++){
				for(int coluna = 0; coluna < tabuleiro[linha].length; coluna++){
					System.out.print(" ["+ tabuleiro[linha][coluna] +"] ");
					
					if(coluna == 2){
						System.out.println("");	
					}
					
				}	
			}

			int l;
			int c;
			boolean chave = false;

			if(i % 2 == 0){
				do{
					System.out.println("\nJogador X e a sua vez!!");
					System.out.println("Qual posicao voce deseja posicionar sua peca? Escolha entre uma [linha] e uma [coluna]");
	
					System.out.println("");
	
					System.out.print("Linha: ");
					l = entradaInt.nextInt();
					System.out.print("Coluna: ");
					c = entradaInt.nextInt();
					
					if(l >= 1 && l <= 3 && c >= 1 && c <= 3){
						l--;
						c--;
						
						if(tabuleiro[l][c] != 'X' && tabuleiro[l][c] != 'O'){
							tabuleiro[l][c] = 'X';
						
							chave = true;
						}else{
							System.out.println("A posicao linha["+ l +"] coluna["+ c +"] ja esta sendo utilizada!");
							System.out.println("");		
						}
						
					}else{
						System.out.println("A posicao linha["+ l +"] coluna["+ c +"] e invalida!");
						System.out.println("");	
					}

					if(tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X'){
						System.out.println("Parabens!!");
						System.out.println("Jogar [X] Ganhou!!");

						i = 8;
						ganhou = true;
					}else if(tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X'){
						System.out.println("Parabens!!");
						System.out.println("Jogar [X] Ganhou!!");

						i = 8;
						ganhou = true;
					}else if(tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X'){
						System.out.println("Parabens!!");
						System.out.println("Jogar [X] Ganhou!!");

						i = 8;
						ganhou = true;
					}else if(tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X'){
						System.out.println("Parabens!!");
						System.out.println("Jogar [X] Ganhou!!");

						i = 8;
						ganhou = true;
					}else if(tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X'){
						System.out.println("Parabens!!");
						System.out.println("Jogar [X] Ganhou!!");

						i = 8;
						ganhou = true;
					}else if(tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X'){
						System.out.println("Parabens!!");
						System.out.println("Jogar [X] Ganhou!!");

						i = 8;
						ganhou = true;
					}else if(tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X'){
						System.out.println("Parabens!!");
						System.out.println("Jogar [X] Ganhou!!");

						i = 8;
						ganhou = true;
					}else if(tabuleiro[2][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[0][2] == 'X'){
						System.out.println("Parabens!!");
						System.out.println("Jogar [X] Ganhou!!");

						i = 8;
						ganhou = true;
					}
					
				}while(chave != true);	
				
			}else {
				do{
					System.out.println("\nJogador O e a sua vez!!");
					System.out.println("Qual posicao voce deseja posicionar sua peca? Escolha entre uma [linha] e uma [coluna]");
	
					System.out.println("");
	
					System.out.print("Linha: ");
					l = entradaInt.nextInt();
					System.out.print("Coluna: ");
					c = entradaInt.nextInt();
					
					if(l >= 1 && l <= 3 && c >= 1 && c <= 3){
						l--;
						c--;

						if(tabuleiro[l][c] != 'X' && tabuleiro[l][c] != 'O'){
							tabuleiro[l][c] = 'O';
						
							chave = true;
						}else{
							System.out.println("A posicao linha["+ l +"] coluna["+ c +"] ja esta sendo utilizada!");
							System.out.println("");		
						}
						
					}else{
						System.out.println("A posicao linha["+ l +"] coluna["+ c +"] e invalida!");
						System.out.println("");		
						
					}

					if(tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O'){
						System.out.println("Parabens!!");
						System.out.println("Jogador [O] Ganhou!!");

						i = 8;
						ganhou = true;
					}else if(tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O'){
						System.out.println("Parabens!!");
						System.out.println("Jogador [O] Ganhou!!");

						i = 8;
						ganhou = true;
					}else if(tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O'){
						System.out.println("Parabens!!");
						System.out.println("Jogador [O] Ganhou!!");

						i = 8;
						ganhou = true;
					}else if(tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O'){
						System.out.println("Parabens!!");
						System.out.println("Jogador [O] Ganhou!!");

						i = 8;
						ganhou = true;
					}else if(tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O'){
						System.out.println("Parabens!!");
						System.out.println("Jogador [O] Ganhou!!");

						i = 8;
						ganhou = true;
					}else if(tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O'){
						System.out.println("Parabens!!");
						System.out.println("Jogador [O] Ganhou!!");

						i = 8;
						ganhou = true;
					}else if(tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O'){
						System.out.println("Parabens!!");
						System.out.println("Jogador [O] Ganhou!!");

						i = 8;
						ganhou = true;
					}else if(tabuleiro[2][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[0][2] == 'O'){
						System.out.println("Parabens!!");
						System.out.println("Jogador [O] Ganhou!!");

						i = 8;
						ganhou = true;
					}
					
				}while(chave != true);
			
			}
			
		}

		for(int linha = 0; linha < tabuleiro.length; linha++){
			for(int coluna = 0; coluna < tabuleiro[linha].length; coluna++){
				System.out.print(" ["+ tabuleiro[linha][coluna] +"] ");
					
				if(coluna == 2){
					System.out.println("");	
				}

			}
		}

		if(ganhou != true){
			System.out.println("Deu velha. Ha! Ha!");
		}

	}

}
