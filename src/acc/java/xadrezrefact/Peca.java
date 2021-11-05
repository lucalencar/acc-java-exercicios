package acc.java.xadrezrefact;

public abstract class Peca {
    String[][] board;


    public Peca(String[][] board) {
        this.board = board;
    }


    public abstract void Mover(String[][] board);
    
}
