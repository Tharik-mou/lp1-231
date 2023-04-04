package semana06.Exercicios.Exercicio2;

public class CalculoIMC {
    
    public static float CalcularImc(float peso, float altura) {
        float imc = peso / (altura * altura);
        return imc;
    }

    public static String CalcularCategoria(float imc) {
        String categoria; 

        if (imc < 18.5) {
            categoria =  "Baixo peso";
        } else if (imc < 25f) {
            categoria =  "Peso normal";
        } else if (imc < 30f) {
            categoria =  "Excesso de peso";
        } else if (imc < 35f) {
            categoria =  "Obesidade de Classe 1";
        } else if (imc < 40f) {
            categoria = "Obesidade de Classe 2";
        } else {
            categoria = "Obesidade de Classe 3";
        }

        return categoria;
    }

    public static String CalcularPesoComum(float imc, float altura, float peso) {
        final float IMC_IDEAL_MINIMO = 18.5f;
        final float IMC_IDEAL_MAXIMO = 24.9f;
        String pesoComum;

        if (imc < IMC_IDEAL_MINIMO || imc > IMC_IDEAL_MAXIMO) {
            float pesoIdeal = IMC_IDEAL_MAXIMO * (altura * altura);
            if (imc < IMC_IDEAL_MINIMO) {
                pesoComum = "Para chegar em seu peso ideial você precisa ganhar " + (pesoIdeal - peso) + "Kg.";
            } else {
                pesoComum = "Para chegar em seu peso ideial você precisa perder " + (peso - pesoIdeal) + "Kg.";
            }

        } else pesoComum = "Você está em seu peso ideal!";

        return pesoComum;

    }
}