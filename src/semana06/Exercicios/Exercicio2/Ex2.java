package semana06.Exercicios.Exercicio2;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira sua altura em metros: ");
        float altura = sc.nextFloat();

        System.out.print("Insira seu peso em Kg: ");
        float peso = sc.nextFloat();

        if (altura <= 0 || peso <= 0){
            System.out.println("Erro! Entrada inválida! Por favor, insira um número válido.");
            sc.close();
            return;
        }

        float imc = CalculoIMC.CalcularImc(peso, altura);
        String categoria = CalculoIMC.CalcularCategoria(imc);
        String pesoComum = CalculoIMC.CalcularPesoComum(imc, altura, peso);

        System.out.println("Você está em " + categoria + " IMC =" + imc);
        System.out.println( pesoComum );
    
        sc.close();
    }
}
