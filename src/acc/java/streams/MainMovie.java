package acc.java.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.time.LocalDate;

/**
 * 
 * @author Lucas Alencar
 * 
 */

public class MainMovie {

    private static List<Diretor> diretor = new ArrayList<Diretor>();
    private static List<Movie> movie = new ArrayList<Movie>();

    public static void main(String[] args) {

        Diretor diretor1 = new Diretor("Stanley Kubrick");
        Diretor diretor2 = new Diretor("Ridley Scott");
        Diretor diretor3 = new Diretor("Martin Scorcese");
        Diretor diretor4 = new Diretor("Jordan Peele");
        Diretor diretor5 = new Diretor("David Lynch");
        Diretor diretor6 = new Diretor("George Miller");

        diretor.add(diretor1);
        diretor.add(diretor2);
        diretor.add(diretor3);
        diretor.add(diretor4);
        diretor.add(diretor5);
        diretor.add(diretor6);

        Movie movie1 = new Movie("The Shinning", diretor1, 146, parseData("1980-05-23"));
        Movie movie2 = new Movie("2001: A Space Odyssey", diretor1, 142, parseData("1968-04-02"));
        Movie movie3 = new Movie("Alien", diretor2, 117, parseData("1979-05-25"));
        Movie movie4 = new Movie("Goodfellas", diretor3, 146, parseData("1990-09-09"));
        Movie movie5 = new Movie("Us", diretor4, 116, parseData("2019-03-08"));
        Movie movie6 = new Movie("Dune", diretor5, 137, parseData("1984-12-03"));
        Movie movie7 = new Movie("Mad Max", diretor6, 93, parseData("1979-04-12"));

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);

        System.out.println("--------------------------------------------------------");
        System.out.println("Quantidade de filmes existentes: " + imprimirQuantidadeFilmes());
        System.out.println("--------------------------------------------------------");
        imprimirQuantidadePorDiretor("Stanley Kubrick");
        System.out.println("--------------------------------------------------------");
        System.out.println("Filmes com duração menor que 100 minutos: ");
        duracaoMenor(100);
        System.out.println("--------------------------------------------------------");
        System.out.println("Mapa contendo diretores e uma lista de seus respectivos filmes: ");
        imprimirMapaDiretores();
        System.out.println("--------------------------------------------------------");
        MaxMinDuracao();
        System.out.println("--------------------------------------------------------");
        System.out.println("Filmes por ordem cronológica: ");
        cronologico();


    }

    public static long imprimirQuantidadeFilmes() {
        long numFilmes =
        movie.stream().count();
        return numFilmes;        
    }

    public static void imprimirQuantidadePorDiretor(String diretor) {
        long numFilmes = 
        movie.stream()
        .filter(movie -> movie.getDiretor().getNome() == diretor)
        .count();
        System.out.println("Quantidade do filmes do diretor " + diretor + ": " + numFilmes);
    }

    public static void imprimirMapaDiretores() {

        Map<String, List<String>> mapaDiretores = new HashMap<String, List<String>>();

        diretor.stream()
        .forEach(diretor -> {
            List<String> nomeFilmes =
            movie.stream()
            .filter(movie -> movie.getDiretor().getNome() == diretor.getNome())
            .map(movie -> movie.getTitulo())
            .collect(Collectors.toList());

            mapaDiretores.put(diretor.getNome(), nomeFilmes);

        });
        
        for(Map.Entry<String, List<String>> mapa : mapaDiretores.entrySet()) {
            String key = mapa.getKey();
            List<String> value = mapa.getValue();
            
            System.out.println(key + " " + value);
        }
    }


    public static void MaxMinDuracao() {
        OptionalInt maxDuracao =
        movie.stream()
        .mapToInt(movie -> movie.getDuracao())
        .max();

        OptionalInt MinDuracao =
        movie.stream()
        .mapToInt(movie -> movie.getDuracao())
        .min();

        List<String> nomeFilme =
        movie.stream()
        .filter(movie -> movie.getDuracao() == maxDuracao.getAsInt())
        .map(movie -> movie.getTitulo())
        .collect(Collectors.toList());

        List<String> nomeFilmeMin = 
        movie.stream()
        .filter(movie -> movie.getDuracao() == MinDuracao.getAsInt())
        .map(movie -> movie.getTitulo())
        .collect(Collectors.toList());

        System.out.println("Filmes de maior duração: ");
        System.out.println(nomeFilme + " -> " + maxDuracao.getAsInt() + " Minutos");
        System.out.println("Filmes de menor duração: ");
        System.out.println(nomeFilmeMin + " -> " + MinDuracao.getAsInt() + " Minutos");

    }

    public static void cronologico() {
        movie.stream()
        .sorted((o1, o2) -> o1.getDate().compareTo(o2.getDate()))
        .forEach(movie -> System.out.println(movie.getTitulo() + " -> " + movie.getDate()));
    }

    public static void duracaoMenor(int duracao) {
        movie.stream()
        .filter(movie -> movie.getDuracao() <= duracao)
        .map(movie -> movie.getTitulo())
		.forEach(System.out::println);

    }

    public static LocalDate parseData(String date) {
        LocalDate data = LocalDate.parse(date);
        return data;
    } 
    
}
