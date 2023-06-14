package semana14.exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals; 

public class PessoaTest {

    @Test
    public void testIndicarValoresParaVariaveis(){
        Pessoa pessoa = new Pessoa(87.0, 1.80);

        assertEquals(87.0, pessoa.peso);
        assertEquals(1.80, pessoa.altura);
    }

    @Test
    public void testIndicarPesoInvalido(){
        Pessoa pessoa = new Pessoa(0, 1.80);

        assertThrows(IllegalArgumentException.class, () -> {
            new Pessoa(0, 1.80);
        });
    }

    @Test
    public void testIndicarAlturaInvalida(){
        Pessoa pessoa = new Pessoa(65.0, 0.0);

        assertThrows(IllegalArgumentException.class, () -> {
            new Pessoa(65.0, 0.0);
        });
    }
    
    @Test
    public void testCalcularIMC(){
        Pessoa pessoa = new Pessoa(87.0, 1.80);

        pessoa.altura = 1.80;
        pessoa.peso = 87;
        
        double IMC = pessoa.calcularIMC();

        assertEquals(26.85, IMC, 0.01);
    }

    @Test
    public void testCalcularIMCAbaixoDoPeso(){
        Pessoa pessoa = new Pessoa(50.0, 1.80);

        pessoa.altura = 1.80;
        pessoa.peso = 50;

        String faixa = pessoa.getFaixa();
        String esperado = "Baixo peso";

        assertEquals(esperado, faixa);
    }

    @Test
    public void testCalcularIMCPesoIdeal(){
        Pessoa pessoa = new Pessoa(65.0, 1.80);

        pessoa.altura = 1.80;
        pessoa.peso = 65;

        String faixa = pessoa.getFaixa();
        String esperado = "Peso normal";

        assertEquals(esperado, faixa);

    }

    @Test
    public void testCalcularIMCAcimaDoPeso(){
        Pessoa pessoa = new Pessoa(90.0, 1.80);

        pessoa.altura = 1.80;
        pessoa.peso = 90;

        String faixa = pessoa.getFaixa();
        String esperado = "Excesso de peso";

        assertEquals(esperado, faixa);
    }

    @Test
    public void testCalcularIMCObesidadeI(){
        Pessoa pessoa = new Pessoa(100.0, 1.80);

        pessoa.altura = 1.80;
        pessoa.peso = 100;

        String faixa = pessoa.getFaixa();
        String esperado = "Obesidade de Classe 1";

        assertEquals(esperado, faixa);
    }

    @Test
    public void testCalcularIMCObesidadeII(){
        Pessoa pessoa = new Pessoa(120.0, 1.80);

        pessoa.altura = 1.80;
        pessoa.peso = 120;

        String faixa = pessoa.getFaixa();
        String esperado = "Obesidade de Classe 2";

        assertEquals(esperado, faixa);
    }

    @Test
    public void testCalcularIMCObesidadeIII(){
        Pessoa pessoa = new Pessoa(140.0, 1.80);

        pessoa.altura = 1.80;
        pessoa.peso = 140;

        String faixa = pessoa.getFaixa();
        String esperado = "Obesidade de Classe 3";

        assertEquals(esperado, faixa);
    }

    @Test
    public void testCalcularSituaçãoGanhar(){
        Pessoa pessoa = new Pessoa(40.0, 1.80);

        pessoa.altura = 1.80;
        pessoa.peso = 40;

        String situacao = pessoa.getSituacao();

        assertEquals("GANHAR", situacao);
    }

    @Test
    public void testCalcularSituaçãoPerder(){
        Pessoa pessoa = new Pessoa(90.0, 1.80);

        pessoa.altura = 1.80;
        pessoa.peso = 90;

        String situacao = pessoa.getSituacao();

        assertEquals("PERDER", situacao);
    }

    @Test
    public void testCalcularSituaçãoNormal(){
        Pessoa pessoa = new Pessoa(60.0, 1.80);

        pessoa.altura = 1.80;
        pessoa.peso = 60;

        String situacao = pessoa.getSituacao();
        String esperado = "NORMAL";

        assertEquals(esperado, situacao);
    }

    @Test
    public void testaSetPesoZero() {
        
        Pessoa p1 = new Pessoa(172, 70.3);

        assertThrows(RuntimeException.class, () -> {
            p1.setPeso(0.0);
        });
    }

    @Test
    public void testaSetPesoNegativo() {
        
        Pessoa p1 = new Pessoa(172, 70.3);

        assertThrows(RuntimeException.class, () -> {
            p1.setPeso(-75.1);
        });
    }

    @Test
    public void testaSetPeso() {
        
        Pessoa p1 = new Pessoa(172, 70.3);
        p1.setPeso(75.1);

        double peso = p1.getPeso();

        assertEquals(75.1, peso);
    }

    @Test
    public void testaSetAlturaZero() {
        
        Pessoa p1 = new Pessoa(172, 70.3);

        assertThrows(RuntimeException.class, () -> {
            p1.setAltura(0);
        });
    }

    @Test
    public void testaSetAlturaNegativa() {
        
        Pessoa p1 = new Pessoa(172, 70.3);

        assertThrows(RuntimeException.class, () -> {
            p1.setAltura(-172);
        });
    }

    @Test
    public void testaSetAltura() {
        
        Pessoa p1 = new Pessoa(172, 70.3);
        p1.setAltura(180);

        double altura = p1.getAltura();

        assertEquals(180, altura);
    }

    @Test
    public void testaGetPeso() {
        
        Pessoa p1 = new Pessoa(172, 70.3);

        double peso = p1.getPeso();

        assertEquals(70.3, peso);
    }

    @Test
    public void testaGetAltura() {
        
        Pessoa p1 = new Pessoa(172, 70.3);

        double altura = p1.getAltura();

        assertEquals(172, altura);
    }

    @Test
    public void testaGetSituacao3() {

        Pessoa p1 = new Pessoa(172, 73.8);

        String situacao = p1.getSituacao();

        assertEquals("NORMAL", situacao);
    }

    @Test
    public void testaGetSituacao2() {

        Pessoa p1 = new Pessoa(172, 100.3);

        String situacao = p1.getSituacao();

        assertEquals("PERDER", situacao);
    }

    @Test
    public void testaGetSituacao1() {

        Pessoa p1 = new Pessoa(172, 50.3);

        String situacao = p1.getSituacao();

        assertEquals("GANHAR", situacao);
    }

    @Test
    public void testaGetFaixa6() {

        Pessoa p1 = new Pessoa(172, 120.3);

        String faixa = p1.getFaixa();

        assertEquals("Classificação: Obesidade classe 3", faixa);
    }

    @Test
    public void testaGetFaixa5() {

        Pessoa p1 = new Pessoa(172, 110.3);

        String faixa = p1.getFaixa();

        assertEquals("Classificação: Obesidade classe 2", faixa);
    }

    @Test
    public void testaGetFaixa4() {

        Pessoa p1 = new Pessoa(172, 90.3);

        String faixa = p1.getFaixa();

        assertEquals("Classificação: Obesidade classe 1", faixa);
    }

    @Test
    public void testaGetFaixa3() {

        Pessoa p1 = new Pessoa(172, 80.3);

        String faixa = p1.getFaixa();

        assertEquals("Classificação: Excesso de peso", faixa);
    }

    @Test
    public void testaGetFaixa2() {

        Pessoa p1 = new Pessoa(172, 70.3);

        String faixa = p1.getFaixa();

        assertEquals("Classificação: Peso Normal", faixa);
    }

    @Test
    public void testaGetFaixa1() {

        Pessoa p1 = new Pessoa(172, 54.3);

        String faixa = p1.getFaixa();

        assertEquals("Classificação: Baixo Peso", faixa);
    }
}
