package first;

public abstract class Conta implements IConta{
    private double saldo;
    private int conta;
    private int agencia;

    public void sacar(double valor){
        
    }

    public void depositar(double valor){

    }

    public void trasferir(double valor, Conta contaDestino){

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
