package acc.java.despesaitem;

import java.util.ArrayList;

public class ItemComplexo extends ItemOrcamento {
    ArrayList<ItemOrcamento> subItens;


    public ItemComplexo(ArrayList<ItemOrcamento> subItens, String historico, float valor) {
        super(historico, valor);
        this.subItens = subItens;
    }

    public ItemOrcamento encontraItem(String historico) {
        for (int i = 0; i < this.subItens.size(); i++) {
            if (this.subItens.get(i).getHistorico().equals(historico)) {
                return subItens.get(i);
            }
        } return null;    
    }

    @Override
    public float getValor() {
        float soma = 0;
        for (int i =0; i < subItens.size(); i++) {
            soma += subItens.get(i).getValor();
        } return soma;
    }    
}
