package factory_method.emissor;

public class EmissorJMS implements Emissor {
    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando por JMS a mensagem: ");
        System.out.println(mensagem);
    }
}
