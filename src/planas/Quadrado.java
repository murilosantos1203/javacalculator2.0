package planas;

public class Quadrado {

    double lado;
    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return Math.pow(lado, 2);
    }

    public double calcularPerimetro(){
        return 4 * lado;
    }
}
