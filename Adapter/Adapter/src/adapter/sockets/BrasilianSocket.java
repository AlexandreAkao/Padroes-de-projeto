package adapter.sockets;

import adapter.plugs.BrasilianPlug;
import adapter.plugs.PlugBR;

public class BrasilianSocket {

    public void energia(PlugBR plug) {
        System.out.println("Estou destribuindo energia em uma entrada brasileira");
        plug.plugado();
    }
}
