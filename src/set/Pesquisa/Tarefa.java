package set.Pesquisa;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean conclusao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }

    public boolean isConclusao() {
        return conclusao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descricao);
    }

    @Override
    public String toString() {
        return "{" + descricao +
                ", conclusao = " + conclusao +
                '}';
    }
}
