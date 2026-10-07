public class Prefixo implements Mensagem {
    private final Mensagem mensagem;
    private final String prefixo;

    public Prefixo(Mensagem mensagem, String prefixo) {
        this.mensagem = mensagem;
        this.prefixo = prefixo;
    }

    @Override
    public String texto() {
        return prefixo + mensagem.texto();
    }
}
