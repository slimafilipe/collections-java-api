package set.Pesquisa;


import java.util.HashSet;

import java.util.Set;

public class ListaTarefa {
    private Set<Tarefa> tarefaSet;

    public ListaTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover = t;
                break;
            }
        }
        tarefaSet.remove(tarefaParaRemover);

    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (t.isConclusao()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (!t.isConclusao()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String descricao){
        Tarefa tarefaConcluida = null;
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConclusao(true);
                tarefaConcluida = t;
                break;
            }
        }
        return  tarefaConcluida;
    }

    public void marcarTarefaPendete(String descricao){
        Tarefa tarefaPendente = null;
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaPendente = t;
                break;
            }
        }

        if (tarefaPendente != null){
            if (tarefaPendente.isConclusao()){
                tarefaPendente.setConclusao(false);
            }
        }else {
            System.out.println("Tarefa não encontrada");
        }
    }



    public void limparListaTarefas(){
        if (tarefaSet.isEmpty()){
            System.out.println("Lista já está vázia");
        }else {
            tarefaSet.clear();
        }
    }


    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Estudar Java");
        listaTarefa.adicionarTarefa("Fazer exercícios físicos");
        listaTarefa.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefa.adicionarTarefa("Ler livro");
        listaTarefa.adicionarTarefa("Preparar apresentação");

        listaTarefa.exibirTarefas();
        System.out.println("Total de: " + listaTarefa.contarTarefas());

        listaTarefa.removerTarefa("Fazer exercícios físicos");
        listaTarefa.exibirTarefas();
        System.out.println("Total de: " + listaTarefa.contarTarefas());

        System.out.println(listaTarefa.obterTarefasPendentes());

        listaTarefa.marcarTarefaConcluida("Ler livro");
        listaTarefa.marcarTarefaConcluida("Estudar Java");

        System.out.println(listaTarefa.obterTarefasConcluidas());

        listaTarefa.marcarTarefaPendete("Estudar Java");
        listaTarefa.exibirTarefas();

        listaTarefa.limparListaTarefas();
        listaTarefa.exibirTarefas();


    }
}
