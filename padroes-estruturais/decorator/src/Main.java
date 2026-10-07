public class Main {
    public static void main(String[] args) {
        Mensagem original = new MensagemSimples("pedido confirmado");
        Mensagem decorada = new Prefixo(new Maiusculas(original), "Aviso: ");

        System.out.println(original.texto());
        System.out.println(decorada.texto());
    }
}
