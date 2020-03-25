package abstract_factory;

import abstract_factory.emissor.Emissor;
import abstract_factory.receptor.Receptor;

public class AbstractFactory {
    public static void main(String[] args) {
        ComunicadorFactory visaComunicadorFactory = new VisaComunicadorFactory();
        ComunicadorFactory mastercardComunicadorFactory = new MastercardComunicadorFactory();

        String transacaoVisa = "Valor=560;Senha=123";
        Emissor emissorVisa = visaComunicadorFactory.createEmissor();
        emissorVisa.envia(transacaoVisa);

        Receptor receptorVisa = visaComunicadorFactory.createReceptor();
        System.out.println(receptorVisa.recebe());

        System.out.println("--------------------------------");

        String transacaoMastercard = "Valor=1000;Senha=123456";
        Emissor emissorMastercard = mastercardComunicadorFactory.createEmissor();
        emissorMastercard.envia(transacaoMastercard);

        Receptor receptorMastercard = mastercardComunicadorFactory.createReceptor();
        System.out.println(receptorMastercard.recebe());
    }
}
