public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        System.out.println(pedido.estado());
        try {
            pedido.enviar();
        } catch (IllegalStateException erro) {
            System.out.println("Ação inválida: " + erro.getMessage());
        }
        pedido.pagar();
        System.out.println(pedido.estado());
        pedido.enviar();
        System.out.println(pedido.estado());
    }
}
