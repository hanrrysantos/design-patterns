public class ServicoEmail extends ServicoNotificacao {
    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}
