public class FreteExpresso implements EstrategiaFrete {
    @Override
    public int calcular(int pesoEmKg) {
        return 12 + 4 * pesoEmKg;
    }
}
