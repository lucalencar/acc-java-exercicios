package acc.java.joption;

public class Dog {
    private String nome;
    private int idade;


    public Dog() {
    }

    public Dog(String nome, int idade) {
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
        return ("Woof Woof");
    }


    
}
