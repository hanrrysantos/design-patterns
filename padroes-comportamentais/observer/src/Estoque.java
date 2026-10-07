import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private final List<ObservadorEstoque> observadores = new ArrayList<>();
    private int quantidade;

    public void adicionarObservador(ObservadorEstoque observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorEstoque observador) {
        observadores.remove(observador);
    }

    public void atualizarQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa");
        }
        this.quantidade = quantidade;
        for (ObservadorEstoque observador : List.copyOf(observadores)) {
            observador.atualizar(this.quantidade);
        }
    }
}
