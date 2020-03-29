package adapter.plugs;

public class BrasilianPlug implements PlugBR {
    private int volts;
    private int amperes;

    public BrasilianPlug(int volts, int amperes) {
        this.volts = volts;
        this.amperes = amperes;
    }

    @Override
    public void plugado() {
        System.out.println("Sou um plug americano");
    }

    public int getVolts() {
        return volts;
    }

    public int getAmperes() {
        return amperes;
    }
}
