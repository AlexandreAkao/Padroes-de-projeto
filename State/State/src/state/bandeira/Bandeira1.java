package state.bandeira;

public class Bandeira1 implements Bandeira {
    @Override
    public double calculaValorDaCorrida(double tempo, double distancia) {
        return 5 + tempo * 1.5 + distancia * 1.7;
    }
}
