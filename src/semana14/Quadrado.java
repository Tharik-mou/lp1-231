package semana14;

public class Quadrado{
    private double lado;

    // Construtor

    /* public Quadrado(double l){
        lado = l;
    } */

    public Quadrado(double lado){
        this.lado = lado;
    } 

    //metodos

    public double calcularArea() {
        return lado * lado;
    }
    public double calcularPerimetro(){
        return 4 * lado;
    }

    // GETTERS

    /*public TIPO ATRIBUTO getNOME ATRIBUTO(){
        return ATRIBUTO;
    }*/

    public double getLado(){
        return lado;
    }

    // SETTERS
    /*public TIPO ATRIBUTO setNOME ATRIBUTO(TIPO_ATRIBUTO ATRIBUTO){
        this.ATRIBUTO = ATRIBUTO;

        public boolean setLado(double lado){
        if(lado > 0){
            this.lado = lado;
            return true;
        } else {
            return false;
        }
    }
    }*/

    
    public void setLado1(double lado){
        if(lado <= 0){
            throw new RuntimeException("Lado Inválido");
        }
        this.lado = lado;
    }
}