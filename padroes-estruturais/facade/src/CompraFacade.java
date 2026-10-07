public class CompraFacade {
    private final Estoque estoque = new Estoque();
    private final Pagamento pagamento = new Pagamento();
    private final Entrega entrega = new Entrega();

    public void comprar(String produto) {
        estoque.reservar(produto);
        pagamento.cobrar(produto);
        entrega.agendar(produto);
    }
}
