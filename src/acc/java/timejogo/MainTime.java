package acc.java.timejogo;

import java.time.LocalDate;
import java.util.ArrayList;


public class MainTime {

    public static void main(String[] args) {

        ArrayList<Jogador> jogador = new ArrayList<Jogador>();
        ArrayList<Jogador> jogador2 = new ArrayList<Jogador>();


        Jogador jogador1time1 = new Jogador(1, "Ederson", "Paredão", parseData("1992-04-12"), 1, "Goleiro", 99, 0, false, true);
        Jogador jogador2time1 = new Jogador(2, "Dani Alves", "Dani", parseData("1984-03-11"), 2, "Lateral Dir", 85, 0, false, true);
        Jogador jogador3time1 = new Jogador(3, "Thiago Silva", "Capita", parseData("1985-02-20"), 3, "Zagueiro", 90, 0, false, false);
        Jogador jogador4time1 = new Jogador(4, "Marquinhos", "Brabo", parseData("1994-11-22"), 4, "Zagueiro", 98, 0, false, true);
        Jogador jogador5time1 = new Jogador(5, "Marcelo", "Celo", parseData("1986-03-11"), 5, "Lateral Esq", 88, 0, false, false);
        Jogador jogador6time1 = new Jogador(6, "Casimiro", "Xerife", parseData("1993-04-11"), 6, "Volante", 95, 0, false, true);
        Jogador jogador7time1 = new Jogador(7, "Fabinho", "Girafa", parseData("1992-12-10"), 7, "Volante", 90, 0, false, false);
        Jogador jogador8time1 = new Jogador(8, "Paquetá", "Maestro", parseData("1998-01-03"), 8, "Meia", 89, 0, false, true);
        Jogador jogador9time1 = new Jogador(9, "Neymar", "Ney", parseData("1990-05-13"), 9, "Atacante", 99, 0, false, false);
        Jogador jogador10time1 = new Jogador(10, "Rafinha", "Rafa", parseData("1996-03-11"), 10, "Atacante", 94, 0, false, true);
        Jogador jogador11time1 = new Jogador(11, "Firmino", "Bob", parseData("1990-05-09"), 11, "Atacante", 90, 0, false, false);
        Jogador jogador12time1 = new Jogador(12, "Allison", "Barba", parseData("1994-04-12"), 12, "Goleiro", 95, 0, false, true);
        Jogador jogador13time1 = new Jogador(13, "Danilo", "Dani", parseData("1989-04-11"), 13, "Lateral Dir", 90, 0, false, true);
        Jogador jogador14time1 = new Jogador(14, "Eder Militão", "Militão", parseData("1991-02-21"), 14, "Zagueiro", 94, 0, false, false);
        Jogador jogador15time1 = new Jogador(15, "Miranda", "Mago", parseData("1985-11-10"), 15, "Zagueiro", 89, 0, false, true);
        Jogador jogador16time1 = new Jogador(16, "Coutinho", "Couto", parseData("1993-03-11"), 16, "Meia", 96, 0, false, false);
        Jogador jogador17time1 = new Jogador(17, "Vinicius Jr.", "Malvadão", parseData("2000-04-11"), 17, "Atacante", 99, 0, false, true);
        Jogador jogador18time1 = new Jogador(18, "Richarlison", "Pombo", parseData("1998-03-15"), 18, "Atacante", 95, 0, false, false);
        Jogador jogador19time1 = new Jogador(19, "Guilherme Arana", "Arana", parseData("2003-03-15"), 19, "Lateral Esq", 95, 0, false, false);

        jogador.add(jogador1time1);
        jogador.add(jogador2time1);
        jogador.add(jogador3time1);
        jogador.add(jogador4time1);
        jogador.add(jogador5time1);
        jogador.add(jogador6time1);
        jogador.add(jogador7time1);
        jogador.add(jogador8time1);
        jogador.add(jogador9time1);
        jogador.add(jogador10time1);
        jogador.add(jogador11time1);
        jogador.add(jogador12time1);
        jogador.add(jogador13time1);
        jogador.add(jogador14time1);
        jogador.add(jogador15time1);
        jogador.add(jogador16time1);
        jogador.add(jogador17time1);
        jogador.add(jogador18time1);
        jogador.add(jogador19time1);


        Jogador jogador1time2 = new Jogador(1, "Emiliano Martínez", "Martinez", parseData("1992-04-11"), 12, "Goleiro", 92, 0, false, true);
        Jogador jogador2time2 = new Jogador(2, "Franco Armani", "Franco", parseData("1986-10-11"), 2, "Goleiro", 85, 0, false, true);
        Jogador jogador3time2 = new Jogador(3, "Cristian Romero", "Boludo", parseData("1998-02-20"), 3, "Zagueiro", 90, 0, false, false);
        Jogador jogador4time2 = new Jogador(4, "Lisandro Martínez", "Sandro", parseData("1998-11-22"), 4, "Zagueiro", 93, 0, false, true);
        Jogador jogador5time2 = new Jogador(5, "Nicolás Otamendi", "Ota", parseData("1988-03-11"), 5, "Zagueiro", 88, 0, false, false);
        Jogador jogador6time2 = new Jogador(6, "Nicolás Tagliafico", "Taglia", parseData("1993-04-11"), 6, "Lateral Esq", 91, 0, false, true);
        Jogador jogador7time2 = new Jogador(7, "Marcos Acuña", "Cuna", parseData("1991-12-10"), 7, "Lateral Esq", 85, 0, false, false);
        Jogador jogador8time2 = new Jogador(8, "Gonzalo Montiel", "Monti", parseData("1998-01-03"), 8, "Lateral Dir", 89, 0, false, true);
        Jogador jogador9time2 = new Jogador(9, "Nahuel Molina", "Moli", parseData("1990-05-13"), 9, "Lateral Dir", 88, 0, false, false);
        Jogador jogador10time2 = new Jogador(10, "Leandro Paredes", "Paredes", parseData("1996-03-11"), 10, "Volante", 91, 0, false, true);
        Jogador jogador11time2 = new Jogador(11, "Guido Rodríguez", "Guido", parseData("1990-05-09"), 11, "Volante", 89, 0, false, false);
        Jogador jogador12time2 = new Jogador(12, "Rodrigo de Paul", "Paul", parseData("1994-04-12"), 12, "Volante", 91, 0, false, true);
        Jogador jogador13time2 = new Jogador(13, "Giovani Lo Celso", "Celso", parseData("1989-04-11"), 13, "Meia", 90, 0, false, true);
        Jogador jogador14time2 = new Jogador(14, "Exequiel Palacios", "Palacios", parseData("1991-02-21"), 14, "Meia", 89, 0, false, false);
        Jogador jogador15time2 = new Jogador(15, "Lionel Messi", "Messi", parseData("1985-11-10"), 15, "Meia", 99, 0, false, true);
        Jogador jogador16time2 = new Jogador(16, "Lautaro Martínez", "Lau", parseData("1993-03-11"), 16, "Atacante", 87, 0, false, false);
        Jogador jogador17time2 = new Jogador(17, "Julián Álvarez", "Alvarez", parseData("2000-04-11"), 17, "Atacante", 91, 0, false, true);
        Jogador jogador18time2 = new Jogador(18, "Joaquín Correa", "Correa", parseData("1998-03-15"), 18, "Atacante", 90, 0, false, false);
        Jogador jogador19time2 = new Jogador(19, "Ángel Di María", "Di Maria", parseData("1987-03-15"), 19, "Atacante", 90, 0, false, false);

        jogador2.add(jogador1time2);
        jogador2.add(jogador2time2);
        jogador2.add(jogador3time2);
        jogador2.add(jogador4time2);
        jogador2.add(jogador5time2);
        jogador2.add(jogador6time2);
        jogador2.add(jogador7time2);
        jogador2.add(jogador8time2);
        jogador2.add(jogador9time2);
        jogador2.add(jogador10time2);
        jogador2.add(jogador11time2);
        jogador2.add(jogador12time2);
        jogador2.add(jogador13time2);
        jogador2.add(jogador14time2);
        jogador2.add(jogador15time2);
        jogador2.add(jogador16time2);
        jogador2.add(jogador17time2);
        jogador2.add(jogador18time2);
        jogador2.add(jogador19time2);

        System.out.println("----------------------------------------");
        Time time1 = new Time();
        time1.setNome("Brasil");
        time1.setPlantel(jogador);
        time1.setRelacionados(time1.relacionarJogadores());

        Time time2 = new Time();
        time2.setNome("Argentina");
        time2.setPlantel(jogador2);
        time2.setRelacionados(time2.relacionarJogadores());

        System.out.println("----------------------------------------");
        System.out.println("Titulares do " + time1.getNome() + ": ");
        time1.relacionarJogadores().stream().limit(11).forEach(t -> System.out.println(t.getNumero() + " - " + t.getNome() + " - " + t.getQualidade()));

        System.out.println("----------------------------------------");
        System.out.println("Reservas do " + time1.getNome() + ": ");
        time1.relacionarJogadores().stream().skip(11).forEach(t -> System.out.println(t.getNumero() + " - " + t.getNome() + " - " + t.getQualidade()));

        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("Titulares do " + time2.getNome() + ": ");
        time2.relacionarJogadores().stream().limit(11).forEach(t -> System.out.println(t.getNumero() + " - " + t.getNome() + " - " + t.getQualidade()));
        System.out.println("----------------------------------------");
        System.out.println("Reservas do " + time2.getNome() + ": ");
        time2.relacionarJogadores().stream().skip(11).forEach(t -> System.out.println(t.getNumero() + " - " + t.getNome() + " - " + t.getQualidade()));
        

        Jogo jogo1 = new Jogo(time1, time2, parseData("2021-08-02"), "Recife", "Recife", 0, 0);
        
        jogo1.gerarResultado();
        System.out.println("----------------------------------------");
        System.out.println("Placar do jogo: ");
        System.out.printf(jogo1.getMandante().getNome() + " " + jogo1.getPlacarMandante() + " x ");
        System.out.println(jogo1.getPlacarVisitante() + " " +jogo1.getVisitante().getNome());

        jogo1.gerarCartoes();
        jogo1.gerarLesoes();

        jogo1.getMandante().getRelacionados().forEach(e -> e.executarTreinamento());
        jogo1.getVisitante().getRelacionados().forEach(e -> e.executarTreinamento());

        
    }
    
    public static LocalDate parseData(String date) {
        LocalDate data = LocalDate.parse(date);
        return data;
    } 
}
