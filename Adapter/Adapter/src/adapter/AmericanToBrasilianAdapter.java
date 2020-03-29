package adapter;

import adapter.plugs.AmericanPlug;
import adapter.plugs.PlugBR;

public class AmericanToBrasilianAdapter implements PlugBR {
    private AmericanPlug americanPlug;

    public AmericanToBrasilianAdapter(AmericanPlug plug) {
        this.americanPlug = plug;
    }

    @Override
    public void plugado() {
        System.out.println("Sou um adaptador de USA para BR");
    }
}
