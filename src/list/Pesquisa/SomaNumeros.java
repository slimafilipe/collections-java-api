package list.Pesquisa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SomaNumeros {
    private List<Numero> numeroList = new ArrayList<>();

    public void adicionarNumero(int  numero){
        numeroList.add(new Numero(numero));
    }
    public int calcularSoma(){
        int resultadoSoma = 0;
        for (Numero num : numeroList){
            resultadoSoma += num.getNumero();
        }
        return resultadoSoma;
    }
    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        for (Numero num : numeroList){
            if (num.getNumero() > maiorNumero){
                maiorNumero = num.getNumero();
            }
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero(){
        int menorNumero = 20000;// Ou usando Integer.MAX_VALUE
        for (Numero num : numeroList){
            if (num.getNumero() < menorNumero){
                menorNumero = num.getNumero();
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        Iterator<Numero> numeroIterator = numeroList.iterator();
        System.out.println("======== LISTA DOS NÚMEROS ==========");
        while (numeroIterator.hasNext()){
            System.out.println(numeroIterator.next());
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(4);

        System.out.println("Maior número: " +somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());

        System.out.println(somaNumeros.calcularSoma());

        somaNumeros.exibirNumeros();
    }

}
