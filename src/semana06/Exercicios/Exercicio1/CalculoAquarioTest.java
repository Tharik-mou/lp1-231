package semana06.Exercicios.Exercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals; 

public class CalculoAquarioTest {

    @Test
    void testCalcularVolume() {
        float volume = CalculoAquario.calcularVolumedoAquario(10f, 10f, 10f);
        assertEquals(1.0, volume);
    }

    @Test
    void testCalcularPotenciadoAquario() {
        float potencia = CalculoAquario.calcularPotenciadoAquario(1f, 30f, 25f);
        assertEquals(0.25, potencia);
    }

    @Test
    void testCalcularFiltragemMinima() {
        float filtragemMinima = CalculoAquario.calcularFiltragemMinimadoAquario(1f);
        assertEquals(2.0, filtragemMinima);
    }

    @Test
    void testCalcularFiltragemMaxima() {
        float filtragemMaxima = CalculoAquario.calcularFiltragemMaximadoAquario(1f);
        assertEquals(3.0, filtragemMaxima);
    }
}