package espaciais;

public class Cubo {
    double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }
    public double calcularVolume(){
         return Math.pow(lado, 3);
    }

    public double calcularAreaSuperficial(){
        return Math.pow(lado, 2) * 6;
    }
}

