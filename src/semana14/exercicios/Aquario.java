package semana14.exercicios;

public class Aquario {

    public double comprimento;
    public double largura;
    public double altura;

    public Aquario(double comprimento, double altura, double largura){
        this.setComprimento(comprimento);
        this.setAltura(altura);
        this.setLargura(largura);
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

    public double getLargura(){
        return largura;
    }

    public void setLargura(double largura){
        if(largura <= 0){
            throw new RuntimeException("valor invalido para largura");
        }
        this.largura = largura;
    }

    public double getComprimento(){
        return comprimento;
    }

    public void setComprimento(double comprimento){
        if(comprimento <= 0){
            throw new RuntimeException("valor invalido para comprimento");
        }
        this.comprimento = comprimento;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        if(altura <= 0){
            throw new RuntimeException("valor invalido para altura");
        }
        this.altura = altura;
    }
}