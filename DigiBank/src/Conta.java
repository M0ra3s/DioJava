import java.math.BigDecimal;

public abstract class Conta {

    protected int sequencial = 1;
    protected int numeroConta;
    protected byte agencia;
    protected float deposito;
    protected float saldo = deposito;

    public Conta() {
        this.numeroConta = sequencial++;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public void sacar(float valor) {
        saldo -= valor;
    }

    public void transferir(float valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato() {
        System.out.println("===Extrato Banco===");
        System.out.println("Agencia: " + this.agencia);

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public byte getAgencia() {
        return agencia;
    }

}
