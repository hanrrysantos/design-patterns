public class Maiusculas implements Mensagem {
    private final Mensagem mensagem;

    public Maiusculas(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String texto() {
        return mensagem.texto().toUpperCase();
    }
}
