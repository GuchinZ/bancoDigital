package first;

public class Main {
    public static void main(String[] args) {
        Cliente gustavo = new Cliente();
        gustavo.setNome("Gustavo");
        
        Conta cc = new Corrente(gustavo);
        Conta cp = new Poupanca(gustavo);

        cc.depositar(200);
        cc.trasferir(20, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }
}
