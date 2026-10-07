public class Main {
    public static void main(String[] args) {
        Configuracao primeira = Configuracao.getInstancia();
        Configuracao segunda = Configuracao.getInstancia();

        System.out.println("Aplicação: " + primeira.getNomeAplicacao());
        System.out.println("Mesma instância: " + (primeira == segunda));
    }
}
