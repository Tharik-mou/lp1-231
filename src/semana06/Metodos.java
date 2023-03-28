package semana06;

public class Metodos {

    public static void main(String[] args) {
        System.out.println(Math.sqrt(25.0));

        imprimirPalavra("Olá Mundo");
        
        double soma = Calculadora.somar(10.0, 2.0);
        System.out.println(soma);

        System.out.println(Calculadora.somar(10.0, 3.0));
    }

    


    // public - modificador de acesso - qualquer classe em qualquer 
    // pacote pode acessar o método
    // static - o método fica associado à classe e não a objetos dela
    // void - tipo de retorno do método (sem retorno void)
    // imprimirPalavra - nome do método
    // parâmetros - referências aos valores passados na chamada do método

    public static void imprimirPalavra(String palavra){

        System.out.println(palavra.toUpperCase());


    }
}
