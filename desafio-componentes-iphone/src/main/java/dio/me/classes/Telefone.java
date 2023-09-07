package dio.me.classes;

import dio.me.interfaces.TelefoneInterface;

public class Telefone implements TelefoneInterface {
    @Override
    public void verificarSinal() {
        System.out.println("Verificando sinal de rede...");
    }

    @Override
    public void ligar(int numero) {
        verificarSinal();
        if (numero != 0) {
            System.out.println("Ligando...");
        } else System.out.println("Número inválido");
    }

    @Override
    public void atender() {
        verificarSinal();
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void desligar() {
        atender();
        System.out.println("Desligando ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
