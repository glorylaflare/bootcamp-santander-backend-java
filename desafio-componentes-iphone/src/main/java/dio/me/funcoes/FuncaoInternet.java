package dio.me.funcoes;

import dio.me.classes.Internet;
import dio.me.interfaces.FuncoesIphone;

public class FuncaoInternet {

    public static FuncoesIphone funcaoAbrirNavegador() {
        return () -> {
            Internet internet = new Internet();
            internet.abrirNavegador();
        };
    }

    public static FuncoesIphone funcaoExibirPagina() {
        return () -> {
            Internet internet = new Internet();
            internet.exibirPagina("https://google.com");
        };
    }

    public static FuncoesIphone funcaoNovaAba() {
        return () -> {
            Internet internet = new Internet();
            internet.novaAba();
        };
    }

    public static FuncoesIphone funcaoAtualizarPagina() {
        return () -> {
            Internet internet = new Internet();
            internet.atualizarPagina();
        };
    }

    public static FuncoesIphone funcaoFecharPagina() {
        return () -> {
            Internet internet = new Internet();
            internet.fecharPagina();
        };
    }

    public static FuncoesIphone funcaoFecharAba() {
        return () -> {
            Internet internet = new Internet();
            internet.fecharAba();
        };
    }

    public static FuncoesIphone funcaoFecharNavegador() {
        return () -> {
            Internet internet = new Internet();
            internet.fecharNavegador();
        };
    }
}
