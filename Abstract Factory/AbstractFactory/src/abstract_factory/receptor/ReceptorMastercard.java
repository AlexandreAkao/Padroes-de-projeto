package abstract_factory.receptor;

public class ReceptorMastercard implements Receptor {
    @Override
    public String recebe() {
        System.out.println("Recebendo mensagem da Mastercard");
        String mensagem = "Mensagem da Mastercard";
        return mensagem;
    }
}
