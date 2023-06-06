package semana14.exercicios;

public class Conta {
    public int codigo = 0;
    public double saldo = 0;
    public String correntista = "";

    public Conta (int codigo, String correntista){
        if(codigo <= 0)
            throw new IllegalArgumentException("Codigo Inválido");
        if(correntista == "" || correntista == "")
            throw new IllegalArgumentException("Nome Inválido");
        this.codigo = codigo;
        this.correntista = correntista;
    }

    public double sacar(double valor){
        if(valor > saldo)
            throw new IllegalArgumentException("Valor requerido inválido");

        return saldo = saldo - valor;
    }

    public double depositar(double valor){
        return saldo = saldo + valor;
    }

    public double transferir(Conta contaDestino, double valor){
        if(saldo < valor)
            throw new IllegalArgumentException("Valor requerido é inválido");
        sacar(valor);
        contaDestino.depositar(valor);
        return saldo;
    }
}