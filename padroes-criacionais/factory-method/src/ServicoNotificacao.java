public abstract class ServicoNotificacao {
    public void notificar(String destinatario, String mensagem) {
        criarNotificacao().enviar(destinatario, mensagem);
    }

    protected abstract Notificacao criarNotificacao();
}
