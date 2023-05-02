package semana10;

public class Redondo {
    public double raio;

    public double calcularArea(){
        return Math.PI * (raio * raio);
    }
    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }
}
