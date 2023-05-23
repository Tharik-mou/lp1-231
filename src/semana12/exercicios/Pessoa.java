package semana12.exercicios;

public class Pessoa {
    double peso;
    double altura;
    double pesoideal;

    public Pessoa(double peso, double altura){
        if(peso <= 0)
            throw new IllegalArgumentException("Peso Invalido");

        if(altura <= 0)
            throw new IllegalArgumentException("Altura Invalida");

        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC(){
        double imc = peso / (altura * altura);
        return imc;
    }

    public String getFaixa(){

        if (calcularIMC() < 18.5) {
            return "Baixo peso";
        } else 
        if (calcularIMC() < 25f) {
            return "Peso normal";
        } else 
        if (calcularIMC() < 30f) {
            return "Excesso de peso";
        } else 
        if (calcularIMC() < 35f) {
            return  "Obesidade de Classe 1";
        } else 
        if (calcularIMC() < 40f) {
            return "Obesidade de Classe 2";
        } else {
            return "Obesidade de Classe 3";
        }
    }

    public String getSituacao(){
        if(calcularIMC() > 18.5 && calcularIMC() < 25){
            return "NORMAL";
        }else{
            if (pesoideal < 65.0){
                return "GANHAR";
            }else {
                return "PERDER";
            }
        }
    }
}
