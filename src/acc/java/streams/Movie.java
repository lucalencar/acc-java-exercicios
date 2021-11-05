package acc.java.streams;

import java.time.LocalDate;

public class Movie {

    private String titulo;
    private Diretor diretor;
    private int duracao;
    private LocalDate date;


    public Movie(String titulo, Diretor diretor, int duracao, LocalDate date) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.date = date;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Diretor getDiretor() {
        return this.diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    

    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", diretor='" + getDiretor() + "'" +
            ", duracao='" + getDuracao() + "'" +
            ", date='" + getDate() + "'" +
            "}";
    }

    
}
