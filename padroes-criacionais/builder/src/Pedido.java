public class Pedido {
    private final String cliente;
    private final String prato;
    private final boolean sobremesa;
    private final boolean entrega;

    private Pedido(Builder builder) {
        cliente = builder.cliente;
        prato = builder.prato;
        sobremesa = builder.sobremesa;
        entrega = builder.entrega;
    }

    public static class Builder {
        private final String cliente;
        private final String prato;
        private boolean sobremesa;
        private boolean entrega;

        public Builder(String cliente, String prato) {
            if (cliente == null || cliente.isBlank() || prato == null || prato.isBlank()) {
                throw new IllegalArgumentException("Cliente e prato são obrigatórios");
            }
            this.cliente = cliente;
            this.prato = prato;
        }

        public Builder comSobremesa() {
            sobremesa = true;
            return this;
        }

        public Builder paraEntrega() {
            entrega = true;
            return this;
        }

        public Pedido construir() {
            return new Pedido(this);
        }
    }

    @Override
    public String toString() {
        return "Pedido de " + cliente + ": " + prato
                + ", sobremesa=" + sobremesa + ", entrega=" + entrega;
    }
}
