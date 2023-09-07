package dio.me.classes;

import dio.me.interfaces.InternetInterface;

public class Internet implements InternetInterface {
    @Override
    public void verificarSinal() {
        System.out.println("Verificando sinal de rede...");
    }

    @Override
    public void abrirNavegador() {
        System.out.println("Abrindo navegador...");
    }

    @Override
    public void exibirPagina(String endereco) {
        verificarSinal();
        if (endereco != null) {
            System.out.println("Abrindo página...");
        } else System.out.println("Página não encontrada");
    }

    @Override
    public void novaAba() {
        verificarSinal();
        System.out.println("Abrindo nova aba...");
    }

    @Override
    public void atualizarPagina() {
        verificarSinal();
        System.out.println("Atualizando página...");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página...");
    }

    @Override
    public void fecharAba() {
        System.out.println("Fechando aba...");
    }

    @Override
    public void fecharNavegador() {
        System.out.println("Fechando navegador...");
    }
}
