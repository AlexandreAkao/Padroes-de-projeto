package visitor;

import visitor.hospital.*;
import java.util.ArrayList;
import java.util.List;

public class Visitor {
    public static void main(String[] args) {
        CalculoTotalServico calculo = new CalculoTotalServico();
        List<Visitable> lista = getLista();

        for (Visitable visitable : lista) {
            visitable.accept(calculo);
        }

        System.out.println(calculo.getTotalServicosPrestados());
    }

    public static List<Visitable> getLista() {
        List<Visitable> lista = new ArrayList<>();

        lista.add(new Medico(10000));
        lista.add(new Medico(15000));
        lista.add(new Medico(10000));
        lista.add(new Secretaria(15000));
        lista.add(new Secretaria(10000));
        lista.add(new Enfermeiro(15000));
        lista.add(new Enfermeiro(15000));

        return lista;
    }
}
