package acc.java.joption;

public class Retangulo {
    private double lado1;
    private double lado2;
    private double area;
    private double perimetro;

    public Retangulo() {
    }

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }


    public double getLado1() {
        return this.lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
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

    public void calcularArea(Retangulo retangulo) {
        this.area = retangulo.getLado1() + retangulo.getLado2();
        System.out.println(this.area);
    }

    public void calcularPerimetro(Retangulo retangulo) {
        this.perimetro = (2 * retangulo.getLado1()) + (2 * retangulo.getLado2());
        System.out.println(this.perimetro);
    }
    
}
