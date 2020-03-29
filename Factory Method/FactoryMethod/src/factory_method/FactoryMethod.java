package factory_method;

import factory_method.emissor.Emissor;
import factory_method.emissor.EmissorCreator;

public class FactoryMethod {
    public static void main(String[] args) {
        EmissorCreator creator = new EmissorCreator();

        Emissor emissorSMS = creator.create(EmissorCreator.SMS);
        emissorSMS.envia("Mensagem por SMS");

        Emissor emissorEMAIL = creator.create(EmissorCreator.EMAIL);
        emissorEMAIL.envia("Mensagem por EMAIL");

        Emissor emissorJMS = creator.create(EmissorCreator.JMS);
        emissorJMS.envia("Mensagem por JMS");
    }
}
