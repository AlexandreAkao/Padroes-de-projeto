package abstract_factory.receptor;

import abstract_factory.emissor.EmissorCreator;

public class ReceptorCreator {
    public static final int VISA = 0;
    public static final int MASTERCARD = 1;

    public Receptor create(int tipoDoReceptor) {
        if (tipoDoReceptor == EmissorCreator.VISA) {
            return new ReceptorVisa();
        } else if (tipoDoReceptor == EmissorCreator.MASTERCARD) {
            return new ReceptorMastercard();
        } else {
            throw new IllegalArgumentException("Tipo de receptor não suportado");
        }
    }
}
