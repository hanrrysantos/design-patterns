public class Pago implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        throw new IllegalStateException("Pedido já pago");
    }

    @Override
    public void enviar(Pedido pedido) {
        pedido.mudarEstado(new Enviado());
    }

    @Override
    public String nome() {
        return "Pago";
    }
}
