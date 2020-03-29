package decorator;

public class Decorator {
    public static void main(String[] args) {
        Pedido pizzaDaCasa = new Pizza("Pizza da Casa", 10);
        pizzaDaCasa = new CoberturaExtra("Pepperoni", 4, pizzaDaCasa);
        pizzaDaCasa = new CoberturaExtraDupla("Mozzarella", 2, pizzaDaCasa);
        pizzaDaCasa = new CoberturaSemCusto("Pimenta", 2, pizzaDaCasa);
        System.out.println(pizzaDaCasa.getPreco());
        System.out.println(pizzaDaCasa.getLabel());
    }
}
