public class ServicoSMS extends ServicoNotificacao {
    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoSMS();
    }
}
