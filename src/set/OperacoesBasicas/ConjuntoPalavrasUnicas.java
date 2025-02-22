package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
       if (!palavrasSet.isEmpty()){
           if (palavrasSet.contains(palavra)){
               palavrasSet.remove(palavra);
           }else {
               System.out.println("Palavra não encontrada no conjunto!");
           }
       }else {
           System.out.println("O conjunto está vázio");
       }
    }

    public void verificarPalavra(String palavra){
            if (palavrasSet.contains(palavra)){
                System.out.println(palavra + " está no conjunto");

            }

    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Now");
        conjuntoPalavrasUnicas.adicionarPalavra("Today");
        conjuntoPalavrasUnicas.adicionarPalavra("Believe");
        conjuntoPalavrasUnicas.adicionarPalavra("Thunder");
        conjuntoPalavrasUnicas.adicionarPalavra("Car");
        conjuntoPalavrasUnicas.adicionarPalavra("Bus");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Bus");
   }

}
