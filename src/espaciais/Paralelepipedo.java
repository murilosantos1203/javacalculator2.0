package espaciais;

public class Paralelepipedo {
    double comprimento;
    double altura;
    double largura;

    public Paralelepipedo(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularVolume(){
        return comprimento * altura * comprimento;
    }

    public double calcularAreaSuperficial(){
       return 2 * ((comprimento * altura ) + (altura * largura) + (comprimento * largura));
    }
}
