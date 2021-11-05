package acc.java.timejogo;

import java.time.LocalDate;

public class Jogador {

    private int id;
    private String nome;
    private String apelido;
    private LocalDate dataNascimento;
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoes;
    private boolean suspenso;
    private boolean jaTreinou;

    public Jogador() {
    }

    public Jogador(int id, String nome, String apelido, LocalDate dataNascimento, int numero, String posicao, int qualidade,
            int cartoes, boolean suspenso, boolean jaTreinou) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoes = cartoes;
        this.suspenso = suspenso;
        this.jaTreinou = jaTreinou;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicao() {
        return this.posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getQualidade() {
        return this.qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public int getCartoes() {
        return this.cartoes;
    }

    public void setCartoes(int cartoes) {
        this.cartoes = cartoes;
    }

    public boolean isSuspenso() {
        return this.suspenso;
    }

    public boolean getSuspenso() {
        return this.suspenso;
    }

    public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
    }


    public boolean isJaTreinou() {
        return this.jaTreinou;
    }

    public boolean getJaTreinou() {
        return this.jaTreinou;
    }

    public void setJaTreinou(boolean jaTreinou) {
        this.jaTreinou = jaTreinou;
    }


    public boolean verificaCondicaoDeJogo() {
        if (isSuspenso() == true) {
            return false;
        } else {
            return true;
        }
    }


    public void aplicarCartao(int quantidade) {
        this.cartoes = this.cartoes + quantidade;
        if (this.cartoes >= 3) {
            this.suspenso = true;
        }
    }

    public void cumprirSuspensao() {
        this.cartoes = 0;
        this.suspenso = false;
    }

    public void sofrerLesao() {

        var r = Math.random();

        if (r <= 0.4 && this.qualidade >= 1) {
            this.qualidade = this.qualidade - 1;
        } else if (r <= 0.7 && this.qualidade >= 2) {
            this.qualidade = this.qualidade - 2;
        } else if (r <= 0.85  && this.qualidade >= (int)(this.qualidade*(15.0f/100.0f))) {
            this.qualidade = this.qualidade - (int)(this.qualidade*(15.0f/100.0f));
        } else if (r <= 0.95 && qualidade >= (int)(qualidade*(10.0f/100.0f))) {
            this.qualidade = this.qualidade - (int)(this.qualidade*(10.0f/100.0f));
        } else if (r <= 0.99 && this.qualidade >= (int)(this.qualidade*(5.0f/100.0f)))  {
            this.qualidade = this.qualidade - (int)(this.qualidade*(5.0f/100.0f));
        }

    }

    public void executarTreinamento() {
        this.jaTreinou = true;
        var r = Math.random();

        if (r <= 0.4 && (this.qualidade <= 99)) {
            this.qualidade = this.qualidade + 1;
        } else if (r <= 0.7 && (this.qualidade <= 98)) {
            this.qualidade = this.qualidade + 2;
        } else if (r <= 0.85 && (this.qualidade <= 97)) {
            this.qualidade = this.qualidade + 3;
        } else if (r <= 0.95 && (this.qualidade <= 96)) {
            this.qualidade = this.qualidade + 4;
        } else if (r <= 0.99 && (this.qualidade <= 95)) {
            this.qualidade = this.qualidade + 5;
        }
    }

    public String verificaToString () {
        if (verificaCondicaoDeJogo() == true) {
            return "TÁ PRA JOGO";
        } else {
            return "SUSPENSO";
        }
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", apelido='" + getApelido() + "'" +
            ", dataNascimento='" + getDataNascimento() + "'" +
            ", numero='" + getNumero() + "'" +
            ", posicao='" + getPosicao() + "'" +
            ", qualidade='" + getQualidade() + "'" +
            ", cartoes='" + getCartoes() + "'" +
            ", suspenso='" + isSuspenso() + "'" +
            ", jaTreinou='" + isJaTreinou() + "'" +
            "}";
    }


}
