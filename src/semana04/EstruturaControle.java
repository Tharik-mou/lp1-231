package semana04;

import java.net.InetAddress;
import java.time.temporal.ValueRange;

public class EstruturaControle {
    public static void main(String[] args) {
        //if

         int idade = 17;
        final int MAIORIDADE = 18;
        if(idade >= MAIORIDADE) {
            System.out.println("Maior de idade");
        }

        //if/else
        boolean ligado = true;
        if (ligado) {
            System.out.println("Sensor ligado!");
        } else {
            System.out.println("Sensor desligado");
        }
        

        //switch
        //char, byte, short, int
        //enum
        int x = 3;
        switch (x) {
            case 1:
                System.out.println("numero 1");
                break;
            case 2:
                System.out.println("numero 2");
                break;
            case 3:
                System.out.println("numero 3");
                break;
            default:
                System.out.println("numero não identificado");
                break;

        }

        // while, do while, for e foreach

        int contador = 0;
        while(contador < 3){
            System.out.println("ligado");
            contador ++;
        }
        
        contador = 0;
        do {
            System.out.println("ligado!");
            contador++;
        } while (contador < 3);

        for (int index = 0; index < 3; index++) {
            System.out.println("ligado! fori");
        }

        // Arrays
        // Varios elementos em uma mesma variavel
        // acesso os dados com numero inteiro
        // a primeira posição começa com 0
        // notas = [_______,_______,________]
        //             0       1        2

        // 3 notas
        double n1 = 10.0;
        double n2 = 5.5;
        double n3 = 2.5;

        double[] notas = new double[3];
        notas[0] = 10.0;
        notas[1] = 5.5;
        notas[2] = 2.5;

        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        //foreach
        for (double nota : notas) {
            System.out.println(nota);
        }
            
        }
        

    }
