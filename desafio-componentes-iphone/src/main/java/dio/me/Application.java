package dio.me;

import dio.me.funcoes.FuncaoTelefone;
import dio.me.interfaces.FuncoesIphone;

public class Application {
    public static void main(String[] args) {
        FuncoesIphone funcao = FuncaoTelefone.funcaoLigar();
        funcao.acao();
    }
}