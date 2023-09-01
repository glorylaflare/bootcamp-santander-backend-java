//Exemplo resolvido por Marcelo Gonçalves
package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if(!numeros.isEmpty()) {
            for (int numero : numeros) {
                soma += numero;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeros.isEmpty()) {
            for (int numero : numeros) {
                if(numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
        } else {
            System.out.println("A lista está vazia.");
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()) {
            for (int numero : numeros) {
                if(numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
        } else {
            System.out.println("A lista está vazia.");
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        if(!numeros.isEmpty()) System.out.println(this.numeros);
        else System.out.println("A lista está vazia.");
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(-4);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(-6);

        numeros.exibirNumeros();

        System.out.println("A soma dos números é: " + numeros.calcularSoma());
        System.out.println("O maior número é: " + numeros.encontrarMaiorNumero());
        System.out.println("O menor número é: " + numeros.encontrarMenorNumero());
    }
}
