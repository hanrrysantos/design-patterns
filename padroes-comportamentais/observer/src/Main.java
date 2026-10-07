public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        ObservadorEstoque vitrine = quantidade -> System.out.println("Vitrine: " + quantidade);
        ObservadorEstoque compras = quantidade -> System.out.println("Compras: " + quantidade);

        estoque.adicionarObservador(vitrine);
        estoque.adicionarObservador(compras);
        estoque.atualizarQuantidade(5);
        estoque.removerObservador(compras);
        estoque.atualizarQuantidade(3);
    }
}
