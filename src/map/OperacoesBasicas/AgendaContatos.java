package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatooMap;

    public AgendaContatos() {
        this.agendaContatooMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatooMap.put(nome, telefone);
    }

    public void removerPalavra(String nome){
        if (!agendaContatooMap.isEmpty()){
            agendaContatooMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatooMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatooMap.isEmpty()){
            numeroPorNome = agendaContatooMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Filipe", 666666);
        agendaContatos.adicionarContato("Filipe", 585858);
        agendaContatos.adicionarContato("Filipe Lima", 1111);
        agendaContatos.adicionarContato("Filipe Souza", 9999);
        agendaContatos.adicionarContato("Filipe de", 1111);
        agendaContatos.adicionarContato("Filipe", 4444);

        agendaContatos.exibirContatos();
    }
}
