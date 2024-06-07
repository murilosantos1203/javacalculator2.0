package espaciais;

public class PiramideQuadrada {
    double aresta;
    double apotema;
    double area;
    double altura;

    public PiramideQuadrada(double aresta, double apotema, double area, double altura) {
        this.aresta = aresta;
        this.apotema = apotema;
        this.area = area;
        this.altura = altura;
    }
    public double calcularAreaSuperficial(){
        return (2 * aresta * apotema) + Math.pow(aresta, 2);
    }
    public double calcularVolume(){
        return (area * altura)/3;
    }
}
