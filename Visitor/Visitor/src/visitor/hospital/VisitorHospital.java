package visitor.hospital;

public interface VisitorHospital {
    void visitar(Secretaria secretaria);
    void visitar(Enfermeiro enfermeiro);
    void visitar(Medico medico);
}
