package planas;

public class Retangulo {
    double base;
    double altura;
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return base * altura;
    }
    public double calcularPerimetro(){
        return 2 * base + 2 * altura;
    }
}
