package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adcionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adcionarContato("Camila", 12345);
        agendaContatos.adcionarContato("Camila", 12345);
        agendaContatos.adcionarContato("Allan", 41233);
        agendaContatos.adcionarContato("Maiá", 45123);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Allan"));
        System.out.println(agendaContatos.pesquisarPorNome("Maiá"));

        agendaContatos.removerContato("Camila");

        agendaContatos.exibirContatos();
    }

}
