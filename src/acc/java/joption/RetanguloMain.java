package acc.java.joption;


public class RetanguloMain {
    public static void main(String[] main) {

        Retangulo novoRetangulo = new Retangulo(10, 5);
        System.out.println("------------");
        novoRetangulo.calcularArea(novoRetangulo);
        novoRetangulo.calcularPerimetro(novoRetangulo);
        System.out.println("------------");
        novoRetangulo.setLado2(7);
        novoRetangulo.calcularArea(novoRetangulo);
        novoRetangulo.calcularPerimetro(novoRetangulo);
        System.out.println("------------");

        imprimirRetangulos(1);

    }
    public static void imprimirRetangulos(int vezes) {
        for (int i = 1; i <= vezes; i++) {
        Retangulo retangulo = new Retangulo(10, 5);
        System.out.println("------------");
        retangulo.calcularArea(retangulo);
        retangulo.calcularPerimetro(retangulo);
        System.out.println("------------");
        retangulo.setLado2(7);
        retangulo.calcularArea(retangulo);
        retangulo.calcularPerimetro(retangulo);
        }
    }
    
}
