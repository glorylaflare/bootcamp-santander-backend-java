//Exemplo resolvido por Marcelo Gonçalves com consulta da Tutora
package main.java.map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
  private Map<String, Livro> livrariaMap;

  public LivrariaOnline() {
    this.livrariaMap = new HashMap<>();
  }

  public void adicionarLivro(String link, String titulo, String autor, double preco) {
    livrariaMap.put(link, new Livro(titulo, autor, preco));
  }

  public void removerLivro(String titulo) {
    List<String> livrosRemovidos = new ArrayList<>();
    for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
      if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
        livrosRemovidos.add(entry.getKey());
      }
    }
    for (String livro : livrosRemovidos) {
      livrariaMap.remove(livro);
    }
  }

  public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
    Map<String, Livro> livrariaTreeMap = new TreeMap<>(livrariaMap);
    return livrariaTreeMap;
  }

  public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
    Map<String, Livro> livrosPorAutor = new HashMap<>();
    for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
      Livro livro = entry.getValue();
      if(livro.getAutor().equals(autor)) {
        livrosPorAutor.put(entry.getKey(), livro);
      }
    }
    return livrosPorAutor;
  }

  public List<Livro> obterLivroMaisCaro() {
    List<Livro> livrosMaisCaros = new ArrayList<>();
    double maiorValor = Double.MIN_VALUE;

    if(!livrariaMap.isEmpty()) {
      for(Livro livro : livrariaMap.values()) {
        if(livro.getPreco() > maiorValor) {
          maiorValor = livro.getPreco();
        }
      }
    } else {
      throw new NoSuchElementException("A livraria está vazia!");
    }

    for(Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
      if(entry.getValue().getPreco() == maiorValor){
        Livro livroMaiorPreco = livrariaMap.get(entry.getKey());
        livrosMaisCaros.add(livroMaiorPreco);
        
      }
    }
    return livrosMaisCaros;
  }

  public List<Livro> exibirLivroMaisBarato() {
    List<Livro> livrosMiasBaratos = new ArrayList<>();
    double menorValor = Double.MAX_VALUE;

    if(!livrariaMap.isEmpty()) {
      for(Livro livro : livrariaMap.values()) {
        if(livro.getPreco() < menorValor) {
          menorValor = livro.getPreco();
        }
      }
    } else {
      throw new NoSuchElementException("A livraria está vazia!");
    }

    for(Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
      if(entry.getValue().getPreco() == menorValor){
        Livro livroMenorPreco = livrariaMap.get(entry.getKey());
        livrosMiasBaratos.add(livroMenorPreco);

      }
    }
    return livrosMiasBaratos;
  }

  public static void main(String[] args) {
    LivrariaOnline livraria = new LivrariaOnline();

    livraria.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05);
    livraria.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99);
    livraria.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5.0);
    livraria.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50.0);
    livraria.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5.0);

    System.out.println(livraria.pesquisarLivrosPorAutor("Agatha Christie"));

    // Obtém e exibe o livro mais caro
    System.out.println("Livro mais caro: " + livraria.obterLivroMaisCaro());

    // Obtém e exibe o livro mais barato
    System.out.println("Livro mais barato: " + livraria.exibirLivroMaisBarato());
  }

}
