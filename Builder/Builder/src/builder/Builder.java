package builder;

import builder.types.*;

public class Builder {
    public static void main(String[] args) {
        ItemPrincipal principal = new ItemPrincipal.Builder()
                .setCarne(Carne.FRANGO)
                .setHasSalada(false)
                .setHasMolho(false)
                .setPao(Pao.BATATA)
                .setQueijo(Queijo.MOZZARELLA)
                .build();

        RefeicaoCrianca refeicao = new RefeicaoCrianca.Builder()
                .setItemPrincipal(principal)
                .setBebida(Bebida.COCA)
                .setItemSecundario(ItemSecundario.BATATAFRITA)
                .setBrinquedo(Brinquedo.PIKACHU)
                .build();

        System.out.println(refeicao);
    }
}
