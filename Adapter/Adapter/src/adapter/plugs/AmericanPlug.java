package adapter.plugs;

public class AmericanPlug implements PlugUSA {
    private int volts;
    private int amperes;

    public AmericanPlug(int volts, int amperes) {
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
