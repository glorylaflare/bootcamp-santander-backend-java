//Exemplo resolvido por Marcelo Gonçalves
package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
  Map<String, Integer> palavras;

  public ContagemPalavras() {
    this.palavras = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, Integer contagem) {
    palavras.put(palavra, contagem);
  }

  public void removerPalavra(String palavra) {
    if(!palavra.isEmpty()) palavras.remove(palavra);
    else System.out.println("O conjunto de palavras está vazio.");
  }

  public int exibirContagemPalavras() {
    int total = 0;
    for(int contagem : palavras.values()) {
      total += contagem;
    }
    return total;
  }

  public String encontrarPalavraMaisFrequente() {
    String palavraMaisFrequente = null;
    int total = 0;
    for(Map.Entry<String, Integer> entry : palavras.entrySet()) {
      if(entry.getValue() > total) {
        total = entry.getValue();
        palavraMaisFrequente = entry.getKey();
      }
    }
    return palavraMaisFrequente;
  }

  public static void main(String[] args) {
    ContagemPalavras palavras = new ContagemPalavras();

    palavras.adicionarPalavra("Java", 2);
    palavras.adicionarPalavra("Python", 8);
    palavras.adicionarPalavra("JavaScript", 1);
    palavras.adicionarPalavra("C#", 6);
    palavras.adicionarPalavra("C++", 9);

    System.out.println("NÚMERO TOTAL DE PALAVRAS: " + palavras.exibirContagemPalavras());
    System.out.println("PALAVRA MAIS FREQUENTE: " + palavras.encontrarPalavraMaisFrequente());
  }
}
