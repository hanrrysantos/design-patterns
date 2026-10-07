public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        System.out.println(pedido.estado());
        pedido.pagar();
        System.out.println(pedido.estado());
        pedido.enviar();
        System.out.println(pedido.estado());
    }
}
