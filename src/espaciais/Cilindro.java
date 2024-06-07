package espaciais;

public class Cilindro {

    double raio;
    double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularVolume(){
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public double calcularAreaSuperficial(){
        return (2 * Math.PI * raio* altura) + (2* Math.PI * Math.pow(raio, 2));
    }
}
