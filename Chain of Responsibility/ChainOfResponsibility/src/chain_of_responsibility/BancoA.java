package chain_of_responsibility;

public class BancoA extends BancoChain {
    public BancoA() {
        super(IDBancos.bancoA);
    }

    @Override
    protected void efetuaPagamento() {
        System.out.println("Pagamento efetuado no banco A");
    }
}
