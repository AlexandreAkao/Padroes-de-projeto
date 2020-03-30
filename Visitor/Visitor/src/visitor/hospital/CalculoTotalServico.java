package visitor.hospital;

public class CalculoTotalServico implements VisitorHospital {
    private double totalServicosPrestados;

    @Override
    public void visitar(Secretaria secretaria) {
        totalServicosPrestados += secretaria.getTotalServico() + 500;
    }

    @Override
    public void visitar(Enfermeiro enfermeiro) {
        totalServicosPrestados += enfermeiro.getTotalServico() + 500;
    }

    @Override
    public void visitar(Medico medico) {
        totalServicosPrestados += medico.getTotalServico() + 500;
    }

    public double getTotalServicosPrestados() {
        return totalServicosPrestados;
    }

    public void setTotalServicosPrestados(double totalServicosPrestados) {
        this.totalServicosPrestados = totalServicosPrestados;
    }
}
