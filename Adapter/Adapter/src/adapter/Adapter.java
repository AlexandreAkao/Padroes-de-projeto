package adapter;

import adapter.plugs.AmericanPlug;
import adapter.sockets.BrasilianSocket;

public class Adapter {
    public static void main(String[] args) {
        AmericanPlug americanPlug = new AmericanPlug(120, 10);
        AmericanToBrasilianAdapter adapter = new AmericanToBrasilianAdapter(americanPlug);

        BrasilianSocket padraoBrasileiro = new BrasilianSocket();
        padraoBrasileiro.energia(adapter);
    }
}
