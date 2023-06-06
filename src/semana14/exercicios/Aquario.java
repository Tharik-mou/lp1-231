package semana14.exercicios;

public class Aquario {

    public double comprimento;
    public double largura;
    public double altura;

    public Aquario(double comprimento, double altura, double largura){
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public Aquario(double valor){
        this (valor, valor, valor);
    }

    public double calcularVolume() {
        return ((comprimento * largura * altura) / 1000);
    }

    public double calcularPotenciaDoTermostato(double temperaturaAmbiente, double temperaturaDesejada) {
        return (calcularVolume() * 0.05 * Math.abs(temperaturaAmbiente - temperaturaDesejada));
    }

    public double [] calcularQuantidadeLitrosFiltro() {
        double[] volumeDois = {calcularVolume() * 2, calcularVolume() * 3};
        return volumeDois;
    }

    public double 
}