public class Configuracao {
    private static final Configuracao INSTANCIA = new Configuracao();
    private final String nomeAplicacao;

    private Configuracao() {
        nomeAplicacao = System.getenv().getOrDefault("APP_NAME", "Loja");
    }

    public static Configuracao getInstancia() {
        return INSTANCIA;
    }

    public String getNomeAplicacao() {
        return nomeAplicacao;
    }
}
