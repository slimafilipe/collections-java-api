package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContatos(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarContato(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContatos("Filipe", 12345);
        agendaContatos.adicionarContatos("Filipe", 0);
        agendaContatos.adicionarContatos("Filipe Lima", 111111);
        agendaContatos.adicionarContatos("Filipe de Souza", 056454);
        agendaContatos.adicionarContatos("Jaiany", 12345);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarContato("Jaiany"));

        System.out.println("COntato atualizado" + agendaContatos.atualizarNumeroContato("Jaiany", 5555));

        agendaContatos.exibirContatos();
    }
}
