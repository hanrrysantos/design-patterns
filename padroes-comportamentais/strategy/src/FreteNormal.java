public class FreteNormal implements EstrategiaFrete {
    @Override
    public int calcular(int pesoEmKg) {
        return 5 + 2 * pesoEmKg;
    }
}
