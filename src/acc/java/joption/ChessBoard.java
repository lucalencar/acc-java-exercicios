package acc.java.joption;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class ChessBoard {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		String[][] board = { 
			{"R","N","B","Q","K","B","N","R"},
			{"P","P","P","P","P","P","P","P"},
			{" "," "," "," "," "," "," "," "},
			{" "," "," "," "," "," "," "," "},
			{" "," "," "," "," "," "," "," "},
			{" "," "," "," "," "," "," "," "},
			{"p","p","p","p","p","p","p","p"},
			{"r","n","b","q","k","b","n","r"}};

		imprimirBoard(board);

		boolean exit = false;
		int menu = 0;

		do {
			String option = JOptionPane.showInputDialog("1. Mover peão \n" + "2. Sair.");
			try {
				menu = Integer.parseInt(option);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Input inválido! Digite um número!");
			}
			switch (menu) {
				case 1:
					moverPeao(board);
					break;
				case 2:
					exit = true;
			}
		} while (!exit);
	
		input.close();

	}

	// --------------Mover Peão---------------------------------------

	public static void moverPeao(String[][] board) {
		int peaoColuna = 0;
		int peaoMove = 0;
		int peaoOrigem = 0;
		int moveFinal = 0;
		int peaoOrigemFinal = 0;
		int numCasas = 0;

		while (true) {
			String linhaDeOrigem = JOptionPane.showInputDialog("Digite a linha de origem do peão:");
			if (!(linhaDeOrigem.isEmpty())) {
				peaoOrigem = Integer.parseInt(linhaDeOrigem);
				peaoOrigemFinal = peaoOrigem;
				break;
			}
		}


		
		while (true) {
			String colunaInput = JOptionPane.showInputDialog("Digite a coluna(0 à 7): ");
			if (peaoColuna > 7) {
				JOptionPane.showMessageDialog(null, "Número inválido! ");
			} else if (!(colunaInput.isEmpty())){
				peaoColuna = Integer.parseInt(colunaInput);
				break;
			}
		}

		while (true) {
			String destinoPeao = JOptionPane.showInputDialog("Digite o destino do peão: ");
			int povOriginal = peaoOrigem;
			if ((numCasas <= -3) && (board[peaoOrigem][peaoColuna] != null) || (peaoMove >= povOriginal)) {
				JOptionPane.showMessageDialog(null, "Movimento inválido, digite novamente o destino: ");
			} else if (!(destinoPeao.isEmpty())){
				peaoMove = Integer.parseInt(destinoPeao);
				numCasas = peaoMove - povOriginal;
				moveFinal = peaoMove;
				break;
			}
		}

		System.out.println("");
		board[moveFinal][peaoColuna] = board[peaoOrigemFinal][peaoColuna];
		board[peaoOrigemFinal][peaoColuna] = "";

		imprimirBoard(board);

	}

	// --------------Impress�o do Tabuleiro---------------------------------------

	public static void imprimirBoard(String[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + "  ");
			}
			System.out.println("");
		}
	}

}
