package semana12.exercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals; 

public class PessoaTest {
    
    @Test
    public void calcularIMC(){
        Pessoa pessoa = new Pessoa();

        pessoa.altura = 1.80;
        pessoa.peso = 87;
        
        double IMC = pessoa.calcularIMC();

        assertEquals(26.85, IMC, 0.01);
    }

    @Test
    public void calcularIMCAbaixoDoPeso(){
        Pessoa pessoa = new Pessoa();

        pessoa.altura = 1.80;
        pessoa.peso = 50;

        String faixa = pessoa.getFaixa();
        String esperado = "Baixo peso";

        assertEquals(esperado, faixa);
    }

    @Test
    public void calcularIMCPesoIdeal(){
        Pessoa pessoa = new Pessoa();

        pessoa.altura = 1.80;
        pessoa.peso = 65;

        String faixa = pessoa.getFaixa();
        String esperado = "Peso normal";

        assertEquals(esperado, faixa);

    }

    @Test
    public void calcularIMCAcimaDoPeso(){
        Pessoa pessoa = new Pessoa();

        pessoa.altura = 1.80;
        pessoa.peso = 90;

        String faixa = pessoa.getFaixa();
        String esperado = "Excesso de peso";

        assertEquals(esperado, faixa);
    }

    @Test
    public void calcularIMCObesidadeI(){
        Pessoa pessoa = new Pessoa();

        pessoa.altura = 1.80;
        pessoa.peso = 100;

        String faixa = pessoa.getFaixa();
        String esperado = "Obesidade de Classe 1";

        assertEquals(esperado, faixa);
    }

    @Test
    public void calcularIMCObesidadeII(){
        Pessoa pessoa = new Pessoa();

        pessoa.altura = 1.80;
        pessoa.peso = 120;

        String faixa = pessoa.getFaixa();
        String esperado = "Obesidade de Classe 2";

        assertEquals(esperado, faixa);
    }

    @Test
    public void calcularIMCObesidadeIII(){
        Pessoa pessoa = new Pessoa();

        pessoa.altura = 1.80;
        pessoa.peso = 140;

        String faixa = pessoa.getFaixa();
        String esperado = "Obesidade de Classe 3";

        assertEquals(esperado, faixa);
    }

    @Test
    public void calcularSituaçãoGanhar(){
        Pessoa pessoa = new Pessoa();

        pessoa.altura = 1.80;
        pessoa.peso = 50;

        String situacao = pessoa.getSituacao();
        String esperado = "GANHAR";

        assertEquals(esperado, situacao);
    }

    @Test
    public void calcularSituaçãoPerder(){
        Pessoa pessoa = new Pessoa();

        pessoa.altura = 1.80;
        pessoa.peso = 90;

        String situacao = pessoa.getSituacao();
        String esperado = "PERDER";

        assertEquals(esperado, situacao);
    }

    @Test
    public void calcularSituaçãoNormal(){
        Pessoa pessoa = new Pessoa();

        pessoa.altura = 1.80;
        pessoa.peso = 60;

        String situacao = pessoa.getSituacao();
        String esperado = "NORMAL";

        assertEquals(esperado, situacao);
    }
}
