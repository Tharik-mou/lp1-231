package semana14.exercicios;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class ContaTest {

    @Test
    public void testIndicarValoresParaAConta(){
        Conta conta = new Conta(1, "Tiago Delicia");

        assertEquals(1, conta.codigo);
        assertEquals("Tiago Delicia", conta.correntista);
        assertEquals(0.0, conta.saldo);
    }

    @Test
    public void testSaqueDaConta(){
        Conta conta = new Conta(1, "Tiago Delicia");

        conta.depositar(20.0);
        double saldoSaque = conta.sacar(10.0);

        assertEquals(10.0, saldoSaque);
    }

    @Test
    public void testSaqueMaisDoQueTemNaConta(){
        Conta conta = new Conta(1, "Tiago Delicia");

        conta.depositar(100.0);
 
        assertThrows(IllegalArgumentException.class, () -> {
            conta.sacar(150.0);
        });
    }

    @Test
    public void testDepositoDaConta(){
        Conta conta = new Conta(1, "Tiago Delicia");

        conta.depositar(20.0);
        double saldoDeposito = conta.depositar(180.0);

        assertEquals(200.0, saldoDeposito);
    }

    @Test
    public void testTransferenciaDaConta(){
        Conta contaCorrente = new Conta(1, "Tiago Delicia");
        Conta contaPoupança = new Conta(2, "Tiago Delicia");

        contaCorrente.depositar(100.0);

        double contaRemetente = contaCorrente.transferir(contaPoupança, 50.0);
        double contaDestino = contaPoupança.saldo;

        assertEquals(50.0, contaRemetente);
        assertEquals(50.0, contaDestino);
    }

    @Test
    public void testTransferirMaisDoQueTemNaConta(){
        Conta contaCorrente = new Conta(1, "Tiago Delicia");
        Conta contaPoupanca = new Conta(2, "Tiago Delicia");

        contaCorrente.depositar(100.0);

        assertThrows(IllegalArgumentException.class, () -> {
            contaCorrente.transferir(contaPoupanca, 110.0);
        });
    }

    @Test
    public void testaGetCodigo() {
        Conta conta = new Conta(1, "Domingos Latorre");

        int codigo = conta.getCodigo();

        assertEquals(1, codigo);
    }

    @Test
    public void testaGetCorrentista() {
        Conta conta = new Conta(1, "Domingos Latorre");

        String correntista = conta.getCorrentista();

        assertEquals("Domingos Latorre", correntista);
    }

    @Test
    public void testaGetSaldo() {
        Conta conta = new Conta(1, "Domingos Latorre");

        double saldo = conta.getSaldo();

        assertEquals(0.0, saldo);
    }
}
