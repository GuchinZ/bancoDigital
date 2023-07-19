package first;

public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;    

    protected double saldo;
    protected int conta;
    protected int agencia;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void trasferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void ImprimirInfosComuns() {
        System.out.printf("Titular: %s\n", this.cliente.getNome());
        System.out.printf("Agência: %d\n", this.agencia);
           System.out.printf("Conta: %d\n", this.conta);
           System.out.printf("Saldo: %.2f\n", this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public int getConta() {
        return conta;
    }

    public int getAgencia() {
        return agencia;
    }
}
