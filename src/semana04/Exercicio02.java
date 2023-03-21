package semana04;

import java.util.Scanner;

public class Exercicio02 {


    public static void main(String[] args) {
        System.out.println("Este programa faz a media aritmetica de tres numeros");

        Scanner sc = new Scanner(System.in);

        float n1, n2, n3 = 0.0f;

        System.out.println("Entre com os tres numeros: ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        System.out.printf("A media aritmetica e: %f", media);

        sc.close();
    }
}