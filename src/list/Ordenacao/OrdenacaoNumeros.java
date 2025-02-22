package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Numero> numeroList = new ArrayList<>();

    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero));
    }
    public List<Numero> ordenarAscendente(){
        List<Numero> numeroAscendente = new ArrayList<>(numeroList);
        Collections.sort(numeroAscendente);
        return numeroAscendente;
    }
    public List<Numero> ordernarDescendente(){
        List<Numero> numeroDescendente = new ArrayList<>(numeroList);
        Collections.sort(numeroDescendente, Collections.reverseOrder());
        return numeroDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(80);
        ordenacaoNumeros.adicionarNumero(6);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(58);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordernarDescendente());
    }

}
