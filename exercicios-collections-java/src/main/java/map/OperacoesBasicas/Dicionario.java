//Exemplo resolvido por Marcelo Gonçalves
package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
  private Map<String, String> dicionarioMap;

  public Dicionario() {
    this.dicionarioMap = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao) {
    dicionarioMap.put(palavra, definicao);
  }

  public void removerPalavra(String palavra) {
    if(!dicionarioMap.isEmpty()) dicionarioMap.remove(palavra);
    else System.out.println("O Dicionário está vazio.");
  }

  public void exibirPalavras() {
    if(!dicionarioMap.isEmpty()) System.out.println(dicionarioMap);
    else System.out.println("O Dicionário está vazio.");
  }

  public String pesquisarPorPalavra(String palavra) {
    String palavraPesquisada = null;
    if(!dicionarioMap.isEmpty()) {
      palavraPesquisada = dicionarioMap.get(palavra);
      if(palavraPesquisada == null) {
        System.out.println("A palavra não foi encontrada no dicionário.");
      }
    } else {
      System.out.println("O Dicionário está vazio.");
    }
    return palavraPesquisada;
  }

  public static void main(String[] args) {
    Dicionario dicionario = new Dicionario();

    dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
    dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
    dicionario.adicionarPalavra("javascript", "Linguagem de criação de scripts ou uma linguagem interpretada.");
    dicionario.exibirPalavras();

    dicionario.removerPalavra("typescript");
    dicionario.exibirPalavras();

    String palavraParaPesquisa = "python";
    System.out.println(dicionario.pesquisarPorPalavra(palavraParaPesquisa));
  }
}