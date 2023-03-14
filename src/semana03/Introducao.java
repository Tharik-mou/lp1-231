package semana03;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Introducao {
    public static void main(String[] args){
        // Comentario de uma linha
        /* Comentario
        * de
        * varias 
        * linhas */

        // tip´os primitivos

        //inteiros
            // byte, short, int, long

            byte n1 = 100; // 1 byte -128 a 127
            short n2 = 3000; // 2 bytes -32768 a 32767
            int n3 = 321312321; // 4 bytes - 2 bilhoes
            long n4 = 23234; // 8 bytes - 4 bilhões
        char letra = 'A';

        // boolean
        boolean ligado = true;
        boolean teste = false;

        //

        // string
        String nome = "Abacate";
        System.out.println(nome);
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        // variaveis e constantes
        int idade = 20;

        int idade2;
        idade2 = 30;

        // java 10 - inferencia de tipo com var
        var idade3 = 15;
        var nome2 = "Maria";

        //constante - keyword final
        final double TESTE = 20.2;
        final double PI = 3.14;

        // entrada e saida de dados

        // Entrada - Classe Scanner
        // Saída - System.out

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com seu nome");
        String nomeInformado = sc.nextLine();

        System.out.println("Entre com a sua idade");
        int idadeInformada = sc.nextInt();

        System.out.println(nomeInformado +" "+ idadeInformada);
        System.out.printf("%s %d \n", nomeInformado, idadeInformada);
        sc.close();

        

    }
}
