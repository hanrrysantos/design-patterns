public class AdaptadorImpressora implements Relatorio {
    private final ImpressoraLegada impressora;

    public AdaptadorImpressora(ImpressoraLegada impressora) {
        this.impressora = impressora;
    }

    @Override
    public void exibir(String titulo, String conteudo) {
        impressora.imprimirTexto(titulo + "\n" + conteudo);
    }
}
