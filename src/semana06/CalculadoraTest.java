package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void somarDoisNumerosPositivos() {
        // AAA

        // Arrange
        double numero1 = 10.0;
        double numero2 = 2.0;

        // Act
        double soma = Calculadora.somar(numero1, numero2);

        // Assert
        assertEquals(12.0, soma);

    }

   
    @Test
    public void somarUmNumeroPositivoEUmNegativo() {
        double numero1 = 10.0;
        double numero2 = -2.0;

        double soma = Calculadora.somar(numero1, numero2);

        // Assert
        assertEquals(8.0, soma);
    }

    @Test
    public void somarDoisNumerosNegativos() {
        double numero1 = -10.0;
        double numero2 = -2.0;

        double soma = Calculadora.somar(numero1, numero2);

        // Assert
        assertEquals(-12.0, soma);
    }

        @Test
        public void subtraiNumerosPositivos() {
            double numero1 = 10.0;
            double numero2 = 2.0;

            double subtrair = Calculadora.subtrair(numero1, numero2);

            // Assert
            assertEquals(12.0, subtrair);
        }

        @Test
        public void subtraiUmNumeroPositivoEUmNegativo() {
            double numero1 = 10.0;
            double numero2 = -2.0;

            double subtrair = Calculadora.subtrair(numero1, numero2);

            // Assert
            assertEquals(8.0, subtrair);
        }

        @Test
        public void subtraiNumerosNegativos() {
            double numero1 = -10.0;
            double numero2 = -2.0;

            double subtrair = Calculadora.subtrair(numero1, numero2);

            // Assert
            assertEquals(-12.0, subtrair);
        }

            @Test
            public void NumerosNegativos() {
                double numero1 = -10.0;
                double numero2 = -2.0;

                double subtrair = Calculadora.subtrair(numero1, numero2);

                // Assert
                assertEquals(-12.0, subtrair);
            }

            @Test
            public void multiplicarDoisNumerosPositivos() {
                double numero1 = 10.0;
                double numero2 = 2.0;

                double multiplica = Calculadora.multiplicar(numero1, numero2);

                // Assert
                assertEquals(20.0, multiplica);
            }

            @Test
            public void multiplicaUmNumeroPositivoEUmNegativo() {
                double numero1 = 10.0;
                double numero2 = -2.0;
    
                double multiplica = Calculadora.multiplicar(numero1, numero2);
    
                // Assert
                assertEquals(-20.0, multiplica);
            }

            @Test
            public void multiplicaDoisNegativo() {
                double numero1 = -10.0;
                double numero2 = -2.0;
    
                double multiplica = Calculadora.multiplicar(numero1, numero2);
    
                // Assert
                assertEquals(20.0, multiplica);
            }
                @Test
                //dividir
                public void dividirDoisNumerosPositivos() {
                    double numero1 = 10.0;
                    double numero2 = 2.0;

                    double dividir = Calculadora.dividir(numero1, numero2);

                    // Assert
                    assertEquals(5.0, dividir);
                }

                @Test
                public void dividirUmNumeroPositivoEUmNegativo() {
                    double numero1 = 10.0;
                    double numero2 = -2.0;

                    double dividir = Calculadora.dividir(numero1, numero2);

                    // Assert
                    assertEquals(-5.0, dividir);
                }
                @Test
                //dividir
                public void dividirDoisNumerosNegativos() {
                    double numero1 = -10.0;
                    double numero2 = -2.0;

                    double dividir = Calculadora.dividir(numero1, numero2);

                    // Assert
                    assertEquals(5.0, dividir);
                }
}