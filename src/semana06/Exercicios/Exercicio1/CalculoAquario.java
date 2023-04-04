package semana06.Exercicios.Exercicio1;

public class CalculoAquario {

    public static float calcularVolumedoAquario(float comprimento, float altura, float largura) {
        float volume = ((comprimento * altura * largura) / 1000);
        return volume;
    }

    public static float calcularPotenciadoAquario(float volume, float temperaturaAmbiente, float temperaturaDesejada) {
        float potencia = (volume * 0.05f * (temperaturaAmbiente - temperaturaDesejada));
        return potencia;
    }

    public static float calcularFiltragemMinimadoAquario(float volume) {
        float filtragemMinima = volume * 2;
        return filtragemMinima;
    }

    public static float calcularFiltragemMaximadoAquario(float volume) {
        float filtragemMaxima = volume * 3;
        return filtragemMaxima;
    }
}