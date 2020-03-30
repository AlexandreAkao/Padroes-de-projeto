package chain_of_responsibility;

public abstract class BancoChain {

    protected BancoChain next;
    protected IDBancos identificadorDoBanco;

    public BancoChain(IDBancos id) {
        this.next = null;
        this.identificadorDoBanco = id;
    }

    public void setNext(BancoChain forma) {
        if (this.next == null) {
            this.next = forma;
        } else {
            this.next.setNext(forma);
        }
    }

    public void efetuarPagamento(IDBancos id) throws Exception {
        if (podeEfetuarPagamento(id)) {
            efetuaPagamento();
        } else {
            if (next == null) {
                throw new Exception("banco não cadastrado");
            }
            next.efetuarPagamento(id);
        }
    }

    private boolean podeEfetuarPagamento(IDBancos id) {
        return identificadorDoBanco == id;
    }

    protected abstract void efetuaPagamento();
}
