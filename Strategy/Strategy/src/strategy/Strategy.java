package strategy;

import strategy.escalonador.Algoritmo;
import strategy.escalonador.Fifo;
import strategy.escalonador.RoundRobin;
import strategy.escalonador.ShortestJobFirst;

public class Strategy {
    public static void main(String[] args) {
        Algoritmo fifo = new Fifo();
        Algoritmo sjf = new ShortestJobFirst();
        Algoritmo rr = new RoundRobin();

        fifo.processamento();
        sjf.processamento();
        rr.processamento();
    }
}
