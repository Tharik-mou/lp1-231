package semana10;

public class Programa {
    public static void main(String[] args) {

        // tipo nomevariavel = valor 
        // String palavra = "Michelles";
        // Objeto (ou instância) da classe Retangulo
        Retangulo ret1 = new Retangulo();
        ret1.base = 10.0;
        ret1.altura = 5.0;

        Retangulo ret2 = new Retangulo();
        ret2.base = 30.0;
        ret2.altura = 15.0;

        System.out.println(ret1.calcularArea());
        System.out.println(ret1.calcularPerimetro());

        System.out.println(ret2.calcularArea());
        System.out.println(ret2.calcularPerimetro());

        Quadrado quad1 = new Quadrado();
        quad1.lado = 5.0;

        System.out.println(quad1.calcularArea());
        System.out.println(quad1.calcularPerimetro());

        Redondo red1 = new Redondo();
        red1.raio = 10.0;

        System.out.println(red1.calcularArea());
        System.out.println(red1.calcularPerimetro());
    }
}