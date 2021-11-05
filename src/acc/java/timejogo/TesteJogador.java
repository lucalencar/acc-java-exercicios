package acc.java.timejogo;
import java.time.LocalDate;

import junit.framework.TestCase;

public class TesteJogador extends TestCase {
    Jogador jogador1 = new Jogador(1, "Ederson", "Paredão", parseData("1992-04-12"), 1, "Goleiro", 99, 0, false, true);

    public static void main(String[] args) {

    
    }

    @Test 
    public void testeJogador() {
        String nome = "Ederson";
        String apelido = "Paredão";
        Boolean suspenso = false;
        assertTrue(jogador1.getNome().equals(nome));
        assertTrue(jogador1.getApelido().equals(apelido));
        assertTrue(jogador1.getSuspenso() == suspenso);
    }

    @Test
    public void testeTime() {
        

    }

    public static LocalDate parseData(String date) {
        LocalDate data = LocalDate.parse(date);
        return data;
    } 

}
