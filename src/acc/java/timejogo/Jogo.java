package acc.java.timejogo;

import java.time.LocalDate;
import java.util.Optional;

public class Jogo {
    Time mandante;
    Time visitante;
    LocalDate data;
    String estadio;
    String cidade;
    int placarMandante;
    int placarVisitante;
    boolean verificaJogo = false;
    
    public Jogo() {
    }

    public Jogo(Time mandante, Time visitante, LocalDate data, String estadio, String cidade, int placarMandante, int placarVisitante) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.data = data;
        this.estadio = estadio;
        this.cidade = cidade;
        this.placarMandante = placarMandante;
        this.placarVisitante = placarVisitante;
    }


    public Time getMandante() {
        return this.mandante;
    }

    public void setMandante(Time mandante) {
        this.mandante = mandante;
    }

    public Time getVisitante() {
        return this.visitante;
    }

    public void setVisitante(Time visitante) {
        this.visitante = visitante;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getEstadio() {
        return this.estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getPlacarMandante() {
        return this.placarMandante;
    }

    public void setPlacarMandante(int placarMandante) {
        this.placarMandante = placarMandante;
    }

    public int getPlacarVisitante() {
        return this.placarVisitante;
    }

    public void setPlacarVisitante(int placarVisitante) {
        this.placarVisitante = placarVisitante;
    }


    public boolean isVerificaJogo() {
        return this.verificaJogo;
    }

    public boolean getVerificaJogo() {
        return this.verificaJogo;
    }

    public void setVerificaJogo(boolean verificaJogo) {
        this.verificaJogo = verificaJogo;
    }


    public void gerarResultado() {
        this.verificaJogo = true;
        var r = Math.random();
        int max = 7;
        int min = 1;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        int range2 = (rand - 1) - min + 1;
        int rand2 = (int)(Math.random() * range2) + min;

        int mandante = this.mandante.relacionarJogadores().stream().mapToInt(t -> t.getQualidade()).sum();
        int visitante = this.visitante.relacionarJogadores().stream().mapToInt(t -> t.getQualidade()).sum();

        if (r <= 0.5) {
            if (mandante > visitante) {
                this.placarMandante = rand;
                this.placarVisitante = rand2;
            } else {
                this.placarVisitante = rand;
                this.placarMandante = rand2;
            }
        } else if (r <= 0.8) {
            if (mandante < visitante) {
                this.placarVisitante = rand;
                this.placarMandante = rand2;
            } else {
                this.placarMandante = rand;
                this.placarVisitante = rand2;
            }
        } else {
            this.placarVisitante = rand;
            this.placarMandante = rand;
        }

    }

    public void gerarLesoes() {
        int max = 5;
        int min = 0;
        int range = max - min + 1;
        int rand = 0 + (int)(Math.random() * range) + min;

    
            if (rand > 0 && rand <= 2) {
                Optional<Jogador> lesionado1 =
                this.mandante.getRelacionados().stream().skip((int) (this.mandante.getRelacionados().size() * Math.random())).findAny();
                lesionado1.stream().forEach(e -> e.sofrerLesao());
            } else if (rand > 3 && rand <= 5) {
                Optional<Jogador> lesionado2 =
                this.visitante.getRelacionados().stream().skip((int) (this.mandante.getRelacionados().size() * Math.random())).findAny();
                lesionado2.stream().forEach(e -> e.sofrerLesao());
            }
            
    }

    public void gerarCartoes() {
        var rLoop = (int)(Math.random() * (10 - 1)) + 1;
        int max = 10;
        int min = 0;
        int range = max - min + 1;
        int rand = 0 + (int)(Math.random() * range) + min;

        for (int i = 0; i <= rLoop; i++) {
            if (rand > 0 && rand <= 10) {
                Optional<Jogador> gerarCartao1 =
                this.mandante.getRelacionados().stream().skip((int) (this.mandante.getRelacionados().size() * Math.random())).findAny();
                gerarCartao1.stream().forEach(e -> e.aplicarCartao(1));
                Optional<Jogador> gerarCartao2 =
                this.visitante.getRelacionados().stream().skip((int) (this.mandante.getRelacionados().size() * Math.random())).findAny();
                gerarCartao2.stream().forEach(e -> e.aplicarCartao(1));
            } else {
                break;
            }
        }
    }

    public void permitirTreinamento() {
        if (this.verificaJogo == true) {
            this.mandante.getRelacionados().forEach(e -> e.executarTreinamento());
            this.visitante.getRelacionados().forEach(e -> e.executarTreinamento());    
        }
    }

    

    
}
