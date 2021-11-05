package acc.java.despesaitem;

public class DespesaMes {
    private int mes;
    private float valor;

    public DespesaMes(int mes, float valor) {
        this.mes = mes;
        this.valor = valor;
    }

    public int getMes() {
        return mes;
    }
    
    public float getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Valor total no mês: " + getMes() + " = " + getValor();
    }


}
