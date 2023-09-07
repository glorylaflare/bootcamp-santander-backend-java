package dio.me.interfaces;

public interface InternetInterface {
    void verificarSinal();
    void abrirNavegador();
    void exibirPagina(String endereco);
    void novaAba();
    void atualizarPagina();
    void fecharPagina();
    void fecharAba();
    void fecharNavegador();
}
