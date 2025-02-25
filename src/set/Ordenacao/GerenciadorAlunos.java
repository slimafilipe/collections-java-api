package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota){
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public Set<Aluno> exibirAlunoPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        return alunoPorNome;
    }

    public Set<Aluno> exibirAlunoPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }
    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                }
            }
            alunoSet.remove(alunoParaRemover);
            //return alunoSet.removeIf(a -> a.getMatricula() == matricula);
        }else {
            throw new RuntimeException("O conjunto está vázio");
        }
        if (alunoParaRemover == null){
            System.out.println("Matricula não encontrada");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Pinho", 25577L, 9.5);
        gerenciadorAlunos.adicionarAluno("Lima", 2355L, 7.5);
        gerenciadorAlunos.adicionarAluno("Lipe", 2585L, 5.5);
        gerenciadorAlunos.adicionarAluno("Filipe Lima", 55L, 6.0);
        gerenciadorAlunos.adicionarAluno("Jaiany", 25L, 7);

        gerenciadorAlunos.exibirAlunos();

        //System.out.println(gerenciadorAlunos.exibirAlunoPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunoPorNota());

        gerenciadorAlunos.removerAluno(55L);
        gerenciadorAlunos.exibirAlunos();
    }
}
