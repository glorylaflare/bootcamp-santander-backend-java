import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
    }
    static void selecaoCandidatos() {
        String [] candidatos = {"Fábio","Marcelo","Thais","Rayanne","Felipe","Igor","Gabriela","Fernanda","Ana","Juliane","Patrícia","Vitor","Paulo","Diego","Stéfani"};

        Integer candidatosSelecionados = 0;
        Integer candidatosAtuais = 0;
        Double salarioBase = 2500.0;

        while(candidatosSelecionados < 8 && candidatosAtuais < candidatos.length) {
            String candidato = candidatos[candidatosAtuais];
            Double salarioPretendido = valorPretendido();
            // String salarioAjustado = String.format("%.2f", salarioPretendido);

            // System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioAjustado);
            if(salarioBase >= salarioPretendido) {
                System.out.println("# O(A) candidato(a) " + candidato + " foi selecionado(a) para a vaga!");
                candidatosSelecionados++;

                ligarParaCandidato(candidato);
            }
            candidatosAtuais++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1500, 3100);
    }

    static void ligarParaCandidato(String candidato) {
        Integer tentativasRealizadas = 1;
        Boolean continuarTentando = true;
        Boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) tentativasRealizadas++;
            else System.out.println("## O contato foi realizado com sucesso!");
        } while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu) {
            System.out.println("### Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.\n");
        }
        else System.out.println("### Infelizmente não conseguimos contato com " + candidato + ", número máximo de tentativas " + tentativasRealizadas + ".\n");
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
}
