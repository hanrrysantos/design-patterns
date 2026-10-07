public class Enviado implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        throw new IllegalStateException("Pedido já enviado");
    }

    @Override
    public void enviar(Pedido pedido) {
        throw new IllegalStateException("Pedido já enviado");
    }

    @Override
    public String nome() {
        return "Enviado";
    }
}
