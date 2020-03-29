package decorator;

public class CoberturaExtra extends Extra {

    public CoberturaExtra(String label, double preco, Pedido pedido) {
        super(label, preco, pedido);
    }

    public double getPreco() {
        return this.preco + pedido.getPreco();
    }
}
