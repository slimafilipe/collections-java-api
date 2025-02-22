package list.Ordenacao;

public class Numero implements Comparable<Numero>{
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numero : " +  numero + "\n" ;
    }

    @Override
    public int compareTo(Numero n) {
        return Integer.compare(numero, n.getNumero());
    }
}

