package espaciais;

public class Cone {

    double raio;
    double altura;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = raio;
    }

    public double calcularVolume(){
        return 0.33333333333 * Math.PI * Math.pow(raio, 2) * altura;
    }

    public double calcularAreaSuperficial(){
        return  Math.PI * raio * Math.sqrt(Math.pow(altura, 2) + Math.pow(raio,2));
    }
}
