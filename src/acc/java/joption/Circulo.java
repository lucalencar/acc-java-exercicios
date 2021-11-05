package acc.java.joption;

public class Circulo {
    private double raio;
    private double area;
    private double perimetro;


    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }


    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void calcularArea(Circulo circulo) {
        this.area = circulo.getRaio() * circulo.getRaio() * 3.14;
        System.out.println(this.area);
    }

    public void calcularPerimetro(Circulo circulo) {
        this.perimetro = 2 * 3.14 * circulo.getRaio();
        System.out.println(this.perimetro);
    }
}
