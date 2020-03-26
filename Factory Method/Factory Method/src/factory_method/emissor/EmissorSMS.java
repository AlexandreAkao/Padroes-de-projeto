package factory_method.emissor;

public class EmissorSMS implements Emissor {
    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando por SMS a mensagem: ");
        System.out.println(mensagem);
    }
}
