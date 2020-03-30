package state.bandeira;

public class Bandeira2 implements Bandeira {
    @Override
    public double calculaValorDaCorrida(double tempo, double distancia) {
        return 10 + tempo * 3 + distancia * 4;
    }
}
