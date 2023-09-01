//Exemplo resolvido por Marcelo Gonçalves
package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa removendoTarefa = null;
        if(!listaDeTarefas.isEmpty()) {
            for(Tarefa tarefa : listaDeTarefas) {
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    removendoTarefa = tarefa;
                    break;
                }
            }
            listaDeTarefas.remove(removendoTarefa);
        } else {
            System.out.println("Não existem tarefas pendentes.");
        }

        if(removendoTarefa == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        if (!listaDeTarefas.isEmpty()) {
            System.out.println(listaDeTarefas);
        } else {
            System.out.println("Não existem tarefas pendentes.");
        }
    }

    public int contarTarefas() {
        return listaDeTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa tarefa : listaDeTarefas) {
            if(tarefa.isCheck()) { //true
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for(Tarefa tarefa : listaDeTarefas) {
            if(!tarefa.isCheck()) { //false
                tarefasNaoConcluidas.add(tarefa);
            }
        }
        return tarefasNaoConcluidas;
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa tarefa : listaDeTarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setCheck(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefasPendentes = null;
        for(Tarefa tarefa : listaDeTarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasPendentes = tarefa;
                break;
            }
        }

        if(tarefasPendentes != null) {
            tarefasPendentes.setCheck(true);
        } else {
            System.out.println("Tarefa não encontrada na lista");
        }
    }

    public void limparListaTarefas() {
        if(!listaDeTarefas.isEmpty()) {
            System.out.println("A lista já está vazia");
        } else {
            listaDeTarefas.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Estudar Java");
        tarefas.adicionarTarefa("Fazer exercícios físicos");
        tarefas.adicionarTarefa("Ler livro");
        tarefas.adicionarTarefa("Limpar a casa");
        tarefas.adicionarTarefa("Ir ao cinema");
        tarefas.adicionarTarefa("Preparar apresentação");

        tarefas.exibirTarefas();
        tarefas.removerTarefa("Ler Livro");

        tarefas.exibirTarefas();
        System.out.println("Total de tarefas: " + tarefas.contarTarefas());

        System.out.println(tarefas.obterTarefasConcluidas()); //vazio
        System.out.println(tarefas.obterTarefasPendentes());

        tarefas.marcarTarefaConcluida("Estudar Java");
        tarefas.marcarTarefaConcluida("Fazer exercícios físicos");

        System.out.println(tarefas.obterTarefasConcluidas());

        tarefas.marcarTarefaPendente("Limpar a casa");
        tarefas.marcarTarefaPendente("Ir ao cinema");

        System.out.println(tarefas.obterTarefasPendentes());
        tarefas.exibirTarefas();

        tarefas.limparListaTarefas();
        tarefas.exibirTarefas();
    }
}
