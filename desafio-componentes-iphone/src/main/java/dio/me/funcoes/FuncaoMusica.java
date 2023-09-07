package dio.me.funcoes;

import dio.me.classes.Musica;
import dio.me.interfaces.FuncoesIphone;

public class FuncaoMusica {

    public static FuncoesIphone funcaoTocarMusica() {
        return () -> {
            Musica musica = new Musica();
            musica.tocarMusica();
        };
    }

    public static FuncoesIphone funcaoPausarMusica() {
        return () -> {
            Musica musica = new Musica();
            musica.pausarMusicar();
        };
    }

    public static FuncoesIphone funcaoProximaMusica() {
        return () -> {
            Musica musica = new Musica();
            musica.proxMusica();
        };
    }

    public static FuncoesIphone funcaoVoltarMusica() {
        return () -> {
            Musica musica = new Musica();
            musica.voltarMusica();
        };
    }

    public static FuncoesIphone funcaoAvaliarMusica() {
        return () -> {
            Musica musica = new Musica();
            musica.avaliarMusica(5);
        };
    }
}
