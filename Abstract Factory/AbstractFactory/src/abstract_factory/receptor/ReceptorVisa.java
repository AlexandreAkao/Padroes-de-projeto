package abstract_factory.receptor;

public class ReceptorVisa implements Receptor {
    @Override
    public String recebe() {
        System.out.println("Recebendo mensagem da Visa.");
        String mensagem = "Mensagem da Visa ";
        return mensagem;
    }
}
