//Exemplo resolvido por Marcelo Gonçalves
package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaDeItens;

    public CarrinhoDeCompras() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        listaDeItens.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        if(!listaDeItens.isEmpty()) {
            for (Item item : listaDeItens) {
                if(item.getNome().equalsIgnoreCase(nome)){
                    itemsParaRemover.add(item);
                }
            }
            listaDeItens.removeAll(itemsParaRemover);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        if(!listaDeItens.isEmpty()) {
            for (Item item : listaDeItens) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
        } else {
            System.out.println("A lista está vazia.");
        }
        return valorTotal;
    }

    public void exibirItens() {
        if(!listaDeItens.isEmpty()) {
            System.out.println(this.listaDeItens);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras compras = new CarrinhoDeCompras();

        compras.adicionarItem("Lápis HB", 1.5, 3);
        compras.adicionarItem("Lápis 4B", 2.5, 2);
        compras.adicionarItem("Borracha", 2, 3);
        compras.adicionarItem("Caderno", 12.0, 1);
        compras.adicionarItem("Caneta", 2.0, 5);
        compras.adicionarItem("Tesoura", 3.5, 2);

        compras.exibirItens();
        System.out.println("O valor total da compra será: " + compras.calcularValorTotal());

        compras.removerItem("Lápis 4B");
        compras.exibirItens();
        System.out.println("O valor total da compra será: " + compras.calcularValorTotal());
    }
}
