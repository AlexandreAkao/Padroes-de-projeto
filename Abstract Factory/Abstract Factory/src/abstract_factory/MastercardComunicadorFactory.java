package abstract_factory;

import abstract_factory.emissor.Emissor;
import abstract_factory.emissor.EmissorCreator;
import abstract_factory.receptor.Receptor;
import abstract_factory.receptor.ReceptorCreator;

public class MastercardComunicadorFactory implements ComunicadorFactory {
    private EmissorCreator emissorCreator = new EmissorCreator();
    private ReceptorCreator receptorCreator = new ReceptorCreator();

    @Override
    public Emissor createEmissor() {
        return emissorCreator.create(EmissorCreator.MASTERCARD);
    }

    @Override
    public Receptor createReceptor() {
        return receptorCreator.create(ReceptorCreator.MASTERCARD);
    }
}
