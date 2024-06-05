public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Meu Banco");

        Cliente cliente1 = new Cliente("Cliente 1");

        Conta cc1 = new ContaCorrente(cliente1, banco);
        Conta cp1 = new ContaPoupanca(cliente1, banco);

        cc1.depositar(100);
        cp1.depositar(100);

        cp1.transferir(cc1, 70);

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();

        System.out.println("Listando contas do banco:");
        banco.exibirContas();
    }
}
