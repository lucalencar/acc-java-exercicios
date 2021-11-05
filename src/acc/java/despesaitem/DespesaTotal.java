package acc.java.despesaitem;

import java.util.ArrayList;

public class DespesaTotal {
    private ArrayList<DespesaMes> despesaMes;
    private String cpf;

    public DespesaTotal(String cpf, ArrayList<DespesaMes> despesaMes) {
        this.despesaMes = despesaMes;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public DespesaMes totalizaMes(int mes) {
        float soma = 0f;
        for (int i=0; i < this.despesaMes.size(); i++) {
            if (this.despesaMes.get(i).getMes() == mes) {
                soma += this.despesaMes.get(i).getValor();
                //return new DespesaMes(mes, soma);
            }
        }
        return new DespesaMes(mes, soma);
    }

}