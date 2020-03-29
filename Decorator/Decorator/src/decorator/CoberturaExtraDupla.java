package decorator;

public class CoberturaExtraDupla extends Extra {

    public CoberturaExtraDupla(String label, double preco, Pedido pedido) {
        super(label, preco, pedido);
    }

    public double getPreco() {
        return (this.preco * 2) + pedido.getPreco();
    }

    public String getLabel() {
        return pedido.getLabel() + ", Dupla " + this.label;
    }
}
