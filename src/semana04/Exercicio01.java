package semana04;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Programa para pegar antecessor e sucessor de um numero");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o numero: ");
        int numero1 = sc.nextInt();
        int antecessor = numero1 - 1;
        int sucessor = numero1 + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        sc.close();
    }
}
