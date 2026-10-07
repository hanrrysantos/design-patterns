public class Main {
    public static void main(String[] args) {
        CalculadoraFrete calculadora = new CalculadoraFrete(new FreteNormal());
        System.out.println("Normal: R$ " + calculadora.calcular(3));

        calculadora.usar(new FreteExpresso());
        System.out.println("Expresso: R$ " + calculadora.calcular(3));
    }
}
