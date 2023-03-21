package semana04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu número de identificação: ");
        String identificador = sc.nextLine();
        char terceiraLetra = identificador.charAt(2);
        char quartaLetra = identificador.charAt(3);
        char quintaLetra = identificador.charAt(4);
        char sextaLetra = identificador.charAt(5);

        if (identificador.length() == 7 && identificador.startsWith("BR") && identificador.endsWith("X") && Character.isDigit(terceiraLetra) && Character.isDigit(quartaLetra) && Character.isDigit(quintaLetra) && Character.isDigit(sextaLetra)){
            System.out.println("Seu número identificador é válido!");
        } else {
            System.out.println("Seu número identificador é inválido!");
        }
        sc.close();
    }
}