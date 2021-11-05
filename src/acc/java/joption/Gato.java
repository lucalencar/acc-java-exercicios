package acc.java.joption;

public class Gato {
    private String nome;
    private int idade;


    public Gato() {
    }

    public Gato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String emitirSon() {
        return ("Miaaaaau");
    }

}
