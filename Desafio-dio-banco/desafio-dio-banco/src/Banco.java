import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Banco {
    private String nome;

    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void exibirContas() {
        Consumer<Conta> exibirContas = conta -> System.out.println(conta);

        contas.stream()
                .forEach(exibirContas);
    }

}
