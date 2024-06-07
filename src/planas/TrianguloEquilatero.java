package planas;

public class TrianguloEquilatero {
    double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }
    public double calcularArea(){
        return lado * Math.sqrt(0.75);
    }
    public double calcularPerimetro(){
        return lado * 3;
    }
}
