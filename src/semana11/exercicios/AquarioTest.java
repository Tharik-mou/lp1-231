package semana11.exercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals; 
import static org.junit.jupiter.api.Assertions.assertArrayEquals; 

public class AquarioTest {

    @Test
    public void testCalcularVolume(){
        Aquario aquario = new Aquario();

        aquario.altura = 50.0;
        aquario.comprimento = 100.0;
        aquario.largura = 50.0;

        double volume = aquario.calcularVolume();

        assertEquals(250.0, volume);
    }

    @Test
    public void testCalcularVolume2(){
        Aquario aquario = new Aquario();

        aquario.altura = 50.0;
        aquario.comprimento = 100.0;
        aquario.largura = 0.0;

        double volume = aquario.calcularVolume();

        assertEquals(0.0, volume);
    }

    @Test
    public void testCalcularPotenciaDoTermostato(){
        Aquario aquario = new Aquario();

        aquario.altura = 50.0;
        aquario.comprimento = 100.0;
        aquario.largura = 50.0;
        double temperaturaDesejada = 30;
        double temperaturaAmbiente = 17;

        double potencia = aquario.calcularPotenciaDoTermostato(temperaturaDesejada, temperaturaAmbiente);

        assertEquals(162.5, potencia);
    }

    @Test
    public void calcularQuantidadeLitrosDuasETr3sVezes(){
        Aquario aquario = new Aquario();

        aquario.altura = 50.0;
        aquario.comprimento = 100.0;
        aquario.largura = 50.0;

        double[] litros = aquario.calcularQuantidadeLitrosFiltro();
        double[] esperado = {500, 750};
        assertArrayEquals(esperado, litros);
    }
}
