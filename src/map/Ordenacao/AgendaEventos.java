package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        /*Set<LocalDate> dataSet = eventoMap.keySet();
        Collections<Evento> values = eventoMap.values();*/
        //eventoMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + " acontecerá na data" + proximaData);
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.FEBRUARY, 1), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 2, 9), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atracao 3");
        //agendaEventos.adicionarEvento(LocalDate.of(2025, Month.FEBRUARY, 25), "Evento 4", "Atracao 4");
       // agendaEventos.adicionarEvento(LocalDate.of(2025, Month.FEBRUARY, 26), "Evento 5", "Atracao 5");
        agendaEventos.adicionarEvento(LocalDate.of(2026, Month.SEPTEMBER, 20), "Evento 6", "Atracao 6");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

        

    }
}
