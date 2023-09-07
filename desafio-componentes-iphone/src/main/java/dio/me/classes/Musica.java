package dio.me.classes;

import dio.me.interfaces.MusicaInterface;

public class Musica implements MusicaInterface {
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusicar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void proxMusica() {
        System.out.println("Próxima música...");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Tocando música anterior...");
    }

    @Override
    public int avaliarMusica(int avaliacao) {
        return avaliacao;
    }
}
