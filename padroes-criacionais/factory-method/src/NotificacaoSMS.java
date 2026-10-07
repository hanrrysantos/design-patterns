public class NotificacaoSMS implements Notificacao {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.printf("SMS para %s: %s%n", destinatario, mensagem);
    }
}
