public class MensagemSimples implements Mensagem {
    private final String conteudo;

    public MensagemSimples(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String texto() {
        return conteudo;
    }
}
