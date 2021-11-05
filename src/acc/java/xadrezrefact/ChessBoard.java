package acc.java.xadrezrefact;

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

		Peao peao = new Peao(board);

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
					peao.Mover(board);
					break;
				case 2:
					exit = true;
			}
		} while (!exit);
	
		input.close();

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
