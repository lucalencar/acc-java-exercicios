package acc.java.joption;

public class CirculoMain {
    public static void main(String[] args) {

        Circulo novoCirculo = new Circulo(10);
        novoCirculo.calcularArea(novoCirculo);
        System.out.println(novoCirculo.getArea());
        novoCirculo.calcularPerimetro(novoCirculo);
        System.out.println(novoCirculo.getPerimetro());
        System.out.println("------------------");
        novoCirculo.setRaio(4);
        novoCirculo.calcularArea(novoCirculo);
        System.out.println(novoCirculo.getArea());
        novoCirculo.calcularPerimetro(novoCirculo);
        System.out.println(novoCirculo.getPerimetro());
        System.out.println("------------------");

        imprimirCirculos(5);
    }

    public static void imprimirCirculos(int vezes) {
        for (int i = 0; i <= vezes; i++) {
            Circulo circulo = new Circulo(10);
            circulo.calcularArea(circulo);
            System.out.println(circulo.getArea());
            circulo.calcularPerimetro(circulo);
            System.out.println(circulo.getPerimetro());
            System.out.println("------------------");
            circulo.setRaio(4);
            circulo.calcularArea(circulo);
            System.out.println(circulo.getArea());
            circulo.calcularPerimetro(circulo);
            System.out.println(circulo.getPerimetro());
            System.out.println("------------------");
        }
    }
}
