public class Aberto implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        pedido.mudarEstado(new Pago());
    }

    @Override
    public void enviar(Pedido pedido) {
        throw new IllegalStateException("Pague o pedido antes de enviar");
    }

    @Override
    public String nome() {
        return "Aberto";
    }
}
