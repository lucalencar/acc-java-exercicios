package acc.java.xadrezrefact;

import javax.swing.JOptionPane;

public class Peao extends Peca{


    public Peao(String[][] board) {
        super(board);
    }

    @Override
    public void Mover(String[][] board) {
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

    private void imprimirBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + "  ");
			}
			System.out.println("");
		}
    }
    
}
