package planas;

public class Hexagono {
    double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return 6 * lado * Math.sqrt(3/4);
    }
    public double calcularPerimetro(){
        return lado * 6;
    }
}
