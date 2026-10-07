public class Main {
    public static void main(String[] args) {
        Pedido retirada = new Pedido.Builder("Ana", "Lasanha").construir();
        Pedido completo = new Pedido.Builder("Bruno", "Risoto")
                .comSobremesa()
                .paraEntrega()
                .construir();

        System.out.println(retirada);
        System.out.println(completo);
    }
}
