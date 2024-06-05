public abstract class Conta implements IConta { // esta abstract pois nao faz sentido dar um new Conta, sem dizer se é
                                                // corrente ou pupança... logo ela deve ser criada na criacao das
                                                // classes filhas.
    private static final int AGENCIA_PADRAO = 0;
    private static int SEQUENCIAL = 1; // static pq a relacao é com a classe conta corrente mas nao por quem instanciar
                                       // ela
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;

        banco.adicionarConta(this);

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        }
        System.out.println("Valor de saque é menor que valor em conta! Operação Negada");
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero: " + this.numero);
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
