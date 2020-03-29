package decorator;

public class CoberturaSemCusto extends Extra {

    public CoberturaSemCusto(String label, double preco, Pedido pedido) {
        super(label, preco, pedido);
    }

    public double getPreco() {
        return pedido.getPreco();
    }
}
