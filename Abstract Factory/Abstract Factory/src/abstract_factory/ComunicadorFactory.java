package abstract_factory;

import abstract_factory.emissor.Emissor;
import abstract_factory.receptor.Receptor;

public interface ComunicadorFactory {
    Emissor createEmissor();
    Receptor createReceptor();
}
