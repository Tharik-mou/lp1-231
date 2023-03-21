package semana05;

import java.util.Scanner;

public class Ex01{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("qual o comprimento do aquario(cm): ");
        int comprimento = sc.nextInt();

        Scanner sa = new Scanner(System.in);
        System.out.printf("qual a altura do aquario(cm): ");
        float altura = sa.nextFloat();

        Scanner ss = new Scanner(System.in);
        System.out.printf("qual o largura do aquario(cm): ");
        float largura = ss.nextFloat();

        Scanner st = new Scanner(System.in);
        System.out.println("qual a temperatura desejada(celsius): ");
        float temperaturaDesejada = st.nextFloat();

        Scanner sd = new Scanner(System.in);
        System.out.println("qual a temperatura ambiente(celsius): ");
        float temperaturaAmbiente = sd.nextFloat();

        double volume = (comprimento * altura * largura) / 1000;
        System.out.println("o volume do aquario é: " + volume);

        double potencia = (volume * 0.05 * (temperaturaDesejada - temperaturaAmbiente));
        System.out.println("A potencia do termostato é: " + potencia);

        double filtragem = volume * 3;
        System.out.println("A filtragem do aquario por hora é: " + filtragem);
    }

}