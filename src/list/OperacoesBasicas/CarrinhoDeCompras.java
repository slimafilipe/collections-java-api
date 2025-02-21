package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        for(Item i : itemList){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(i);
            }
        }
        itemList.removeAll(itemsParaRemover);
    }
    public String calcularValorTotal() {
        double valor = 0;
        for (Item i : itemList) {
            valor += i.getPreco() * i.getQuantidade();
        }
        return "O valor dos produtos no carrinho é de: " + valor;
    }
    public void exibirItens(){
        Iterator<Item> itemIterator = itemList.iterator();
        System.out.println("======= ITENS NO CARRINHO =======");
        while (itemIterator.hasNext()){
            System.out.println(itemIterator.next());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Cebola", 2.15, 5);
        carrinhoDeCompras.adicionarItem("Tomate", 10, 8);
        carrinhoDeCompras.adicionarItem("Cenoura", 3, 2);

        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("cenoura");


        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());

    }
}
