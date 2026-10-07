public class CalculadoraFrete {
    private EstrategiaFrete estrategia;

    public CalculadoraFrete(EstrategiaFrete estrategia) {
        this.estrategia = estrategia;
    }

    public void usar(EstrategiaFrete estrategia) {
        this.estrategia = estrategia;
    }

    public int calcular(int pesoEmKg) {
        if (pesoEmKg < 0) {
            throw new IllegalArgumentException("O peso não pode ser negativo");
        }
        return estrategia.calcular(pesoEmKg);
    }
}
