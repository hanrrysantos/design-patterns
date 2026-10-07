public class Main {
    public static void main(String[] args) {
        ServicoNotificacao email = new ServicoEmail();
        ServicoNotificacao sms = new ServicoSMS();

        email.notificar("cliente@exemplo.com", "Pedido confirmado");
        sms.notificar("11999999999", "Pedido confirmado");
    }
}
