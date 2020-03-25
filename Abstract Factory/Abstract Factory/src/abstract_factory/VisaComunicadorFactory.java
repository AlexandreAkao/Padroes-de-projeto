package abstract_factory;

import abstract_factory.emissor.Emissor;
import abstract_factory.emissor.EmissorCreator;
import abstract_factory.receptor.Receptor;
import abstract_factory.receptor.ReceptorCreator;

public class VisaComunicadorFactory implements ComunicadorFactory {
    private EmissorCreator emissorCreator = new EmissorCreator();
    private ReceptorCreator receptorCreator = new ReceptorCreator();

    @Override
    public Emissor createEmissor() {
        return emissorCreator.create(EmissorCreator.VISA);
    }

    @Override
    public Receptor createReceptor() {
        return receptorCreator.create(ReceptorCreator.VISA);
    }
}
