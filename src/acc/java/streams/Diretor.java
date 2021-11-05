package acc.java.streams;

import java.util.List;

public class Diretor {

    private String nome;
    private List<Movie> movies;


    public Diretor(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public List<Movie> getMovies() {
        return this.movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }


    
}
