package semana05;

import java.util.Scanner;  

public class Ex02 {
    public static void main(String[] args){
        double kg, metros, imc, pi;

        Scanner sc= new Scanner(System.in);
        System.out.println("Escreva seu peso em Kg");
        kg = sc.nextDouble();
        System.out.println("Escreva sua altura em metros");
        metros= sc.nextDouble();
        sc.close();
        imc= kg / (metros * metros);
        System.out.println("Seu IMC é " +imc);
        pi= imc-24.9;
        System.out.println("Você deve perder " +pi);

    }


}
