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

    public int getCodigo() {
        return codigo;
    }

     public String getCorrentista() {
        return correntista;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setCodigo(int codigo) {
        if(codigo <= 0) 
            throw new RuntimeException("Código não permitido");
        this.codigo = codigo;
    }

    private void setCorrentista(String correntista) {
        if(correntista.length() < 5 || correntista.length() > 100) 
            throw new RuntimeException("O nome do titular deve ter no mínimo 5 e no máximo 100 caracteres");
        this.correntista = correntista;
    }

    private void setSaldo(double saldo) {
        if(saldo < 0.0) 
            throw new RuntimeException("Você não pode sacar ou transferir um valor maior que o seu saldo");
        this.saldo = saldo;
    }
}