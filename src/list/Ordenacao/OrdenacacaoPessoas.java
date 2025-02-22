package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacacaoPessoas ordenacacaoPessoas = new OrdenacacaoPessoas();
        ordenacacaoPessoas.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacacaoPessoas.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacacaoPessoas.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacacaoPessoas.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenacacaoPessoas.ordenadoPorIdade());
        System.out.println(ordenacacaoPessoas.ordenarPorAltura());
    }
}
