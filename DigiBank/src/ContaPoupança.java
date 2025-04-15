public class ContaPoupança extends Conta {

    private final byte operacao = 013;
    byte agencia = 127;

    public ContaPoupança() {
        super.agencia = this.agencia;
        this.numeroConta = super.sequencial++;
    }
}