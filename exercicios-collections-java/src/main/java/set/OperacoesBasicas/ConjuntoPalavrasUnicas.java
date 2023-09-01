//Exemplo desenvolvido por Marcelo Gonçalves
package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(!palavras.isEmpty()) {
            if(palavras.contains(palavra)) {
                palavras.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada!");
            }
        } else {
            System.out.println("O conjunto de palavras está vazio.");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavras.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if(!palavras.isEmpty()) {
            System.out.println(palavras);
        } else {
            System.out.println("O conjunto de palavras está vazio.");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.adicionarPalavra("Java");
        palavras.adicionarPalavra("Python");
        palavras.adicionarPalavra("JavaScript");
        palavras.adicionarPalavra("Python");
        palavras.adicionarPalavra("C++");
        palavras.adicionarPalavra("Ruby");

        palavras.exibirPalavrasUnicas();

        palavras.removerPalavra("C++");
        palavras.exibirPalavrasUnicas();

        System.out.println(palavras.verificarPalavra("Ruby"));

        palavras.removerPalavra("Angular");
    }
}
