package Ordenacao;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirEventos() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        // Set<LocalDate> dateSet = eventosMap.keySet(); // retorna todas as keys dos
        // eventos
        // Collection<Evento> values = eventosMap.values();// retorna todos os valores

        // os dois casos acima nao se conhecem e sao independentes

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + " acontecera na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 10), "Festa de aniversario",
                "Academia de dança");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 3), "Evento 2",
                "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 7), "Evento 3",
                "Atracao 3");

        agendaEventos.exibirEventos();

        agendaEventos.obterProximoEvento();
    }

}
