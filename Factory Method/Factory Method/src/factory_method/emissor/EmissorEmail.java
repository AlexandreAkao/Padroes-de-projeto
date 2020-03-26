package factory_method.emissor;

public class EmissorEmail implements Emissor {
    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando por email a mensagem: ");
        System.out.println(mensagem);
    }
}
