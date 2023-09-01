//Exemplo feito por Marcelo Gonçalves
package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class CatalogoFilmes {
    private Map<String, Integer> filmesMap;

    public CatalogoFilmes() {
        this.filmesMap = new HashMap<>();
    }

    public void adicionarFilmes(String filme, Integer anoLancamento){
        filmesMap.put(filme, anoLancamento);
    }

    public void removerFilmes(String filme){
        if(!filmesMap.isEmpty()) filmesMap.remove(filme);
        else System.out.println("A lista de filmes está vazia.");
    }

    public void exibirFilmes(){
        if(!filmesMap.isEmpty()) {
            for (String i : filmesMap.keySet()) {
                System.out.println("Nome: " + i + " | Ano de lançamento: " + filmesMap.get(i));
            }
        }
        else {
            System.out.println("A lista de filmes está vazia.");
        }
    }

    public Integer pesquisarFilme(String filme) {
        Integer anoDoFilme = null;
        if(!filmesMap.isEmpty()) {
            anoDoFilme = filmesMap.get(filme);
            if(anoDoFilme == null){
                System.out.println("Não foi possível encontrar o filme.");
            }
        } else {
            System.out.println("A lista de filmes está vazia.");
        }
        return anoDoFilme;
    }

    public static void main(String[] args) {
        CatalogoFilmes filmes = new CatalogoFilmes();

        filmes.adicionarFilmes("O Poderoso Chefão",1972);
        filmes.adicionarFilmes("O Iluminado",1980);
        filmes.adicionarFilmes("Barbie",2023);
        filmes.adicionarFilmes("Vidas Passadas",2023);
        filmes.adicionarFilmes("No Ritmo do Coração",2021);

        //filmes.exibirFilmes();

        String nomeDoFilme = "Vidas Passadas";
        int anoDoFilme = filmes.pesquisarFilme(nomeDoFilme);
        System.out.println("O Filme " + nomeDoFilme + " foi lançado em " + anoDoFilme + " e está no seu catálogo.");
    }
}
