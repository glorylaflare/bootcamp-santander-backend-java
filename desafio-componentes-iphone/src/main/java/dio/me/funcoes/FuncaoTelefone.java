package dio.me.funcoes;

import dio.me.classes.Telefone;
import dio.me.interfaces.FuncoesIphone;

public class FuncaoTelefone {

    public static FuncoesIphone funcaoLigar() {
        return () -> {
            Telefone telefone = new Telefone();
            telefone.ligar(34092134);
        };
    }

    public static FuncoesIphone funcaoAtender() {
        return () -> {
            Telefone telefone = new Telefone();
            telefone.atender();
        };
    }

    public static FuncoesIphone funcaoDesligar() {
        return () -> {
            Telefone telefone = new Telefone();
            telefone.desligar();
        };
    }

    public static FuncoesIphone funcaoIniciarConversaVoz() {
        return () -> {
            Telefone telefone = new Telefone();
            telefone.iniciarCorreioVoz();
        };
    }
}
