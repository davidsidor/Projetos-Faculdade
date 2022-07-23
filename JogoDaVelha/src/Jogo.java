import javax.swing.JOptionPane;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Criando as variaveis 
		String[][] matriz = new String[3][3];
		String jogador;
		int totalJogadas = 0;
		int posicao = 0;
		boolean vencedor = false;
		boolean posicaoJogada = false;
		boolean posicaoValida = false;
		
		//Guardando as posi��es dentro da matriz
		matriz[0][0] = "1";
		matriz[0][1] = "2";
		matriz[0][2] = "3";
		matriz[1][0] = "4";
		matriz[1][1] = "5";
		matriz[1][2] = "6";
		matriz[2][0] = "7";
		matriz[2][1] = "8";
		matriz[2][2] = "9";
		//
		do {
			//Verificando se o jogador � X ou O
			totalJogadas++;
			if (totalJogadas % 2 == 0) {
				jogador = "O";
			}else{
				jogador = "X";
			}
			//Repetir a tabela caso ocorra algum erro 
			do {
				
				//M�todo para solicitar a posi��o que o usuario deseja jogar 
				posicao = solicitarPosicao(matriz);
				
				//M�todo para verificar se a posi��o informada pelo usuario ta entre 1 e 9
				posicaoValida = verificarPosicaoValida(posicao);
				
				//M�todo para verificar se a posi��o j� est� ocupada
				posicaoJogada = verificarPosicaoJaJogada(posicao, matriz);
				
				//Se posicaoValida == true OU posicaoJogada == true o c�digo ira se repetir 
			} while (posicaoValida == true || posicaoJogada == true);
			
			//M�todo para efetuar a jogada dentro da matriz 
			efetuarJogada(posicao, matriz, jogador);
			
			//M�todo para verificar o vencedor 
			vencedor = verificarVencedor(totalJogadas, matriz);

		} while (vencedor == false && totalJogadas < 9);
		//M�todo para Mostrar o vencedor 
		mostrarVencedor(vencedor, jogador, totalJogadas);
	}
	
	//M�todo para solicitar a posi��o que o usuario deseja jogar 
	private static int solicitarPosicao(String[][] matriz) {
		int posicao;
		posicao = Integer.parseInt(JOptionPane.showInputDialog(" Bem - vindo ao jogo da velha"
				+ "\n O 'X' come�a jogando."
				+ "\n Escolha o n�mero da posi��o desejada."
				+ "\n Posi��es:"
				+ "\n | " +matriz[0][0]+ " |   | " +matriz[0][1]+ " |   | " +matriz[0][2]+ " |"
				+ "\n | " +matriz[1][0]+ " |   | " +matriz[1][1]+ " |   | " +matriz[1][2]+ " |"		
			    + "\n | " +matriz[2][0]+ " |   | " +matriz[2][1]+ " |   | " +matriz[2][2]+ " |"));
		return posicao;
	}
	
	//M�todo para verificar se a posi��o j� est� ocupada
	public static boolean verificarPosicaoJaJogada(int posicao, String matriz[][]) {
		boolean posicaoJogada = false;
		if (posicao == 1 && (matriz[0][0].equals("X") || matriz[0][0].equals("O"))) {
			posicaoJogada = true;
		} else if (posicao == 2 && (matriz[0][1] == "X" || matriz[0][1] == "O")) {
			posicaoJogada = true;
		} else if (posicao == 3 && (matriz[0][2] == "X" || matriz[0][2] == "O")) {
			posicaoJogada = true;
		} else if (posicao == 4 && (matriz[1][0] == "X" || matriz[1][0] == "O")) {
			posicaoJogada = true;
		} else if (posicao == 5 && (matriz[1][1] == "X" || matriz[1][1] == "O")) {
			posicaoJogada = true;
		} else if (posicao == 6 && (matriz[1][2] == "X" || matriz[1][2] == "O")) {
			posicaoJogada = true;
		} else if (posicao == 7 && (matriz[2][0] == "X" || matriz[2][0] == "O")) {
			posicaoJogada = true;
		} else if (posicao == 8 && (matriz[2][1] == "X" || matriz[2][1] == "O")) {
			posicaoJogada = true;
		} else if (posicao == 9 && (matriz[2][2] == "X" || matriz[2][2] == "O")) {
			posicaoJogada = true;
		}
		if (posicaoJogada == true) {
			JOptionPane.showMessageDialog(null, "Essa casa j� est� ocupada.");
		}
		return posicaoJogada;
	}

	//M�todo para verificar se a posi��o informada pelo usuario ta entre 1 e 9
	public static boolean verificarPosicaoValida(int posicao) {
		boolean posicaoValida = false;
		if (posicao <= 0 || posicao > 9) {
			posicaoValida = true;
			JOptionPane.showMessageDialog(null, "Essa posi��o � inv�lida.");
		}
		return posicaoValida;
	}

	//M�todo para efetuar a jogada dentro da matriz 
	public static void efetuarJogada(int posicao, String matriz[][], String jogador) {
		switch (posicao) {
		case 1:
			matriz[0][0] = jogador;
			break;
		case 2:
			matriz[0][1] = jogador;
			break;
		case 3:
			matriz[0][2] = jogador;
			break;
		case 4:
			matriz[1][0] = jogador;
			break;
		case 5:
			matriz[1][1] = jogador;
			break;
		case 6:
			matriz[1][2] = jogador;
			break;
		case 7:
			matriz[2][0] = jogador;
			break;
		case 8:
			matriz[2][1] = jogador;
			break;
		case 9:
			matriz[2][2] = jogador;
			break;
		}
	}
	
	//M�todo para verificar o vencedor 
	public static boolean verificarVencedor(int totalJogadas, String matriz[][]) {
		boolean vencedor = false;
		vencedor = false;
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				if (totalJogadas > 4) {
					if ((matriz[l][0] == matriz[l][1]) && (matriz[l][1] == matriz[l][2])) {
						vencedor = true;
					} else if (matriz[0][c] == matriz[1][c] && matriz[1][c] == matriz[2][c]) {
						vencedor = true;
					} else if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) {
						vencedor = true;
					} else if (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0]) {
						vencedor = true;
					}
				}
			}
		}
		return vencedor;
	}
	
	//M�todo para Mostrar o vencedor 
	public static void mostrarVencedor(boolean vencedor, String jogador, int totalJogadas) {
		if (vencedor == true) {
			JOptionPane.showMessageDialog(null, "Parab�ns " + jogador + " venceu.");
		} else if (totalJogadas == 9) {
			JOptionPane.showMessageDialog(null, "O jogo terminou em velha.");
			//System.exit(0);
		}
	}
}