public interface EstadoPedido {
    void pagar(Pedido pedido);
    void enviar(Pedido pedido);
    String nome();
}
