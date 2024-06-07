package espaciais;

public class Esfera {
    double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double calcularAreaSuperficial(){
        return 4 * Math.PI * Math.pow(raio, 2);
    }
    public double calcularVolume(){
        return 4/3 * Math.pow(raio, 3);
    }
}
