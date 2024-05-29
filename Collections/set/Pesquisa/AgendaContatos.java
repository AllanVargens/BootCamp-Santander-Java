package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroContato) {
        this.contatoSet.add(new Contato(nome, numeroContato));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }

        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;

        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
            }
            break;
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("José", 987654321);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria B", 987354311);
        agendaContatos.adicionarContato("Maria C", 987655326);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        agendaContatos.atualizarNumeroContato("Maria", 999999999);
        agendaContatos.exibirContatos();

    }

    
}
