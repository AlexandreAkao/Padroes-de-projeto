package abstract_factory.emissor;

public class EmissorCreator {
    public static final int VISA = 0;
    public static final int MASTERCARD = 1;

    public Emissor create(int tipoDoEmissor) {
        if (tipoDoEmissor == EmissorCreator.VISA) {
            return new EmissorVisa();
        } else if (tipoDoEmissor == EmissorCreator.MASTERCARD) {
            return new EmissorMastercard();
        } else {
            throw new IllegalArgumentException("Tipo de emissor não suportado");
        }
    }
}
