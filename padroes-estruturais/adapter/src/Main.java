public class Main {
    public static void main(String[] args) {
        Relatorio relatorio = new AdaptadorImpressora(new ImpressoraLegada());
        relatorio.exibir("Vendas do dia", "Total: 12 pedidos");
    }
}
