package strategy.escalonador;

public class ShortestJobFirst implements Algoritmo {
    @Override
    public void processamento() {
        System.out.println("Utilizando o algoritmo Shortest Job First");
    }
}
