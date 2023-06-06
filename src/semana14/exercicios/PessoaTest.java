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
}
