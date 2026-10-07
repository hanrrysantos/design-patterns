public class Pedido {
    private EstadoPedido estado = new Aberto();

    public void pagar() {
        estado.pagar(this);
    }

    public void enviar() {
        estado.enviar(this);
    }

    void mudarEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public String estado() {
        return estado.nome();
    }
}
