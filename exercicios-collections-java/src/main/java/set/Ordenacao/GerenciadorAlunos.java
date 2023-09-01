//Exemplo resolvido por Marcelo Gonçalves
package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno removendoAluno = null;
        if(!alunos.isEmpty()) {
            for(Aluno aluno : alunos) {
                if(aluno.getMatricula() == matricula) {
                    removendoAluno = aluno;
                    break;
                }
            }
            alunos.remove(removendoAluno);
        } else {
            System.out.println("Não existe alunos na lista!");
        }

        if(removendoAluno == null) {
            System.out.println("Matricula não encontrada!");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        if(!alunos.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("Não existe alunos na lista!");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if(!alunos.isEmpty()) {
            alunosPorNota.addAll(alunos);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("Não existe alunos na lista!");
        }
    }

    public void exibirAlunos() {
        if(!alunos.isEmpty()) {
            System.out.println(alunos);
        } else {
            System.out.println("Não existe alunos na lista!");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("João", 123456L, 7.5);
        alunos.adicionarAluno("Maria", 123457L, 9.0);
        alunos.adicionarAluno("Carlos", 123458L, 5.0);
        alunos.adicionarAluno("Ana", 123459L, 6.8);

        //alunos.exibirAlunos();
        alunos.exibirAlunosPorNome();
        alunos.exibirAlunosPorNota();

        alunos.removerAluno(123458L);
        alunos.removerAluno(2344L); //Não existe!
        alunos.exibirAlunos();

    }
}
