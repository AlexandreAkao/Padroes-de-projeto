package strategy.escalonador;

public class Fifo implements Algoritmo {
    @Override
    public void processamento() {
        System.out.println("Utilizando o algoritmo Fifo (First in First Out)");
    }
}
