package decorator;

public abstract class Extra implements Pedido {

    protected Pedido pedido;
    protected String label;
    protected double preco;

    public Extra(String label, double preco, Pedido pedido) {
        this.label = label;
        this.preco = preco;
        this.pedido = pedido;
    }

    public abstract double getPreco();

    public String getLabel() {
        return pedido.getLabel() + ", " + this.label;
    }

}