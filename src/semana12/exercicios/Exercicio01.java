package semana12.exercicios;

public class Exercicio01 {
    public double comprimento;
    public double largura;
    public double altura;

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
}
