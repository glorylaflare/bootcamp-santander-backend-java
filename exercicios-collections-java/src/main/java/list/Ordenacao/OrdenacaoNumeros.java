//Exemplo resolvido por Marcelo Gonçalves
package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosOrdenados;

    public OrdenacaoNumeros() {
        this.numerosOrdenados = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosOrdenados.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(this.numerosOrdenados);
        if(!numerosOrdenados.isEmpty()) {
            Collections.sort(numerosAscendentes);
        } else {
            System.out.println("A lista está vazia.");
        }
        return numerosAscendentes;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(this.numerosOrdenados);
        if(!numerosOrdenados.isEmpty()) {
            numerosAscendentes.sort(Collections.reverseOrder());
        } else {
            System.out.println("A lista está vazia.");
        }
        return numerosAscendentes;
    }

    public void exibirNumeros() {
        if(!numerosOrdenados.isEmpty()) {
            System.out.println(this.numerosOrdenados);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(9);

        numeros.exibirNumeros();

        System.out.println("Numeros em ordem crescente: " + numeros.ordenarAscendente());
        System.out.println("Numeros em ordem decrescente: " + numeros.ordenarDescendente());
    }
}
