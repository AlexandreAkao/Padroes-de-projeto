package visitor.hospital;

public class Medico implements Visitable {
    private double totalServico;

    public Medico(double totalServico) {
        this.totalServico = totalServico;
    }

    public double getTotalServico() {
        return totalServico;
    }

    public void setTotalServico(double totalServico) {
        this.totalServico = totalServico;
    }

    @Override
    public void accept(VisitorHospital visitor) {
        visitor.visitar(this);
    }
}
