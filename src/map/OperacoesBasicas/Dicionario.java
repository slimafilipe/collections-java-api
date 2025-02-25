package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }
    public String removerPalavra(String palavra){
        String palavraParaRemover = null;
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
            palavraParaRemover = palavra;
        }
        return palavraParaRemover;
    }

    public void exibirPalavras(){
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        }else {
            throw new RuntimeException("Dicionário vázio");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String pesquisaPorNome = null;
        if (!dicionarioMap.isEmpty()){
            pesquisaPorNome = dicionarioMap.get(palavra);
        }
        return pesquisaPorNome;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Nome", "Indentificação dada ao cidadão");
        dicionario.adicionarPalavra("numero", "telefone");
        dicionario.adicionarPalavra("Java", "Linguagem de programação");
        dicionario.adicionarPalavra("PC", "Computador pessoal");

        //dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Java"));

        dicionario.removerPalavra("PC");
        dicionario.exibirPalavras();
    }

}
