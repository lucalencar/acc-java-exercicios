package acc.java.timejogo;

import java.util.ArrayList;
import java.util.Comparator;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Time {

    private String nome;
    private String apelido;
    private LocalDate fundacao;
    private ArrayList<Jogador> plantel;
    private ArrayList<Jogador> relacionados;


    public Time() {
    }

    public Time(String nome, String apelido, LocalDate fundacao, ArrayList<Jogador> plantel, ArrayList<Jogador> relacionados) {
        this.nome = nome;
        this.apelido = apelido;
        this.fundacao = fundacao;
        this.plantel = plantel;
        this.relacionados = relacionados;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return this.apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public LocalDate getFundacao() {
        return this.fundacao;
    }

    public void setFundacao(LocalDate fundacao) {
        this.fundacao = fundacao;
    }

    public ArrayList<Jogador> getPlantel() {
        return this.plantel;
    }

    public void setPlantel(ArrayList<Jogador> plantel) {
        this.plantel = plantel;
    }

    public ArrayList<Jogador> getRelacionados() {
        return this.relacionados;
    }

    public void setRelacionados(ArrayList<Jogador> relacionados) {
        this.relacionados = relacionados;
    }

    public ArrayList<Jogador> relacionarJogadores() {
        ArrayList<Jogador> relacionados = new ArrayList<Jogador>();

        List<Jogador> listaPlantel =
         this.plantel.stream()
        .sorted(Comparator.comparing(Jogador::getQualidade).reversed())
        .limit(18)
        .collect(Collectors.toList());

        List<Jogador> listaReservas =
        this.plantel.stream()
        .sorted(Comparator.comparing(Jogador::getQualidade))
        .limit(18)
        .collect(Collectors.toList());

        List<Jogador> goleiroTitular =
        listaPlantel.stream()
        .filter(j -> j.getPosicao() == "Goleiro")
        .limit(1)
        .collect(Collectors.toList());

        goleiroTitular.stream().forEach(g -> relacionados.add(g));

        List<Jogador> lateralDireitoTitular =
        listaPlantel.stream()
        .filter(j -> j.getPosicao() == "Lateral Dir")
        .limit(1)
        .collect(Collectors.toList());
         
        lateralDireitoTitular.stream().forEach(g -> relacionados.add(g));

        List<Jogador> lateralEsquerdoTitular =
        listaPlantel.stream()
        .filter(j -> j.getPosicao() == "Lateral Esq")
        .limit(1)
        .collect(Collectors.toList());
         
        lateralEsquerdoTitular.stream().forEach(g -> relacionados.add(g));

        List<Jogador> zagueirosTitulares =
        listaPlantel.stream()
        .filter(j -> j.getPosicao() == "Zagueiro")
        .limit(2)
        .collect(Collectors.toList());
         
        zagueirosTitulares.stream().forEach(g -> relacionados.add(g));

        List<Jogador> volantesTitulares =
        listaPlantel.stream()
        .filter(j -> j.getPosicao() == "Volante")
        .limit(2)
        .collect(Collectors.toList());
         
        volantesTitulares.stream().forEach(g -> relacionados.add(g));

        List<Jogador> meiaTitular =
        listaPlantel.stream()
        .filter(j -> j.getPosicao() == "Meia")
        .limit(1)
        .collect(Collectors.toList());
         
        meiaTitular.stream().forEach(g -> relacionados.add(g));

        List<Jogador> atacantesTitulares =
        listaPlantel.stream()
        .filter(j -> j.getPosicao() == "Atacante")
        .limit(3)
        .collect(Collectors.toList());
         
        atacantesTitulares.stream().forEach(g -> relacionados.add(g));

        List<Jogador> goleiroReserva =
        listaReservas.stream()
        .filter(j -> j.getPosicao() == "Goleiro")
        .limit(1)
        .collect(Collectors.toList());
         
        goleiroReserva.stream().forEach(g -> relacionados.add(g));

        List<Jogador> lateralDirReserva =
        listaReservas.stream()
        .filter(j -> j.getPosicao() == "Lateral Dir")
        .limit(1)
        .collect(Collectors.toList());
         
        lateralDirReserva.stream().forEach(g -> relacionados.add(g));

        List<Jogador> lateralEsqReserva =
        listaReservas.stream()
        .filter(j -> j.getPosicao() == "Lateral Esq")
        .limit(1)
        .collect(Collectors.toList());
         
        lateralEsqReserva.stream().forEach(g -> relacionados.add(g));

        List<Jogador> zagueiroReserva =
        listaReservas.stream()
        .filter(j -> j.getPosicao() == "Zagueiro")
        .limit(1)
        .collect(Collectors.toList());
         
        zagueiroReserva.stream().forEach(g -> relacionados.add(g));

        List<Jogador> volanteReserva =
        listaReservas.stream()
        .filter(j -> j.getPosicao() == "Volante")
        .limit(1)
        .collect(Collectors.toList());
         
        volanteReserva.stream().forEach(g -> relacionados.add(g));

        List<Jogador> meiaReserva =
        listaReservas.stream()
        .filter(j -> j.getPosicao() == "Meia")
        .limit(1)
        .collect(Collectors.toList());
         
        meiaReserva.stream().forEach(g -> relacionados.add(g));

        List<Jogador> atacanteReserva =
        listaReservas.stream()
        .filter(j -> j.getPosicao() == "Atacante")
        .limit(1)
        .collect(Collectors.toList());
         
        atacanteReserva.stream().forEach(g -> relacionados.add(g));

        this.relacionados = relacionados;

        return (ArrayList<Jogador>) relacionados;
        }


    
    

    
}
