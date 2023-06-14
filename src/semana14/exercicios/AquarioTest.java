package semana14.exercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertArrayEquals; 

public class AquarioTest {
    
    @Test
    public void testIndicarValoresParaAsVariaveis(){
        Aquario aquario = new Aquario(100.0, 50.0, 50.0);

        assertEquals(100.0, aquario.comprimento);
        assertEquals(50.0, aquario.altura);
        assertEquals(50.0, aquario.largura);
    }

    @Test
    public void testIndicarUmUnicoValor(){
        Aquario aquario = new Aquario(50.0, 50.0, 50.0);

        assertEquals(50.0, aquario.comprimento);
        assertEquals(50.0, aquario.altura);
        assertEquals(50.0, aquario.largura);
    }

    @Test
    public void testCalcularVolume(){
        Aquario aquario = new Aquario(100.0, 50.0, 50.0);

        aquario.altura = 50.0;
        aquario.comprimento = 100.0;
        aquario.largura = 50.0;

        double volume = aquario.calcularVolume();

        assertEquals(250.0, volume);
    }

    @Test
    public void testCalcularVolume2(){
        Aquario aquario = new Aquario(100.0, 50.0, 0.0);

        aquario.altura = 50.0;
        aquario.comprimento = 100.0;
        aquario.largura = 0.0;

        double volume = aquario.calcularVolume();

        assertEquals(0.0, volume);
    }

    @Test
    public void testCalcularPotenciaDoTermostato(){
        Aquario aquario = new Aquario(100.0, 50.0, 50.0);

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
        Aquario aquario = new Aquario(100.0, 50.0, 50.0);

        aquario.altura = 50.0;
        aquario.comprimento = 100.0;
        aquario.largura = 50.0;

        double[] litros = aquario.calcularQuantidadeLitrosFiltro();
        double[] esperado = {500, 750};
        assertArrayEquals(esperado, litros);
    }

    @Test
    public void apresentarGetAltura(){
        Aquario aquario = new Aquario(100, 20, 30);

        double altura = aquario.getAltura();

        assertEquals(20, altura);
    }

    @Test
    public void apresentarGetLargura(){
        Aquario aquario = new Aquario(100, 20, 30);

        double largura = aquario.getLargura();

        assertEquals(30, largura);
    }
    @Test
    public void testaGetComprimento() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);

        double comprimento = aquario.getComprimento();

        assertEquals(30.0, comprimento);
    }
     @Test
    public void testaSetComprimento() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);
        aquario.setComprimento(20.0);

        double comprimento = aquario.getComprimento();

        assertEquals(20.0, comprimento);
    }
    @Test
    public void testaSetComprimentoNegativo() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);

        assertThrows(RuntimeException.class, () -> {
            aquario.setComprimento(-30.0);
        });
    }

    @Test
    public void testaSetComprimentoZero() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);

        assertThrows(RuntimeException.class, () -> {
            aquario.setComprimento(0.0);
        });
    }

    @Test
    public void testaSetAltura() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);
        aquario.setAltura(60.0);

        double altura = aquario.getAltura();

        assertEquals(60.0, altura);
    }

     @Test
    public void testaSetAlturaNegativa() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);

        assertThrows(RuntimeException.class, () -> {
            aquario.setAltura(-40.0);
        });
    }

     @Test
    public void testaSetAlturaZero() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);

        assertThrows(RuntimeException.class, () -> {
            aquario.setAltura(0.0);
        });
    }

    @Test
    public void testaSetLargura() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);
        aquario.setLargura(70.0);

        double largura = aquario.getLargura();

        assertEquals(70.0, largura);
    }

    @Test
    public void testaSetLarguraNegativa() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);

        assertThrows(RuntimeException.class, () -> {
            aquario.setLargura(-50.0);
        });
    }

    @Test
    public void testaSetLarguraZero() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);

        assertThrows(RuntimeException.class, () -> {
            aquario.setLargura(0.0);
        });
    }
}
